databaseChangeLog = {

	changeSet(author: "sadhana (generated)", id: "1548748139844-1") {
		createTable(tableName: "race") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "city", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "cost", type: "DECIMAL(5,2)") {
				constraints(nullable: "false")
			}

			column(name: "distance", type: "DECIMAL(19,2)") {
				constraints(nullable: "false")
			}

			column(name: "maximum_runners", type: "INT") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(50)") {
				constraints(nullable: "false")
			}

			column(name: "start_date", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "state", type: "VARCHAR(2)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "sadhana (generated)", id: "1548748139844-2") {
		createTable(tableName: "registration") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "paid", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "race_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "runner_id", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "sadhana (generated)", id: "1548748139844-3") {
		createTable(tableName: "runner") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "address", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "city", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "date_of_birth", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "email", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "first_name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "gender", type: "VARCHAR(1)") {
				constraints(nullable: "false")
			}

			column(name: "last_name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "state", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "zipcode", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "sadhana (generated)", id: "1548748139844-4") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "login", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "password", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "role", type: "VARCHAR(5)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "sadhana (generated)", id: "1548748139844-7") {
		createIndex(indexName: "login", tableName: "user", unique: "true") {
			column(name: "login")
		}
	}

	changeSet(author: "sadhana (generated)", id: "1548748139844-5") {
		addForeignKeyConstraint(baseColumnNames: "race_id", baseTableName: "registration", baseTableSchemaName: "racetrack_dev", constraintName: "FKAF83E8B92866C08E", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "race", referencedTableSchemaName: "racetrack_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "sadhana (generated)", id: "1548748139844-6") {
		addForeignKeyConstraint(baseColumnNames: "runner_id", baseTableName: "registration", baseTableSchemaName: "racetrack_dev", constraintName: "FKAF83E8B91E08232E", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "runner", referencedTableSchemaName: "racetrack_dev", referencesUniqueColumn: "false")
	}
}
