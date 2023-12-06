package com.example

import com.example.component.Database
import com.example.component.Row
import com.example.component.Table
import com.example.component.column.*


object DatabaseManager {
    var database: Database? = null

    fun getInstance(): DatabaseManager = this

    fun populateTable() {
        val table = Table("Table"+ database!!.tables.size)
        table.apply {
            addColumn(TypeInteger("column1"))
            addColumn(TypeCharInvl("column2"))
            addColumn(TypeStringInvl("column3"))
        }

        val row1 = Row().apply {
            values.addAll(listOf("10", "a, b", "aa - bb"))
        }
        table.addRow(row1)

        val row2 = Row().apply {
            values.addAll(listOf("100", "c, d", "cc - dd"))
        }
        table.addRow(row2)

        database?.addTable(table)
    }

    fun createDB(name: String) {
        database = Database(name)
    }

    fun addTable(name: String?): Boolean {
        return if (!name.isNullOrEmpty()) {
            val table = Table(name)
            database?.addTable(table)
            true
        } else false
    }

    fun deleteTable(tableIndex: Int): Boolean {
        return if (tableIndex != -1) {
            database?.deleteTable(tableIndex)
            true
        } else false
    }

    fun addColumn(tableIndex: Int, columnName: String?, typeColumn: TypeColumn, min: String = "", max: String = ""): Boolean {
        if (columnName.isNullOrEmpty() || tableIndex == -1) return false

        val column: Column = when (typeColumn) {
            TypeColumn.INT -> TypeInteger(columnName)
            TypeColumn.REAL -> TypeReal(columnName)
            TypeColumn.STRING -> TypeString(columnName)
            TypeColumn.CHAR -> TypeChar(columnName)
            TypeColumn.CHARINVL -> TypeCharInvl(columnName)
            TypeColumn.STRINGINVL-> TypeStringInvl(columnName)
        }

        database?.tables?.get(tableIndex)?.addColumn(column)
        database?.tables?.get(tableIndex)?.rows?.forEach { row ->
            row.values.add("")
        }

        return true
    }

    fun deleteColumn(tableIndex: Int, columnIndex: Int): Boolean {
        return if (columnIndex != -1) {
            database?.tables?.get(tableIndex)?.deleteColumn(columnIndex)
            true
        } else false
    }

    fun addRow(tableIndex: Int, row: com.example.component.Row): Boolean {
        if (tableIndex != -1) {
            for (i in row.values.size until database!!.tables[tableIndex].columns.size) {
                row.values.add("")
            }
            database!!.tables[tableIndex].addRow(row)
            return true
        } else {
            return false
        }
    }

    fun deleteRow(tableIndex: Int, rowIndex: Int): Boolean {
        return if (rowIndex != -1) {
            database?.tables?.get(tableIndex)?.deleteRow(rowIndex)
            true
        } else false
    }

    fun updateCellValue(value: String, tableIndex: Int, columnIndex: Int, rowIndex: Int): Boolean {
        val table = database?.tables?.get(tableIndex)
        val column = table?.columns?.get(columnIndex)
        return if (column?.validate(value) == true) {
            val row = table.rows[rowIndex]
            row.setAt(columnIndex, value.trim())
            true
        } else false
    }

    fun mergeTables(tableName1: String, tableName2: String): Boolean {
        var table1: Table? = null
        var table2: Table? = null

        for (table in database!!.tables) {
            if (table.name == tableName1) {
                table1 = table
            } else if (table.name == tableName2) {
                table2 = table
            }
        }

        if (table1 == null || table2 == null) {
            return false
        }

        if (table1.columns.size != table2.columns.size) {
            return false
        }

        for (i in table1.columns.indices) {
            val column1 = table1.columns[i]
            val column2 = table2.columns[i]
            if (column1.name != column2.name || column1.type != column2.type) {
                return false
            }
        }

        val mergedTable = Table("MergedTable")

        for (column in table1.columns) {
            mergedTable.addColumn(column)
        }

        mergedTable.rows.addAll(table1.rows)
        mergedTable.rows.addAll(table2.rows)
        database!!.tables.add(mergedTable)

        return true
    }



}
