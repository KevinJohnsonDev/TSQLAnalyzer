// Generated from c:/Users/Kevin Johnson/source/repos/TSQLParser/AntlrCSharp/tsql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tsqlParser}.
 */
public interface tsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tsqlParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void enterTsql_file(tsqlParser.Tsql_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void exitTsql_file(tsqlParser.Tsql_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(tsqlParser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(tsqlParser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSql_clauses(tsqlParser.Sql_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSql_clauses(tsqlParser.Sql_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void enterSql_clause(tsqlParser.Sql_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void exitSql_clause(tsqlParser.Sql_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_clause(tsqlParser.Dml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_clause(tsqlParser.Dml_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clause(tsqlParser.Ddl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clause(tsqlParser.Ddl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(tsqlParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(tsqlParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(tsqlParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(tsqlParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(tsqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(tsqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goto_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(tsqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goto_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(tsqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(tsqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(tsqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(tsqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(tsqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throw_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(tsqlParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throw_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(tsqlParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code try_catch_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(tsqlParser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code try_catch_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(tsqlParser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code waitfor_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_statement(tsqlParser.Waitfor_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code waitfor_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_statement(tsqlParser.Waitfor_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(tsqlParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(tsqlParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(tsqlParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(tsqlParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code raiseerror_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseerror_statement(tsqlParser.Raiseerror_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code raiseerror_statement}
	 * labeled alternative in {@link tsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseerror_statement(tsqlParser.Raiseerror_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void enterAnother_statement(tsqlParser.Another_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void exitAnother_statement(tsqlParser.Another_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(tsqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(tsqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement_from(tsqlParser.Delete_statement_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement_from(tsqlParser.Delete_statement_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(tsqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(tsqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement_value(tsqlParser.Insert_statement_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement_value(tsqlParser.Insert_statement_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(tsqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(tsqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(tsqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(tsqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#where_clause_dml}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause_dml(tsqlParser.Where_clause_dmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#where_clause_dml}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause_dml(tsqlParser.Where_clause_dmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void enterOutput_clause(tsqlParser.Output_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void exitOutput_clause(tsqlParser.Output_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterOutput_dml_list_elem(tsqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitOutput_dml_list_elem(tsqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void enterOutput_column_name(tsqlParser.Output_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void exitOutput_column_name(tsqlParser.Output_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(tsqlParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(tsqlParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(tsqlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(tsqlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics(tsqlParser.Create_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics(tsqlParser.Create_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(tsqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(tsqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(tsqlParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(tsqlParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void enterView_attribute(tsqlParser.View_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void exitView_attribute(tsqlParser.View_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(tsqlParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(tsqlParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(tsqlParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(tsqlParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_optionspec(tsqlParser.Database_optionspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_optionspec(tsqlParser.Database_optionspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void enterAuto_option(tsqlParser.Auto_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void exitAuto_option(tsqlParser.Auto_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option(tsqlParser.Change_tracking_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option(tsqlParser.Change_tracking_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option_list(tsqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option_list(tsqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void enterContainment_option(tsqlParser.Containment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void exitContainment_option(tsqlParser.Containment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void enterCursor_option(tsqlParser.Cursor_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void exitCursor_option(tsqlParser.Cursor_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void enterDate_correlation_optimization_option(tsqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void exitDate_correlation_optimization_option(tsqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_encryption_option(tsqlParser.Db_encryption_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_encryption_option(tsqlParser.Db_encryption_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_state_option(tsqlParser.Db_state_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_state_option(tsqlParser.Db_state_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_update_option(tsqlParser.Db_update_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_update_option(tsqlParser.Db_update_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_user_access_option(tsqlParser.Db_user_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_user_access_option(tsqlParser.Db_user_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void enterDelayed_durability_option(tsqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void exitDelayed_durability_option(tsqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void enterExternal_access_option(tsqlParser.External_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void exitExternal_access_option(tsqlParser.External_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void enterMixed_page_allocation_option(tsqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void exitMixed_page_allocation_option(tsqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void enterParameterization_option(tsqlParser.Parameterization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void exitParameterization_option(tsqlParser.Parameterization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_option(tsqlParser.Recovery_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_option(tsqlParser.Recovery_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void enterService_broker_option(tsqlParser.Service_broker_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void exitService_broker_option(tsqlParser.Service_broker_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void enterSnapshot_option(tsqlParser.Snapshot_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void exitSnapshot_option(tsqlParser.Snapshot_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void enterSql_option(tsqlParser.Sql_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void exitSql_option(tsqlParser.Sql_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void enterTarget_recovery_time_option(tsqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void exitTarget_recovery_time_option(tsqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void enterTermination(tsqlParser.TerminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void exitTermination(tsqlParser.TerminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(tsqlParser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(tsqlParser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(tsqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(tsqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics(tsqlParser.Drop_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics(tsqlParser.Drop_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(tsqlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(tsqlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view(tsqlParser.Drop_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view(tsqlParser.Drop_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(tsqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(tsqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(tsqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(tsqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function_limited(tsqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function_limited(tsqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void enterOpenquery(tsqlParser.OpenqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void exitOpenquery(tsqlParser.OpenqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void enterOpendatasource(tsqlParser.OpendatasourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void exitOpendatasource(tsqlParser.OpendatasourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(tsqlParser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(tsqlParser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(tsqlParser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(tsqlParser.Cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(tsqlParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(tsqlParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg(tsqlParser.Execute_statement_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg(tsqlParser.Execute_statement_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void enterExecute_var_string(tsqlParser.Execute_var_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void exitExecute_var_string(tsqlParser.Execute_var_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_statement(tsqlParser.Security_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_statement(tsqlParser.Security_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void enterGrant_permission(tsqlParser.Grant_permissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void exitGrant_permission(tsqlParser.Grant_permissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(tsqlParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(tsqlParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_statement(tsqlParser.Transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_statement(tsqlParser.Transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void enterGo_statement(tsqlParser.Go_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void exitGo_statement(tsqlParser.Go_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_statement(tsqlParser.Use_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_statement(tsqlParser.Use_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_clause(tsqlParser.Execute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_clause(tsqlParser.Execute_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_local(tsqlParser.Declare_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_local(tsqlParser.Declare_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_definition(tsqlParser.Table_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_definition(tsqlParser.Table_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraints(tsqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraints(tsqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraint(tsqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraint(tsqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(tsqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(tsqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(tsqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(tsqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(tsqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(tsqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_options(tsqlParser.Index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_options(tsqlParser.Index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(tsqlParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(tsqlParser.Index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor(tsqlParser.Declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor(tsqlParser.Declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common(tsqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common(tsqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void enterFetch_cursor(tsqlParser.Fetch_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void exitFetch_cursor(tsqlParser.Fetch_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void enterSet_special(tsqlParser.Set_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void exitSet_special(tsqlParser.Set_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void enterConstant_LOCAL_ID(tsqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void exitConstant_LOCAL_ID(tsqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary_operator_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_expression(tsqlParser.Binary_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary_operator_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_expression(tsqlParser.Binary_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percentile_cont_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPercentile_cont_expression(tsqlParser.Percentile_cont_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percentile_cont_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPercentile_cont_expression(tsqlParser.Percentile_cont_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitive_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(tsqlParser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitive_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(tsqlParser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(tsqlParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(tsqlParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_operator_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_expression(tsqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_operator_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_expression(tsqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression(tsqlParser.Function_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression(tsqlParser.Function_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conversion_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConversion_expression(tsqlParser.Conversion_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conversion_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConversion_expression(tsqlParser.Conversion_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(tsqlParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(tsqlParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code column_ref_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterColumn_ref_expression(tsqlParser.Column_ref_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code column_ref_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitColumn_ref_expression(tsqlParser.Column_ref_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_agg_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString_agg_expression(tsqlParser.String_agg_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_agg_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString_agg_expression(tsqlParser.String_agg_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_expression(tsqlParser.Subquery_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_expression(tsqlParser.Subquery_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code over_clause_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause_expression(tsqlParser.Over_clause_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code over_clause_expression}
	 * labeled alternative in {@link tsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause_expression(tsqlParser.Over_clause_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(tsqlParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(tsqlParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(tsqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(tsqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void enterWith_expression(tsqlParser.With_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void exitWith_expression(tsqlParser.With_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(tsqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(tsqlParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_elem(tsqlParser.Update_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_elem(tsqlParser.Update_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_list(tsqlParser.Search_condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_list(tsqlParser.Search_condition_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code search_cond_or}
	 * labeled alternative in {@link tsqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_cond_or(tsqlParser.Search_cond_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code search_cond_or}
	 * labeled alternative in {@link tsqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_cond_or(tsqlParser.Search_cond_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code search_cond_pred}
	 * labeled alternative in {@link tsqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_cond_pred(tsqlParser.Search_cond_predContext ctx);
	/**
	 * Exit a parse tree produced by the {@code search_cond_pred}
	 * labeled alternative in {@link tsqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_cond_pred(tsqlParser.Search_cond_predContext ctx);
	/**
	 * Enter a parse tree produced by the {@code search_cond_and}
	 * labeled alternative in {@link tsqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_cond_and(tsqlParser.Search_cond_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code search_cond_and}
	 * labeled alternative in {@link tsqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_cond_and(tsqlParser.Search_cond_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_operator_expression3}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_expression3(tsqlParser.Unary_operator_expression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_operator_expression3}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_expression3(tsqlParser.Unary_operator_expression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_operator_expression2}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_expression2(tsqlParser.Unary_operator_expression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_operator_expression2}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_expression2(tsqlParser.Unary_operator_expression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code binary_operator_expression2}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_expression2(tsqlParser.Binary_operator_expression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code binary_operator_expression2}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_expression2(tsqlParser.Binary_operator_expression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code sublink_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSublink_expression(tsqlParser.Sublink_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sublink_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSublink_expression(tsqlParser.Sublink_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary_mod_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinary_mod_expression(tsqlParser.Binary_mod_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary_mod_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinary_mod_expression(tsqlParser.Binary_mod_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary_in_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinary_in_expression(tsqlParser.Binary_in_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary_in_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinary_in_expression(tsqlParser.Binary_in_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket_search_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBracket_search_expression(tsqlParser.Bracket_search_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket_search_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBracket_search_expression(tsqlParser.Bracket_search_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimal_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_expression(tsqlParser.Decimal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimal_expression}
	 * labeled alternative in {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_expression(tsqlParser.Decimal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket_query_expression}
	 * labeled alternative in {@link tsqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_query_expression(tsqlParser.Bracket_query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket_query_expression}
	 * labeled alternative in {@link tsqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_query_expression(tsqlParser.Bracket_query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code query_specification_expression}
	 * labeled alternative in {@link tsqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification_expression(tsqlParser.Query_specification_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code query_specification_expression}
	 * labeled alternative in {@link tsqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification_expression(tsqlParser.Query_specification_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code union_query_expression}
	 * labeled alternative in {@link tsqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnion_query_expression(tsqlParser.Union_query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code union_query_expression}
	 * labeled alternative in {@link tsqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnion_query_expression(tsqlParser.Union_query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#union_op}.
	 * @param ctx the parse tree
	 */
	void enterUnion_op(tsqlParser.Union_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#union_op}.
	 * @param ctx the parse tree
	 */
	void exitUnion_op(tsqlParser.Union_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification(tsqlParser.Query_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification(tsqlParser.Query_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#group_by_grouping_sets}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_grouping_sets(tsqlParser.Group_by_grouping_setsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#group_by_grouping_sets}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_grouping_sets(tsqlParser.Group_by_grouping_setsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#grouping_set}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_set(tsqlParser.Grouping_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#grouping_set}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_set(tsqlParser.Grouping_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void enterTop_clause(tsqlParser.Top_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void exitTop_clause(tsqlParser.Top_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#top_clause_dm}.
	 * @param ctx the parse tree
	 */
	void enterTop_clause_dm(tsqlParser.Top_clause_dmContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#top_clause_dm}.
	 * @param ctx the parse tree
	 */
	void exitTop_clause_dm(tsqlParser.Top_clause_dmContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(tsqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(tsqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetch_expression(tsqlParser.Fetch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetch_expression(tsqlParser.Fetch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_clause(tsqlParser.For_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_clause(tsqlParser.For_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void enterXml_common_directives(tsqlParser.Xml_common_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void exitXml_common_directives(tsqlParser.Xml_common_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(tsqlParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(tsqlParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_item(tsqlParser.Group_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_item(tsqlParser.Group_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void enterOption_clause(tsqlParser.Option_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void exitOption_clause(tsqlParser.Option_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(tsqlParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(tsqlParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void enterOptimize_for_arg(tsqlParser.Optimize_for_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void exitOptimize_for_arg(tsqlParser.Optimize_for_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(tsqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(tsqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elem(tsqlParser.Select_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elem(tsqlParser.Select_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void enterTable_sources(tsqlParser.Table_sourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void exitTable_sources(tsqlParser.Table_sourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cross_join}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterCross_join(tsqlParser.Cross_joinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cross_join}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitCross_join(tsqlParser.Cross_joinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_source_item_join}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item_join(tsqlParser.Table_source_item_joinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_source_item_join}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item_join(tsqlParser.Table_source_item_joinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standard_join}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterStandard_join(tsqlParser.Standard_joinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standard_join}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitStandard_join(tsqlParser.Standard_joinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apply_join}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterApply_join(tsqlParser.Apply_joinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apply_join}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitApply_join(tsqlParser.Apply_joinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket_table_source}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterBracket_table_source(tsqlParser.Bracket_table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket_table_source}
	 * labeled alternative in {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitBracket_table_source(tsqlParser.Bracket_table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_source_item_name}
	 * labeled alternative in {@link tsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item_name(tsqlParser.Table_source_item_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_source_item_name}
	 * labeled alternative in {@link tsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item_name(tsqlParser.Table_source_item_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_source_item_simple}
	 * labeled alternative in {@link tsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item_simple(tsqlParser.Table_source_item_simpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_source_item_simple}
	 * labeled alternative in {@link tsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item_simple(tsqlParser.Table_source_item_simpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_source_item_complex}
	 * labeled alternative in {@link tsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item_complex(tsqlParser.Table_source_item_complexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_source_item_complex}
	 * labeled alternative in {@link tsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item_complex(tsqlParser.Table_source_item_complexContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#tablesample_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablesample_clause(tsqlParser.Tablesample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#tablesample_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablesample_clause(tsqlParser.Tablesample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#sample_number}.
	 * @param ctx the parse tree
	 */
	void enterSample_number(tsqlParser.Sample_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#sample_number}.
	 * @param ctx the parse tree
	 */
	void exitSample_number(tsqlParser.Sample_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#repeat_seed}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_seed(tsqlParser.Repeat_seedContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#repeat_seed}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_seed(tsqlParser.Repeat_seedContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(tsqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(tsqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void enterChange_table(tsqlParser.Change_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void exitChange_table(tsqlParser.Change_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(tsqlParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(tsqlParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_name_with_hint(tsqlParser.Table_name_with_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_name_with_hint(tsqlParser.Table_name_with_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function(tsqlParser.Rowset_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function(tsqlParser.Rowset_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void enterBulk_option(tsqlParser.Bulk_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void exitBulk_option(tsqlParser.Bulk_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(tsqlParser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(tsqlParser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rank_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterRank_call(tsqlParser.Rank_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rank_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitRank_call(tsqlParser.Rank_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregate_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_call(tsqlParser.Aggregate_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregate_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_call(tsqlParser.Aggregate_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standard_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterStandard_call(tsqlParser.Standard_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standard_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitStandard_call(tsqlParser.Standard_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nvf_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterNvf_call(tsqlParser.Nvf_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nvf_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitNvf_call(tsqlParser.Nvf_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCast_call(tsqlParser.Cast_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCast_call(tsqlParser.Cast_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSimple_call(tsqlParser.Simple_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSimple_call(tsqlParser.Simple_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterExpression_call(tsqlParser.Expression_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_call}
	 * labeled alternative in {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitExpression_call(tsqlParser.Expression_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(tsqlParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(tsqlParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_search_condition_section(tsqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_search_condition_section(tsqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterWith_table_hints(tsqlParser.With_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitWith_table_hints(tsqlParser.With_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterInsert_with_table_hints(tsqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitInsert_with_table_hints(tsqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_hint(tsqlParser.Table_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_hint(tsqlParser.Table_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_value(tsqlParser.Index_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_value(tsqlParser.Index_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_list(tsqlParser.Column_alias_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_list(tsqlParser.Column_alias_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(tsqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(tsqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#a_star}.
	 * @param ctx the parse tree
	 */
	void enterA_star(tsqlParser.A_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#a_star}.
	 * @param ctx the parse tree
	 */
	void exitA_star(tsqlParser.A_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterTable_value_constructor(tsqlParser.Table_value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitTable_value_constructor(tsqlParser.Table_value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(tsqlParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(tsqlParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(tsqlParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(tsqlParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#next_value_for}.
	 * @param ctx the parse tree
	 */
	void enterNext_value_for(tsqlParser.Next_value_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#next_value_for}.
	 * @param ctx the parse tree
	 */
	void exitNext_value_for(tsqlParser.Next_value_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#next_value_for_function}.
	 * @param ctx the parse tree
	 */
	void enterNext_value_for_function(tsqlParser.Next_value_for_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#next_value_for_function}.
	 * @param ctx the parse tree
	 */
	void exitNext_value_for_function(tsqlParser.Next_value_for_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterRanking_windowed_function(tsqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitRanking_windowed_function(tsqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_windowed_function(tsqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_windowed_function(tsqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterAll_distinct(tsqlParser.All_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitAll_distinct(tsqlParser.All_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(tsqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(tsqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_range_clause(tsqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_range_clause(tsqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_extent(tsqlParser.Window_frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_extent(tsqlParser.Window_frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_bound(tsqlParser.Window_frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_bound(tsqlParser.Window_frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_preceding(tsqlParser.Window_frame_precedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_preceding(tsqlParser.Window_frame_precedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_following(tsqlParser.Window_frame_followingContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_following(tsqlParser.Window_frame_followingContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(tsqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(tsqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_filestream_option(tsqlParser.Database_filestream_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_filestream_option(tsqlParser.Database_filestream_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_file_spec(tsqlParser.Database_file_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_file_spec(tsqlParser.Database_file_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void enterFile_group(tsqlParser.File_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void exitFile_group(tsqlParser.File_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(tsqlParser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(tsqlParser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(tsqlParser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(tsqlParser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(tsqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(tsqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(tsqlParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(tsqlParser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#func_proc_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name(tsqlParser.Func_proc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#func_proc_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name(tsqlParser.Func_proc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void enterDdl_object(tsqlParser.Ddl_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void exitDdl_object(tsqlParser.Ddl_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(tsqlParser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(tsqlParser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(tsqlParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(tsqlParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(tsqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(tsqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void enterOn_off(tsqlParser.On_offContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void exitOn_off(tsqlParser.On_offContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void enterClustered(tsqlParser.ClusteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void exitClustered(tsqlParser.ClusteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(tsqlParser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(tsqlParser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void enterScalar_function_name(tsqlParser.Scalar_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void exitScalar_function_name(tsqlParser.Scalar_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(tsqlParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(tsqlParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(tsqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(tsqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(tsqlParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(tsqlParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#r_id}.
	 * @param ctx the parse tree
	 */
	void enterR_id(tsqlParser.R_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#r_id}.
	 * @param ctx the parse tree
	 */
	void exitR_id(tsqlParser.R_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void enterSimple_id(tsqlParser.Simple_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void exitSimple_id(tsqlParser.Simple_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(tsqlParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(tsqlParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(tsqlParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(tsqlParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void enterFile_size(tsqlParser.File_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void exitFile_size(tsqlParser.File_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_procedure(tsqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_procedure(tsqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_function(tsqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_function(tsqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_select(tsqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_select(tsqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_table(tsqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_table(tsqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_scalar(tsqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_scalar(tsqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_param(tsqlParser.Procedure_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_param(tsqlParser.Procedure_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_option(tsqlParser.Procedure_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_option(tsqlParser.Procedure_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#function_option}.
	 * @param ctx the parse tree
	 */
	void enterFunction_option(tsqlParser.Function_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#function_option}.
	 * @param ctx the parse tree
	 */
	void exitFunction_option(tsqlParser.Function_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#percentile_cont}.
	 * @param ctx the parse tree
	 */
	void enterPercentile_cont(tsqlParser.Percentile_contContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#percentile_cont}.
	 * @param ctx the parse tree
	 */
	void exitPercentile_cont(tsqlParser.Percentile_contContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#string_agg}.
	 * @param ctx the parse tree
	 */
	void enterString_agg(tsqlParser.String_aggContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#string_agg}.
	 * @param ctx the parse tree
	 */
	void exitString_agg(tsqlParser.String_aggContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(tsqlParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(tsqlParser.Data_typeContext ctx);
}