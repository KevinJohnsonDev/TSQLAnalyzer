// Generated from c:/Users/Kevin Johnson/source/repos/TSQLParser/AntlrCSharp/tsql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class tsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HADR_options=1, ADD=2, ALL=3, ALTER=4, AND=5, ANY=6, AS=7, ASC=8, AUTHORIZATION=9, 
		BACKUP=10, BEGIN=11, BETWEEN=12, BREAK=13, BROWSE=14, BULK=15, BY=16, 
		CALLED=17, CASCADE=18, CASE=19, CHANGETABLE=20, CHANGES=21, CHECK=22, 
		CHECKPOINT=23, CLOSE=24, CLUSTERED=25, COALESCE=26, COLLATE=27, COLUMN=28, 
		COMMIT=29, COMPUTE=30, CONSTRAINT=31, CONTAINMENT=32, CONTAINS=33, CONTAINSTABLE=34, 
		CONTINUE=35, CONVERT=36, CREATE=37, CROSS=38, CURRENT=39, CURRENT_DATE=40, 
		CURRENT_TIME=41, CURRENT_TIMESTAMP=42, CURRENT_USER=43, CURSOR=44, DATABASE=45, 
		DBCC=46, DEALLOCATE=47, DECLARE=48, DEFAULT=49, DELETE=50, DENY=51, DESC=52, 
		DISK=53, DISTINCT=54, DISTRIBUTED=55, DOUBLE=56, DROP=57, DUMP=58, ELSE=59, 
		END=60, ERRLVL=61, ESCAPE=62, EXCEPT=63, EXECUTE=64, EXISTS=65, EXIT=66, 
		EXTERNAL=67, FETCH=68, FILE=69, FILENAME=70, FILLFACTOR=71, FOR=72, FORCESEEK=73, 
		FOREIGN=74, FREETEXT=75, FREETEXTTABLE=76, FROM=77, FULL=78, FUNCTION=79, 
		GOTO=80, GRANT=81, GROUP=82, HAVING=83, IDENTITY=84, IDENTITYCOL=85, IDENTITY_INSERT=86, 
		IIF=87, IF=88, IN=89, INDEX=90, INNER=91, INSERT=92, INTERSECT=93, INTO=94, 
		IS=95, JOIN=96, KEY=97, KILL=98, LEFT=99, LIKE=100, LINENO=101, LOAD=102, 
		LOG=103, MERGE=104, NATIONAL=105, NEXT=106, NOCHECK=107, NONCLUSTERED=108, 
		NONE=109, NOT=110, NULL=111, NULLIF=112, NUMERIC=113, OF=114, OFF=115, 
		OFFSETS=116, ON=117, OPEN=118, OPENDATASOURCE=119, OPENQUERY=120, OPENROWSET=121, 
		OPENXML=122, OPTION=123, OR=124, ORDER=125, OUTER=126, OVER=127, PARTIAL=128, 
		PERCENT=129, PIVOT=130, PLAN=131, PRECISION=132, PRIMARY=133, PRINT=134, 
		PROC=135, PROCEDURE=136, PUBLIC=137, RAISERROR=138, READ=139, READTEXT=140, 
		RECONFIGURE=141, REFERENCES=142, REPLICATION=143, RESTORE=144, RESTRICT=145, 
		RETURN=146, RETURNS=147, REVERT=148, REVOKE=149, RIGHT=150, ROLLBACK=151, 
		ROWCOUNT=152, ROWGUIDCOL=153, RULE=154, SAVE=155, SCHEMA=156, SECURITYAUDIT=157, 
		SELECT=158, SEMANTICKEYPHRASETABLE=159, SEMANTICSIMILARITYDETAILSTABLE=160, 
		SEMANTICSIMILARITYTABLE=161, SESSION_USER=162, SET=163, SETUSER=164, SHUTDOWN=165, 
		SOME=166, STATISTICS=167, SYSTEM=168, SYSTEM_USER=169, TABLE=170, TABLESAMPLE=171, 
		TEXTSIZE=172, THEN=173, TO=174, TOP=175, TRAN=176, TRANSACTION=177, TRIGGER=178, 
		TRUNCATE=179, TRY_CAST=180, TRY_CONVERT=181, TRY_PARSE=182, TSEQUAL=183, 
		UNION=184, UNIQUE=185, UNPIVOT=186, UPDATE=187, UPDATETEXT=188, USE=189, 
		USER=190, VALUES=191, VALUE=192, VARYING=193, VIEW=194, WAITFOR=195, WHEN=196, 
		WHERE=197, WHILE=198, WITH=199, WITHIN=200, WRITETEXT=201, ABSOLUTE=202, 
		AFTER=203, ALLOWED=204, ALLOW_SNAPSHOT_ISOLATION=205, ANSI_NULLS=206, 
		ANSI_NULL_DEFAULT=207, ANSI_PADDING=208, ANSI_WARNINGS=209, APPLY=210, 
		ARITHABORT=211, AT=212, AUTO=213, AUTO_CLEANUP=214, AUTO_CLOSE=215, AUTO_CREATE_STATISTICS=216, 
		AUTO_SHRINK=217, AUTO_UPDATE_STATISTICS=218, AUTO_UPDATE_STATISTICS_ASYNC=219, 
		AVG=220, BASE64=221, BIGINT=222, BINARY_CHECKSUM=223, BULK_LOGGED=224, 
		CALLER=225, CAST=226, CATCH=227, CHANGE_RETENTION=228, CHANGE_TRACKING=229, 
		CHECKSUM=230, CHECKSUM_AGG=231, COMMITTED=232, COMPATIBILITY_LEVEL=233, 
		CONCAT=234, CONCAT_NULL_YIELDS_NULL=235, CONTROL=236, COOKIE=237, COUNT=238, 
		COUNT_BIG=239, CUBE=240, CURSOR_CLOSE_ON_COMMIT=241, CURSOR_DEFAULT=242, 
		DATE=243, DATEADD=244, DATEDIFF=245, DATENAME=246, DATEPART=247, DATETIME2=248, 
		DATETIMEOFFSETFROMPARTS=249, DATE_CORRELATION_OPTIMIZATION=250, DAYS=251, 
		DB_CHAINING=252, DEFAULT_FULLTEXT_LANGUAGE=253, DEFAULT_LANGUAGE=254, 
		DELAY=255, DELAYED_DURABILITY=256, DELETED=257, DENSE_RANK=258, DIRECTORY_NAME=259, 
		DISABLE=260, DISABLED=261, DISABLE_BROKER=262, DYNAMIC=263, EMERGENCY=264, 
		ENABLE_BROKER=265, ENCRYPTION=266, ERROR_BROKER_CONVERSATIONS=267, EXPAND=268, 
		FAST=269, FAST_FORWARD=270, FILEGROUP=271, FILEGROWTH=272, FILESTREAM=273, 
		FIRST=274, FIRST_VALUE=275, FOLLOWING=276, FORCE=277, FORCED=278, FORWARD_ONLY=279, 
		FULLSCAN=280, GB=281, GLOBAL=282, GO=283, GROUPING=284, GROUPING_ID=285, 
		HADR=286, HASH=287, HONOR_BROKER_PRIORITY=288, HOURS=289, IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX=290, 
		IMMEDIATE=291, IMPERSONATE=292, INCREMENTAL=293, INPUT=294, INT=295, INSENSITIVE=296, 
		INSERTED=297, ISOLATION=298, IO=299, KB=300, KEEP=301, KEEPFIXED=302, 
		KEYSET=303, LAG=304, LAST=305, LAST_VALUE=306, LEAD=307, LEVEL=308, LOCAL=309, 
		LOCK_ESCALATION=310, LOGIN=311, LOOP=312, MARK=313, MAX=314, MAXDOP=315, 
		MAXRECURSION=316, MAXSIZE=317, MB=318, MEMORY_OPTIMIZED_DATA=319, MIN=320, 
		MINUTES=321, MIN_ACTIVE_ROWVERSION=322, MIXED_PAGE_ALLOCATION=323, MODIFY=324, 
		MULTI_USER=325, NAME=326, NESTED_TRIGGERS=327, NEW_BROKER=328, NOCOUNT=329, 
		NOEXPAND=330, NON_TRANSACTED_ACCESS=331, NORECOMPUTE=332, NO_WAIT=333, 
		NTILE=334, NUMBER=335, NUMERIC_ROUNDABORT=336, OFFLINE=337, OFFSET=338, 
		ONLINE=339, ONLY=340, OPTIMISTIC=341, OPTIMIZE=342, OUT=343, OUTPUT=344, 
		OWNER=345, PAGE_VERIFY=346, PARAMETERIZATION=347, PARSE=348, PARTITION=349, 
		PATH=350, PERCENTILE_CONT=351, PRECEDING=352, PRIOR=353, PRIVILEGES=354, 
		QUOTED_IDENTIFIER=355, RANGE=356, RANK=357, READONLY=358, READ_COMMITTED_SNAPSHOT=359, 
		READ_ONLY=360, READ_WRITE=361, RECOMPILE=362, RECOVERY=363, RECURSIVE_TRIGGERS=364, 
		RELATIVE=365, REMOTE=366, REPEATABLE=367, RESTRICTED_USER=368, ROBUST=369, 
		ROLLUP=370, ROOT=371, ROW=372, ROWGUID=373, ROWS=374, ROW_NUMBER=375, 
		SAMPLE=376, SCHEMABINDING=377, SCROLL=378, SCROLL_LOCKS=379, SECONDS=380, 
		SELF=381, SERIALIZABLE=382, SETS=383, SHOWPLAN=384, SIMPLE=385, SINGLE_USER=386, 
		SIZE=387, SMALLINT=388, SNAPSHOT=389, SPATIAL_WINDOW_MAX_CELLS=390, STATIC=391, 
		STATS_STREAM=392, STDEV=393, STDEVP=394, STRING_AGG=395, STRING_SPLIT=396, 
		SUM=397, TAKE=398, TARGET_RECOVERY_TIME=399, TB=400, TEXTIMAGE_ON=401, 
		THROW=402, TIES=403, TIME=404, TINYINT=405, TORN_PAGE_DETECTION=406, TRANSFORM_NOISE_WORDS=407, 
		TRUSTWORTHY=408, TRY=409, TWO_DIGIT_YEAR_CUTOFF=410, TYPE=411, TYPE_WARNING=412, 
		UNBOUNDED=413, UNCOMMITTED=414, UNKNOWN=415, UNLIMITED=416, USING=417, 
		VAR=418, VARP=419, VIEWS=420, VIEW_METADATA=421, WORK=422, XML=423, XMLNAMESPACES=424, 
		ZONE=425, DOLLAR_ACTION=426, SPACE=427, COMMENT=428, LINE_COMMENT=429, 
		DOUBLE_QUOTE_ID=430, SQUARE_BRACKET_ID=431, LOCAL_ID=432, DECIMAL=433, 
		ID=434, STRING=435, BINARY=436, FLOAT=437, REAL=438, EQUAL=439, GREATER=440, 
		LESS=441, EXCLAMATION=442, PLUS_ASSIGN=443, MINUS_ASSIGN=444, MULT_ASSIGN=445, 
		DIV_ASSIGN=446, MOD_ASSIGN=447, AND_ASSIGN=448, XOR_ASSIGN=449, OR_ASSIGN=450, 
		DOT=451, UNDERLINE=452, AT_SIGN=453, SHARP=454, DOLLAR=455, LR_BRACKET=456, 
		RR_BRACKET=457, COMMA=458, SEMI=459, COLON=460, STAR=461, DIVIDE=462, 
		MODULE=463, PLUS=464, MINUS=465, BIT_NOT=466, BIT_OR=467, BIT_AND=468, 
		BIT_XOR=469;
	public static final int
		RULE_tsql_file = 0, RULE_batch = 1, RULE_sql_clauses = 2, RULE_sql_clause = 3, 
		RULE_dml_clause = 4, RULE_ddl_clause = 5, RULE_cfl_statement = 6, RULE_another_statement = 7, 
		RULE_delete_statement = 8, RULE_delete_statement_from = 9, RULE_insert_statement = 10, 
		RULE_insert_statement_value = 11, RULE_select_statement = 12, RULE_update_statement = 13, 
		RULE_where_clause_dml = 14, RULE_output_clause = 15, RULE_output_dml_list_elem = 16, 
		RULE_output_column_name = 17, RULE_create_database = 18, RULE_create_index = 19, 
		RULE_create_statistics = 20, RULE_create_table = 21, RULE_create_view = 22, 
		RULE_view_attribute = 23, RULE_alter_table = 24, RULE_alter_database = 25, 
		RULE_database_optionspec = 26, RULE_auto_option = 27, RULE_change_tracking_option = 28, 
		RULE_change_tracking_option_list = 29, RULE_containment_option = 30, RULE_cursor_option = 31, 
		RULE_date_correlation_optimization_option = 32, RULE_db_encryption_option = 33, 
		RULE_db_state_option = 34, RULE_db_update_option = 35, RULE_db_user_access_option = 36, 
		RULE_delayed_durability_option = 37, RULE_external_access_option = 38, 
		RULE_mixed_page_allocation_option = 39, RULE_parameterization_option = 40, 
		RULE_recovery_option = 41, RULE_service_broker_option = 42, RULE_snapshot_option = 43, 
		RULE_sql_option = 44, RULE_target_recovery_time_option = 45, RULE_termination = 46, 
		RULE_drop_index = 47, RULE_drop_procedure = 48, RULE_drop_statistics = 49, 
		RULE_drop_table = 50, RULE_drop_view = 51, RULE_create_type = 52, RULE_drop_type = 53, 
		RULE_rowset_function_limited = 54, RULE_openquery = 55, RULE_opendatasource = 56, 
		RULE_declare_statement = 57, RULE_cursor_statement = 58, RULE_execute_statement = 59, 
		RULE_execute_statement_arg = 60, RULE_execute_var_string = 61, RULE_security_statement = 62, 
		RULE_grant_permission = 63, RULE_set_statement = 64, RULE_transaction_statement = 65, 
		RULE_go_statement = 66, RULE_use_statement = 67, RULE_execute_clause = 68, 
		RULE_declare_local = 69, RULE_table_type_definition = 70, RULE_column_def_table_constraints = 71, 
		RULE_column_def_table_constraint = 72, RULE_column_definition = 73, RULE_column_constraint = 74, 
		RULE_table_constraint = 75, RULE_index_options = 76, RULE_index_option = 77, 
		RULE_declare_cursor = 78, RULE_declare_set_cursor_common = 79, RULE_fetch_cursor = 80, 
		RULE_set_special = 81, RULE_constant_LOCAL_ID = 82, RULE_expression = 83, 
		RULE_constant_expression = 84, RULE_subquery = 85, RULE_with_expression = 86, 
		RULE_common_table_expression = 87, RULE_update_elem = 88, RULE_search_condition_list = 89, 
		RULE_search_condition = 90, RULE_predicate = 91, RULE_query_expression = 92, 
		RULE_union_op = 93, RULE_query_specification = 94, RULE_group_by_grouping_sets = 95, 
		RULE_grouping_set = 96, RULE_top_clause = 97, RULE_top_clause_dm = 98, 
		RULE_order_by_clause = 99, RULE_fetch_expression = 100, RULE_for_clause = 101, 
		RULE_xml_common_directives = 102, RULE_order_by_expression = 103, RULE_group_by_item = 104, 
		RULE_option_clause = 105, RULE_option = 106, RULE_optimize_for_arg = 107, 
		RULE_select_list = 108, RULE_select_list_elem = 109, RULE_table_sources = 110, 
		RULE_table_source = 111, RULE_table_source_item = 112, RULE_tablesample_clause = 113, 
		RULE_sample_number = 114, RULE_repeat_seed = 115, RULE_table_alias = 116, 
		RULE_change_table = 117, RULE_join_type = 118, RULE_table_name_with_hint = 119, 
		RULE_rowset_function = 120, RULE_bulk_option = 121, RULE_derived_table = 122, 
		RULE_function_call = 123, RULE_switch_section = 124, RULE_switch_search_condition_section = 125, 
		RULE_with_table_hints = 126, RULE_insert_with_table_hints = 127, RULE_table_hint = 128, 
		RULE_index_value = 129, RULE_column_alias_list = 130, RULE_column_alias = 131, 
		RULE_a_star = 132, RULE_table_value_constructor = 133, RULE_expression_list = 134, 
		RULE_value_list = 135, RULE_next_value_for = 136, RULE_next_value_for_function = 137, 
		RULE_ranking_windowed_function = 138, RULE_aggregate_windowed_function = 139, 
		RULE_all_distinct = 140, RULE_over_clause = 141, RULE_row_or_range_clause = 142, 
		RULE_window_frame_extent = 143, RULE_window_frame_bound = 144, RULE_window_frame_preceding = 145, 
		RULE_window_frame_following = 146, RULE_create_database_option = 147, 
		RULE_database_filestream_option = 148, RULE_database_file_spec = 149, 
		RULE_file_group = 150, RULE_file_spec = 151, RULE_full_table_name = 152, 
		RULE_table_name = 153, RULE_simple_name = 154, RULE_func_proc_name = 155, 
		RULE_ddl_object = 156, RULE_full_column_name = 157, RULE_column_name_list = 158, 
		RULE_cursor_name = 159, RULE_on_off = 160, RULE_clustered = 161, RULE_null_notnull = 162, 
		RULE_scalar_function_name = 163, RULE_default_value = 164, RULE_constant = 165, 
		RULE_sign = 166, RULE_r_id = 167, RULE_simple_id = 168, RULE_comparison_operator = 169, 
		RULE_assignment_operator = 170, RULE_file_size = 171, RULE_create_or_alter_procedure = 172, 
		RULE_create_or_alter_function = 173, RULE_func_body_returns_select = 174, 
		RULE_func_body_returns_table = 175, RULE_func_body_returns_scalar = 176, 
		RULE_procedure_param = 177, RULE_procedure_option = 178, RULE_function_option = 179, 
		RULE_percentile_cont = 180, RULE_string_agg = 181, RULE_data_type = 182;
	private static String[] makeRuleNames() {
		return new String[] {
			"tsql_file", "batch", "sql_clauses", "sql_clause", "dml_clause", "ddl_clause", 
			"cfl_statement", "another_statement", "delete_statement", "delete_statement_from", 
			"insert_statement", "insert_statement_value", "select_statement", "update_statement", 
			"where_clause_dml", "output_clause", "output_dml_list_elem", "output_column_name", 
			"create_database", "create_index", "create_statistics", "create_table", 
			"create_view", "view_attribute", "alter_table", "alter_database", "database_optionspec", 
			"auto_option", "change_tracking_option", "change_tracking_option_list", 
			"containment_option", "cursor_option", "date_correlation_optimization_option", 
			"db_encryption_option", "db_state_option", "db_update_option", "db_user_access_option", 
			"delayed_durability_option", "external_access_option", "mixed_page_allocation_option", 
			"parameterization_option", "recovery_option", "service_broker_option", 
			"snapshot_option", "sql_option", "target_recovery_time_option", "termination", 
			"drop_index", "drop_procedure", "drop_statistics", "drop_table", "drop_view", 
			"create_type", "drop_type", "rowset_function_limited", "openquery", "opendatasource", 
			"declare_statement", "cursor_statement", "execute_statement", "execute_statement_arg", 
			"execute_var_string", "security_statement", "grant_permission", "set_statement", 
			"transaction_statement", "go_statement", "use_statement", "execute_clause", 
			"declare_local", "table_type_definition", "column_def_table_constraints", 
			"column_def_table_constraint", "column_definition", "column_constraint", 
			"table_constraint", "index_options", "index_option", "declare_cursor", 
			"declare_set_cursor_common", "fetch_cursor", "set_special", "constant_LOCAL_ID", 
			"expression", "constant_expression", "subquery", "with_expression", "common_table_expression", 
			"update_elem", "search_condition_list", "search_condition", "predicate", 
			"query_expression", "union_op", "query_specification", "group_by_grouping_sets", 
			"grouping_set", "top_clause", "top_clause_dm", "order_by_clause", "fetch_expression", 
			"for_clause", "xml_common_directives", "order_by_expression", "group_by_item", 
			"option_clause", "option", "optimize_for_arg", "select_list", "select_list_elem", 
			"table_sources", "table_source", "table_source_item", "tablesample_clause", 
			"sample_number", "repeat_seed", "table_alias", "change_table", "join_type", 
			"table_name_with_hint", "rowset_function", "bulk_option", "derived_table", 
			"function_call", "switch_section", "switch_search_condition_section", 
			"with_table_hints", "insert_with_table_hints", "table_hint", "index_value", 
			"column_alias_list", "column_alias", "a_star", "table_value_constructor", 
			"expression_list", "value_list", "next_value_for", "next_value_for_function", 
			"ranking_windowed_function", "aggregate_windowed_function", "all_distinct", 
			"over_clause", "row_or_range_clause", "window_frame_extent", "window_frame_bound", 
			"window_frame_preceding", "window_frame_following", "create_database_option", 
			"database_filestream_option", "database_file_spec", "file_group", "file_spec", 
			"full_table_name", "table_name", "simple_name", "func_proc_name", "ddl_object", 
			"full_column_name", "column_name_list", "cursor_name", "on_off", "clustered", 
			"null_notnull", "scalar_function_name", "default_value", "constant", 
			"sign", "r_id", "simple_id", "comparison_operator", "assignment_operator", 
			"file_size", "create_or_alter_procedure", "create_or_alter_function", 
			"func_body_returns_select", "func_body_returns_table", "func_body_returns_scalar", 
			"procedure_param", "procedure_option", "function_option", "percentile_cont", 
			"string_agg", "data_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'='", "'>'", "'<'", "'!'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'^='", "'|='", "'.'", 
			"'_'", "'@'", "'#'", "'$'", "'('", "')'", "','", "';'", "':'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HADR_options", "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", 
			"AUTHORIZATION", "BACKUP", "BEGIN", "BETWEEN", "BREAK", "BROWSE", "BULK", 
			"BY", "CALLED", "CASCADE", "CASE", "CHANGETABLE", "CHANGES", "CHECK", 
			"CHECKPOINT", "CLOSE", "CLUSTERED", "COALESCE", "COLLATE", "COLUMN", 
			"COMMIT", "COMPUTE", "CONSTRAINT", "CONTAINMENT", "CONTAINS", "CONTAINSTABLE", 
			"CONTINUE", "CONVERT", "CREATE", "CROSS", "CURRENT", "CURRENT_DATE", 
			"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", "DATABASE", 
			"DBCC", "DEALLOCATE", "DECLARE", "DEFAULT", "DELETE", "DENY", "DESC", 
			"DISK", "DISTINCT", "DISTRIBUTED", "DOUBLE", "DROP", "DUMP", "ELSE", 
			"END", "ERRLVL", "ESCAPE", "EXCEPT", "EXECUTE", "EXISTS", "EXIT", "EXTERNAL", 
			"FETCH", "FILE", "FILENAME", "FILLFACTOR", "FOR", "FORCESEEK", "FOREIGN", 
			"FREETEXT", "FREETEXTTABLE", "FROM", "FULL", "FUNCTION", "GOTO", "GRANT", 
			"GROUP", "HAVING", "IDENTITY", "IDENTITYCOL", "IDENTITY_INSERT", "IIF", 
			"IF", "IN", "INDEX", "INNER", "INSERT", "INTERSECT", "INTO", "IS", "JOIN", 
			"KEY", "KILL", "LEFT", "LIKE", "LINENO", "LOAD", "LOG", "MERGE", "NATIONAL", 
			"NEXT", "NOCHECK", "NONCLUSTERED", "NONE", "NOT", "NULL", "NULLIF", "NUMERIC", 
			"OF", "OFF", "OFFSETS", "ON", "OPEN", "OPENDATASOURCE", "OPENQUERY", 
			"OPENROWSET", "OPENXML", "OPTION", "OR", "ORDER", "OUTER", "OVER", "PARTIAL", 
			"PERCENT", "PIVOT", "PLAN", "PRECISION", "PRIMARY", "PRINT", "PROC", 
			"PROCEDURE", "PUBLIC", "RAISERROR", "READ", "READTEXT", "RECONFIGURE", 
			"REFERENCES", "REPLICATION", "RESTORE", "RESTRICT", "RETURN", "RETURNS", 
			"REVERT", "REVOKE", "RIGHT", "ROLLBACK", "ROWCOUNT", "ROWGUIDCOL", "RULE", 
			"SAVE", "SCHEMA", "SECURITYAUDIT", "SELECT", "SEMANTICKEYPHRASETABLE", 
			"SEMANTICSIMILARITYDETAILSTABLE", "SEMANTICSIMILARITYTABLE", "SESSION_USER", 
			"SET", "SETUSER", "SHUTDOWN", "SOME", "STATISTICS", "SYSTEM", "SYSTEM_USER", 
			"TABLE", "TABLESAMPLE", "TEXTSIZE", "THEN", "TO", "TOP", "TRAN", "TRANSACTION", 
			"TRIGGER", "TRUNCATE", "TRY_CAST", "TRY_CONVERT", "TRY_PARSE", "TSEQUAL", 
			"UNION", "UNIQUE", "UNPIVOT", "UPDATE", "UPDATETEXT", "USE", "USER", 
			"VALUES", "VALUE", "VARYING", "VIEW", "WAITFOR", "WHEN", "WHERE", "WHILE", 
			"WITH", "WITHIN", "WRITETEXT", "ABSOLUTE", "AFTER", "ALLOWED", "ALLOW_SNAPSHOT_ISOLATION", 
			"ANSI_NULLS", "ANSI_NULL_DEFAULT", "ANSI_PADDING", "ANSI_WARNINGS", "APPLY", 
			"ARITHABORT", "AT", "AUTO", "AUTO_CLEANUP", "AUTO_CLOSE", "AUTO_CREATE_STATISTICS", 
			"AUTO_SHRINK", "AUTO_UPDATE_STATISTICS", "AUTO_UPDATE_STATISTICS_ASYNC", 
			"AVG", "BASE64", "BIGINT", "BINARY_CHECKSUM", "BULK_LOGGED", "CALLER", 
			"CAST", "CATCH", "CHANGE_RETENTION", "CHANGE_TRACKING", "CHECKSUM", "CHECKSUM_AGG", 
			"COMMITTED", "COMPATIBILITY_LEVEL", "CONCAT", "CONCAT_NULL_YIELDS_NULL", 
			"CONTROL", "COOKIE", "COUNT", "COUNT_BIG", "CUBE", "CURSOR_CLOSE_ON_COMMIT", 
			"CURSOR_DEFAULT", "DATE", "DATEADD", "DATEDIFF", "DATENAME", "DATEPART", 
			"DATETIME2", "DATETIMEOFFSETFROMPARTS", "DATE_CORRELATION_OPTIMIZATION", 
			"DAYS", "DB_CHAINING", "DEFAULT_FULLTEXT_LANGUAGE", "DEFAULT_LANGUAGE", 
			"DELAY", "DELAYED_DURABILITY", "DELETED", "DENSE_RANK", "DIRECTORY_NAME", 
			"DISABLE", "DISABLED", "DISABLE_BROKER", "DYNAMIC", "EMERGENCY", "ENABLE_BROKER", 
			"ENCRYPTION", "ERROR_BROKER_CONVERSATIONS", "EXPAND", "FAST", "FAST_FORWARD", 
			"FILEGROUP", "FILEGROWTH", "FILESTREAM", "FIRST", "FIRST_VALUE", "FOLLOWING", 
			"FORCE", "FORCED", "FORWARD_ONLY", "FULLSCAN", "GB", "GLOBAL", "GO", 
			"GROUPING", "GROUPING_ID", "HADR", "HASH", "HONOR_BROKER_PRIORITY", "HOURS", 
			"IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX", "IMMEDIATE", "IMPERSONATE", 
			"INCREMENTAL", "INPUT", "INT", "INSENSITIVE", "INSERTED", "ISOLATION", 
			"IO", "KB", "KEEP", "KEEPFIXED", "KEYSET", "LAG", "LAST", "LAST_VALUE", 
			"LEAD", "LEVEL", "LOCAL", "LOCK_ESCALATION", "LOGIN", "LOOP", "MARK", 
			"MAX", "MAXDOP", "MAXRECURSION", "MAXSIZE", "MB", "MEMORY_OPTIMIZED_DATA", 
			"MIN", "MINUTES", "MIN_ACTIVE_ROWVERSION", "MIXED_PAGE_ALLOCATION", "MODIFY", 
			"MULTI_USER", "NAME", "NESTED_TRIGGERS", "NEW_BROKER", "NOCOUNT", "NOEXPAND", 
			"NON_TRANSACTED_ACCESS", "NORECOMPUTE", "NO_WAIT", "NTILE", "NUMBER", 
			"NUMERIC_ROUNDABORT", "OFFLINE", "OFFSET", "ONLINE", "ONLY", "OPTIMISTIC", 
			"OPTIMIZE", "OUT", "OUTPUT", "OWNER", "PAGE_VERIFY", "PARAMETERIZATION", 
			"PARSE", "PARTITION", "PATH", "PERCENTILE_CONT", "PRECEDING", "PRIOR", 
			"PRIVILEGES", "QUOTED_IDENTIFIER", "RANGE", "RANK", "READONLY", "READ_COMMITTED_SNAPSHOT", 
			"READ_ONLY", "READ_WRITE", "RECOMPILE", "RECOVERY", "RECURSIVE_TRIGGERS", 
			"RELATIVE", "REMOTE", "REPEATABLE", "RESTRICTED_USER", "ROBUST", "ROLLUP", 
			"ROOT", "ROW", "ROWGUID", "ROWS", "ROW_NUMBER", "SAMPLE", "SCHEMABINDING", 
			"SCROLL", "SCROLL_LOCKS", "SECONDS", "SELF", "SERIALIZABLE", "SETS", 
			"SHOWPLAN", "SIMPLE", "SINGLE_USER", "SIZE", "SMALLINT", "SNAPSHOT", 
			"SPATIAL_WINDOW_MAX_CELLS", "STATIC", "STATS_STREAM", "STDEV", "STDEVP", 
			"STRING_AGG", "STRING_SPLIT", "SUM", "TAKE", "TARGET_RECOVERY_TIME", 
			"TB", "TEXTIMAGE_ON", "THROW", "TIES", "TIME", "TINYINT", "TORN_PAGE_DETECTION", 
			"TRANSFORM_NOISE_WORDS", "TRUSTWORTHY", "TRY", "TWO_DIGIT_YEAR_CUTOFF", 
			"TYPE", "TYPE_WARNING", "UNBOUNDED", "UNCOMMITTED", "UNKNOWN", "UNLIMITED", 
			"USING", "VAR", "VARP", "VIEWS", "VIEW_METADATA", "WORK", "XML", "XMLNAMESPACES", 
			"ZONE", "DOLLAR_ACTION", "SPACE", "COMMENT", "LINE_COMMENT", "DOUBLE_QUOTE_ID", 
			"SQUARE_BRACKET_ID", "LOCAL_ID", "DECIMAL", "ID", "STRING", "BINARY", 
			"FLOAT", "REAL", "EQUAL", "GREATER", "LESS", "EXCLAMATION", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
			"XOR_ASSIGN", "OR_ASSIGN", "DOT", "UNDERLINE", "AT_SIGN", "SHARP", "DOLLAR", 
			"LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "COLON", "STAR", "DIVIDE", 
			"MODULE", "PLUS", "MINUS", "BIT_NOT", "BIT_OR", "BIT_AND", "BIT_XOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "tsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tsql_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tsqlParser.EOF, 0); }
		public List<BatchContext> batch() {
			return getRuleContexts(BatchContext.class);
		}
		public BatchContext batch(int i) {
			return getRuleContext(BatchContext.class,i);
		}
		public Tsql_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsql_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTsql_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTsql_file(this);
		}
	}

	public final Tsql_fileContext tsql_file() throws RecognitionException {
		Tsql_fileContext _localctx = new Tsql_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tsql_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 145663472800114704L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18581746794824209L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 2639109382195007505L) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & 6485222866395631635L) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & -6755399582093674263L) != 0) || ((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & -776873741480755605L) != 0) || ((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & -9223369416933306605L) != 0)) {
				{
				{
				setState(366);
				batch();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BatchContext extends ParserRuleContext {
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public Go_statementContext go_statement() {
			return getRuleContext(Go_statementContext.class,0);
		}
		public BatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBatch(this);
		}
	}

	public final BatchContext batch() throws RecognitionException {
		BatchContext _localctx = new BatchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_batch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			sql_clauses();
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(375);
				go_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_clausesContext extends ParserRuleContext {
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(tsqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(tsqlParser.SEMI, i);
		}
		public Sql_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSql_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSql_clauses(this);
		}
	}

	public final Sql_clausesContext sql_clauses() throws RecognitionException {
		Sql_clausesContext _localctx = new Sql_clausesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_clauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(378);
					sql_clause();
					setState(380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(379);
						match(SEMI);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(384); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_clauseContext extends ParserRuleContext {
		public Dml_clauseContext dml_clause() {
			return getRuleContext(Dml_clauseContext.class,0);
		}
		public Ddl_clauseContext ddl_clause() {
			return getRuleContext(Ddl_clauseContext.class,0);
		}
		public Cfl_statementContext cfl_statement() {
			return getRuleContext(Cfl_statementContext.class,0);
		}
		public Another_statementContext another_statement() {
			return getRuleContext(Another_statementContext.class,0);
		}
		public Sql_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSql_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSql_clause(this);
		}
	}

	public final Sql_clauseContext sql_clause() throws RecognitionException {
		Sql_clauseContext _localctx = new Sql_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_clause);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				dml_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				ddl_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				cfl_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				another_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dml_clauseContext extends ParserRuleContext {
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Dml_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDml_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDml_clause(this);
		}
	}

	public final Dml_clauseContext dml_clause() throws RecognitionException {
		Dml_clauseContext _localctx = new Dml_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dml_clause);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				delete_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				insert_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				select_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				update_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ddl_clauseContext extends ParserRuleContext {
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public Create_or_alter_functionContext create_or_alter_function() {
			return getRuleContext(Create_or_alter_functionContext.class,0);
		}
		public Create_or_alter_procedureContext create_or_alter_procedure() {
			return getRuleContext(Create_or_alter_procedureContext.class,0);
		}
		public Create_statisticsContext create_statistics() {
			return getRuleContext(Create_statisticsContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_typeContext create_type() {
			return getRuleContext(Create_typeContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Drop_indexContext drop_index() {
			return getRuleContext(Drop_indexContext.class,0);
		}
		public Drop_procedureContext drop_procedure() {
			return getRuleContext(Drop_procedureContext.class,0);
		}
		public Drop_statisticsContext drop_statistics() {
			return getRuleContext(Drop_statisticsContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Drop_typeContext drop_type() {
			return getRuleContext(Drop_typeContext.class,0);
		}
		public Drop_viewContext drop_view() {
			return getRuleContext(Drop_viewContext.class,0);
		}
		public Ddl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDdl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDdl_clause(this);
		}
	}

	public final Ddl_clauseContext ddl_clause() throws RecognitionException {
		Ddl_clauseContext _localctx = new Ddl_clauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ddl_clause);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				create_database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				create_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				create_or_alter_function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				create_or_alter_procedure();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				create_statistics();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				create_table();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(404);
				create_type();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(405);
				create_view();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(406);
				alter_table();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(407);
				alter_database();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(408);
				drop_index();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(409);
				drop_procedure();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(410);
				drop_statistics();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(411);
				drop_table();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(412);
				drop_type();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(413);
				drop_view();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cfl_statementContext extends ParserRuleContext {
		public Cfl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfl_statement; }
	 
		public Cfl_statementContext() { }
		public void copyFrom(Cfl_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Waitfor_statementContext extends Cfl_statementContext {
		public TerminalNode WAITFOR() { return getToken(tsqlParser.WAITFOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELAY() { return getToken(tsqlParser.DELAY, 0); }
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Waitfor_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWaitfor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWaitfor_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends Cfl_statementContext {
		public TerminalNode PRINT() { return getToken(tsqlParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Print_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitPrint_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statementContext extends Cfl_statementContext {
		public TerminalNode CONTINUE() { return getToken(tsqlParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Continue_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitContinue_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends Cfl_statementContext {
		public Sql_clauseContext if_expr;
		public Sql_clauseContext else_expr;
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(tsqlParser.ELSE, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public If_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitIf_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Raiseerror_statementContext extends Cfl_statementContext {
		public Token msg;
		public Constant_LOCAL_IDContext severity;
		public Constant_LOCAL_IDContext state;
		public TerminalNode RAISERROR() { return getToken(tsqlParser.RAISERROR, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<Constant_LOCAL_IDContext> constant_LOCAL_ID() {
			return getRuleContexts(Constant_LOCAL_IDContext.class);
		}
		public Constant_LOCAL_IDContext constant_LOCAL_ID(int i) {
			return getRuleContext(Constant_LOCAL_IDContext.class,i);
		}
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Raiseerror_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRaiseerror_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRaiseerror_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Throw_statementContext extends Cfl_statementContext {
		public Token error_number;
		public Token message;
		public Token state;
		public TerminalNode THROW() { return getToken(tsqlParser.THROW, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Throw_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitThrow_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Try_catch_statementContext extends Cfl_statementContext {
		public Sql_clausesContext try_clauses;
		public Sql_clausesContext catch_clauses;
		public List<TerminalNode> BEGIN() { return getTokens(tsqlParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(tsqlParser.BEGIN, i);
		}
		public List<TerminalNode> TRY() { return getTokens(tsqlParser.TRY); }
		public TerminalNode TRY(int i) {
			return getToken(tsqlParser.TRY, i);
		}
		public List<TerminalNode> END() { return getTokens(tsqlParser.END); }
		public TerminalNode END(int i) {
			return getToken(tsqlParser.END, i);
		}
		public List<TerminalNode> CATCH() { return getTokens(tsqlParser.CATCH); }
		public TerminalNode CATCH(int i) {
			return getToken(tsqlParser.CATCH, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(tsqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(tsqlParser.SEMI, i);
		}
		public List<Sql_clausesContext> sql_clauses() {
			return getRuleContexts(Sql_clausesContext.class);
		}
		public Sql_clausesContext sql_clauses(int i) {
			return getRuleContext(Sql_clausesContext.class,i);
		}
		public Try_catch_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTry_catch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTry_catch_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends Cfl_statementContext {
		public TerminalNode WHILE() { return getToken(tsqlParser.WHILE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Sql_clauseContext sql_clause() {
			return getRuleContext(Sql_clauseContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(tsqlParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(tsqlParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public While_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWhile_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Block_statementContext extends Cfl_statementContext {
		public TerminalNode BEGIN() { return getToken(tsqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(tsqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(tsqlParser.SEMI, i);
		}
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public Block_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBlock_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends Cfl_statementContext {
		public TerminalNode BREAK() { return getToken(tsqlParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Break_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBreak_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Goto_statementContext extends Cfl_statementContext {
		public TerminalNode GOTO() { return getToken(tsqlParser.GOTO, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(tsqlParser.COLON, 0); }
		public Goto_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterGoto_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitGoto_statement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends Cfl_statementContext {
		public TerminalNode RETURN() { return getToken(tsqlParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Return_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitReturn_statement(this);
		}
	}

	public final Cfl_statementContext cfl_statement() throws RecognitionException {
		Cfl_statementContext _localctx = new Cfl_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cfl_statement);
		int _la;
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new Block_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(BEGIN);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(417);
					match(SEMI);
					}
				}

				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 145663472800114704L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18581746794824209L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 2639109382195007505L) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & 6485222866395631635L) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & -6755399582093674263L) != 0) || ((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & -776873741480755605L) != 0) || ((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & -9223369416933306605L) != 0)) {
					{
					setState(420);
					sql_clauses();
					}
				}

				setState(423);
				match(END);
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(424);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Break_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(BREAK);
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(428);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Continue_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(CONTINUE);
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(432);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Goto_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(GOTO);
				setState(436);
				r_id();
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(437);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Goto_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				r_id();
				setState(441);
				match(COLON);
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(442);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(445);
				match(IF);
				setState(446);
				search_condition(0);
				setState(447);
				((If_statementContext)_localctx).if_expr = sql_clause();
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(448);
					match(ELSE);
					setState(449);
					((If_statementContext)_localctx).else_expr = sql_clause();
					}
					break;
				}
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(452);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
				match(RETURN);
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(456);
					expression(0);
					}
					break;
				}
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(459);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new Throw_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(462);
				match(THROW);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL_ID || _la==DECIMAL) {
					{
					setState(463);
					((Throw_statementContext)_localctx).error_number = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==DECIMAL) ) {
						((Throw_statementContext)_localctx).error_number = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(464);
					match(COMMA);
					setState(465);
					((Throw_statementContext)_localctx).message = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==STRING) ) {
						((Throw_statementContext)_localctx).message = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(466);
					match(COMMA);
					setState(467);
					((Throw_statementContext)_localctx).state = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==DECIMAL) ) {
						((Throw_statementContext)_localctx).state = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(470);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new Try_catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(473);
				match(BEGIN);
				setState(474);
				match(TRY);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(475);
					match(SEMI);
					}
				}

				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 145663472800114704L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18581746794824209L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 2639109382195007505L) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & 6485222866395631635L) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & -6755399582093674263L) != 0) || ((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & -776873741480755605L) != 0) || ((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & -9223369416933306605L) != 0)) {
					{
					setState(478);
					((Try_catch_statementContext)_localctx).try_clauses = sql_clauses();
					}
				}

				setState(481);
				match(END);
				setState(482);
				match(TRY);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(483);
					match(SEMI);
					}
				}

				setState(486);
				match(BEGIN);
				setState(487);
				match(CATCH);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(488);
					match(SEMI);
					}
				}

				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 145663472800114704L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18581746794824209L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 2639109382195007505L) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & 6485222866395631635L) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & -6755399582093674263L) != 0) || ((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & -776873741480755605L) != 0) || ((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & -9223369416933306605L) != 0)) {
					{
					setState(491);
					((Try_catch_statementContext)_localctx).catch_clauses = sql_clauses();
					}
				}

				setState(494);
				match(END);
				setState(495);
				match(CATCH);
				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(496);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new Waitfor_statementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(499);
				match(WAITFOR);
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==DELAY || _la==TIME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(501);
				expression(0);
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(502);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(505);
				match(WHILE);
				setState(506);
				search_condition(0);
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(507);
					sql_clause();
					}
					break;
				case 2:
					{
					setState(508);
					match(BREAK);
					setState(510);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(509);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(512);
					match(CONTINUE);
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(513);
						match(SEMI);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new Print_statementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(518);
				match(PRINT);
				setState(519);
				expression(0);
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(520);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new Raiseerror_statementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(523);
				match(RAISERROR);
				setState(524);
				match(LR_BRACKET);
				setState(525);
				((Raiseerror_statementContext)_localctx).msg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 432)) & ~0x3f) == 0 && ((1L << (_la - 432)) & 11L) != 0)) ) {
					((Raiseerror_statementContext)_localctx).msg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(526);
				match(COMMA);
				setState(527);
				((Raiseerror_statementContext)_localctx).severity = constant_LOCAL_ID();
				setState(528);
				match(COMMA);
				setState(529);
				((Raiseerror_statementContext)_localctx).state = constant_LOCAL_ID();
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(530);
					match(COMMA);
					setState(531);
					constant_LOCAL_ID();
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(RR_BRACKET);
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(538);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Another_statementContext extends ParserRuleContext {
		public Declare_statementContext declare_statement() {
			return getRuleContext(Declare_statementContext.class,0);
		}
		public Cursor_statementContext cursor_statement() {
			return getRuleContext(Cursor_statementContext.class,0);
		}
		public Execute_statementContext execute_statement() {
			return getRuleContext(Execute_statementContext.class,0);
		}
		public Security_statementContext security_statement() {
			return getRuleContext(Security_statementContext.class,0);
		}
		public Set_statementContext set_statement() {
			return getRuleContext(Set_statementContext.class,0);
		}
		public Transaction_statementContext transaction_statement() {
			return getRuleContext(Transaction_statementContext.class,0);
		}
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public Another_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_another_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAnother_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAnother_statement(this);
		}
	}

	public final Another_statementContext another_statement() throws RecognitionException {
		Another_statementContext _localctx = new Another_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_another_statement);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				declare_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				cursor_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				execute_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				security_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(547);
				set_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(548);
				transaction_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(549);
				use_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(tsqlParser.DELETE, 0); }
		public Delete_statement_fromContext delete_statement_from() {
			return getRuleContext(Delete_statement_fromContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public Top_clause_dmContext top_clause_dm() {
			return getRuleContext(Top_clause_dmContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(tsqlParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(tsqlParser.FROM, i);
		}
		public Insert_with_table_hintsContext insert_with_table_hints() {
			return getRuleContext(Insert_with_table_hintsContext.class,0);
		}
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public Table_sourcesContext table_sources() {
			return getRuleContext(Table_sourcesContext.class,0);
		}
		public Where_clause_dmlContext where_clause_dml() {
			return getRuleContext(Where_clause_dmlContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDelete_statement(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(552);
				with_expression();
				}
			}

			setState(555);
			match(DELETE);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(556);
				top_clause_dm();
				}
			}

			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(559);
				match(FROM);
				}
			}

			setState(562);
			delete_statement_from();
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(563);
				insert_with_table_hints();
				}
				break;
			}
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(566);
				output_clause();
				}
				break;
			}
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(569);
				match(FROM);
				setState(570);
				table_sources();
				}
			}

			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(573);
				where_clause_dml();
				}
			}

			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(576);
				for_clause();
				}
			}

			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTION) {
				{
				setState(579);
				option_clause();
				}
			}

			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(582);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_statement_fromContext extends ParserRuleContext {
		public Token table_var;
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Delete_statement_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDelete_statement_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDelete_statement_from(this);
		}
	}

	public final Delete_statement_fromContext delete_statement_from() throws RecognitionException {
		Delete_statement_fromContext _localctx = new Delete_statement_fromContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delete_statement_from);
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				r_id();
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(586);
					with_table_hints();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				ddl_object();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				rowset_function_limited();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				((Delete_statement_fromContext)_localctx).table_var = match(LOCAL_ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_statementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(tsqlParser.INSERT, 0); }
		public Insert_statement_valueContext insert_statement_value() {
			return getRuleContext(Insert_statement_valueContext.class,0);
		}
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public Top_clause_dmContext top_clause_dm() {
			return getRuleContext(Top_clause_dmContext.class,0);
		}
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public Insert_with_table_hintsContext insert_with_table_hints() {
			return getRuleContext(Insert_with_table_hintsContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitInsert_statement(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(594);
				with_expression();
				}
			}

			setState(597);
			match(INSERT);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(598);
				top_clause_dm();
				}
			}

			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(601);
				match(INTO);
				}
			}

			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case ID:
				{
				setState(604);
				ddl_object();
				}
				break;
			case OPENDATASOURCE:
			case OPENQUERY:
				{
				setState(605);
				rowset_function_limited();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(608);
				insert_with_table_hints();
				}
				break;
			}
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(611);
				match(LR_BRACKET);
				setState(612);
				column_name_list();
				setState(613);
				match(RR_BRACKET);
				}
				break;
			}
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(617);
				output_clause();
				}
			}

			setState(620);
			insert_statement_value();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(621);
				for_clause();
				}
			}

			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTION) {
				{
				setState(624);
				option_clause();
				}
			}

			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(627);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_statement_valueContext extends ParserRuleContext {
		public Table_value_constructorContext table_value_constructor() {
			return getRuleContext(Table_value_constructorContext.class,0);
		}
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public Execute_statementContext execute_statement() {
			return getRuleContext(Execute_statementContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public TerminalNode VALUES() { return getToken(tsqlParser.VALUES, 0); }
		public Insert_statement_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterInsert_statement_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitInsert_statement_value(this);
		}
	}

	public final Insert_statement_valueContext insert_statement_value() throws RecognitionException {
		Insert_statement_valueContext _localctx = new Insert_statement_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insert_statement_value);
		try {
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				table_value_constructor();
				}
				break;
			case SELECT:
			case WITH:
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				derived_table();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				execute_statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
				match(DEFAULT);
				setState(634);
				match(VALUES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_statementContext extends ParserRuleContext {
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(637);
				with_expression();
				}
			}

			setState(640);
			query_expression(0);
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(641);
				order_by_clause();
				}
				break;
			}
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(644);
				for_clause();
				}
				break;
			}
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(647);
				option_clause();
				}
				break;
			}
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(650);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_statementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public List<Update_elemContext> update_elem() {
			return getRuleContexts(Update_elemContext.class);
		}
		public Update_elemContext update_elem(int i) {
			return getRuleContext(Update_elemContext.class,i);
		}
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public Top_clause_dmContext top_clause_dm() {
			return getRuleContext(Top_clause_dmContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public Table_sourcesContext table_sources() {
			return getRuleContext(Table_sourcesContext.class,0);
		}
		public Where_clause_dmlContext where_clause_dml() {
			return getRuleContext(Where_clause_dmlContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUpdate_statement(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(653);
				with_expression();
				}
			}

			setState(656);
			match(UPDATE);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(657);
				top_clause_dm();
				}
			}

			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case ID:
				{
				setState(660);
				ddl_object();
				}
				break;
			case OPENDATASOURCE:
			case OPENQUERY:
				{
				setState(661);
				rowset_function_limited();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH || _la==LR_BRACKET) {
				{
				setState(664);
				with_table_hints();
				}
			}

			setState(667);
			match(SET);
			setState(668);
			update_elem();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(669);
				match(COMMA);
				setState(670);
				update_elem();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(676);
				output_clause();
				}
				break;
			}
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(679);
				match(FROM);
				setState(680);
				table_sources();
				}
			}

			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(683);
				where_clause_dml();
				}
			}

			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(686);
				for_clause();
				}
			}

			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTION) {
				{
				setState(689);
				option_clause();
				}
			}

			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(692);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_clause_dmlContext extends ParserRuleContext {
		public Token cursor_var;
		public TerminalNode WHERE() { return getToken(tsqlParser.WHERE, 0); }
		public Search_condition_listContext search_condition_list() {
			return getRuleContext(Search_condition_listContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public Where_clause_dmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause_dml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWhere_clause_dml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWhere_clause_dml(this);
		}
	}

	public final Where_clause_dmlContext where_clause_dml() throws RecognitionException {
		Where_clause_dmlContext _localctx = new Where_clause_dmlContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_where_clause_dml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(WHERE);
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case COALESCE:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DEFAULT:
			case EXISTS:
			case FORCESEEK:
			case IDENTITY:
			case IIF:
			case LEFT:
			case NEXT:
			case NOT:
			case NULL:
			case NULLIF:
			case NUMERIC:
			case OVER:
			case RIGHT:
			case SESSION_USER:
			case SYSTEM_USER:
			case TRY_CAST:
			case TRY_CONVERT:
			case TRY_PARSE:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case BINARY_CHECKSUM:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DATEADD:
			case DATEDIFF:
			case DATENAME:
			case DATEPART:
			case DATETIMEOFFSETFROMPARTS:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MIN_ACTIVE_ROWVERSION:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARSE:
			case PARTITION:
			case PATH:
			case PERCENTILE_CONT:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case STRING_AGG:
			case STRING_SPLIT:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case DECIMAL:
			case ID:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case LR_BRACKET:
			case PLUS:
			case MINUS:
			case BIT_NOT:
				{
				setState(696);
				search_condition_list();
				}
				break;
			case CURRENT:
				{
				setState(697);
				match(CURRENT);
				setState(698);
				match(OF);
				setState(704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(700);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(699);
						match(GLOBAL);
						}
						break;
					}
					setState(702);
					cursor_name();
					}
					break;
				case 2:
					{
					setState(703);
					((Where_clause_dmlContext)_localctx).cursor_var = match(LOCAL_ID);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Output_clauseContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public List<Output_dml_list_elemContext> output_dml_list_elem() {
			return getRuleContexts(Output_dml_list_elemContext.class);
		}
		public Output_dml_list_elemContext output_dml_list_elem(int i) {
			return getRuleContext(Output_dml_list_elemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Output_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOutput_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOutput_clause(this);
		}
	}

	public final Output_clauseContext output_clause() throws RecognitionException {
		Output_clauseContext _localctx = new Output_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(OUTPUT);
			setState(709);
			output_dml_list_elem();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(710);
				match(COMMA);
				setState(711);
				output_dml_list_elem();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(717);
				match(INTO);
				setState(720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOCAL_ID:
					{
					setState(718);
					match(LOCAL_ID);
					}
					break;
				case FORCESEEK:
				case NEXT:
				case NUMERIC:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(719);
					table_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(726);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(722);
					match(LR_BRACKET);
					setState(723);
					column_name_list();
					setState(724);
					match(RR_BRACKET);
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Output_dml_list_elemContext extends ParserRuleContext {
		public Output_column_nameContext output_column_name() {
			return getRuleContext(Output_column_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Output_dml_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_dml_list_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOutput_dml_list_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOutput_dml_list_elem(this);
		}
	}

	public final Output_dml_list_elemContext output_dml_list_elem() throws RecognitionException {
		Output_dml_list_elemContext _localctx = new Output_dml_list_elemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_output_dml_list_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(730);
				output_column_name();
				}
				break;
			case 2:
				{
				setState(731);
				expression(0);
				}
				break;
			}
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(734);
					match(AS);
					}
				}

				setState(737);
				column_alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Output_column_nameContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(tsqlParser.DOT, 0); }
		public TerminalNode DELETED() { return getToken(tsqlParser.DELETED, 0); }
		public TerminalNode INSERTED() { return getToken(tsqlParser.INSERTED, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(tsqlParser.STAR, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode DOLLAR_ACTION() { return getToken(tsqlParser.DOLLAR_ACTION, 0); }
		public Output_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOutput_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOutput_column_name(this);
		}
	}

	public final Output_column_nameContext output_column_name() throws RecognitionException {
		Output_column_nameContext _localctx = new Output_column_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_output_column_name);
		try {
			setState(751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(740);
					match(DELETED);
					}
					break;
				case 2:
					{
					setState(741);
					match(INSERTED);
					}
					break;
				case 3:
					{
					setState(742);
					table_name();
					}
					break;
				}
				setState(745);
				match(DOT);
				setState(748);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(746);
					match(STAR);
					}
					break;
				case FORCESEEK:
				case NEXT:
				case NUMERIC:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(747);
					r_id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DOLLAR_ACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				match(DOLLAR_ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_databaseContext extends ParserRuleContext {
		public R_idContext database;
		public R_idContext collation_name;
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(tsqlParser.DATABASE, 0); }
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public TerminalNode CONTAINMENT() { return getToken(tsqlParser.CONTAINMENT, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public List<TerminalNode> ON() { return getTokens(tsqlParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(tsqlParser.ON, i);
		}
		public List<Database_file_specContext> database_file_spec() {
			return getRuleContexts(Database_file_specContext.class);
		}
		public Database_file_specContext database_file_spec(int i) {
			return getRuleContext(Database_file_specContext.class,i);
		}
		public TerminalNode LOG() { return getToken(tsqlParser.LOG, 0); }
		public TerminalNode COLLATE() { return getToken(tsqlParser.COLLATE, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public TerminalNode NONE() { return getToken(tsqlParser.NONE, 0); }
		public TerminalNode PARTIAL() { return getToken(tsqlParser.PARTIAL, 0); }
		public TerminalNode PRIMARY() { return getToken(tsqlParser.PRIMARY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_database(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(CREATE);
			setState(754);
			match(DATABASE);
			{
			setState(755);
			((Create_databaseContext)_localctx).database = r_id();
			}
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINMENT) {
				{
				setState(756);
				match(CONTAINMENT);
				setState(757);
				match(EQUAL);
				setState(758);
				_la = _input.LA(1);
				if ( !(_la==NONE || _la==PARTIAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(761);
				match(ON);
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIMARY) {
					{
					setState(762);
					match(PRIMARY);
					}
				}

				setState(765);
				database_file_spec();
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(766);
					match(COMMA);
					setState(767);
					database_file_spec();
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOG) {
				{
				setState(775);
				match(LOG);
				setState(776);
				match(ON);
				setState(777);
				database_file_spec();
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(778);
					match(COMMA);
					setState(779);
					database_file_spec();
					}
					}
					setState(784);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(787);
				match(COLLATE);
				setState(788);
				((Create_databaseContext)_localctx).collation_name = r_id();
				}
			}

			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(791);
				match(WITH);
				setState(792);
				create_database_option();
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(793);
					match(COMMA);
					setState(794);
					create_database_option();
					}
					}
					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_indexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public List<TerminalNode> ON() { return getTokens(tsqlParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(tsqlParser.ON, i);
		}
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode UNIQUE() { return getToken(tsqlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode ASC() { return getToken(tsqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(tsqlParser.DESC, 0); }
		public Create_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_index(this);
		}
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_create_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(CREATE);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(803);
				match(UNIQUE);
				}
			}

			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(806);
				clustered();
				}
			}

			setState(809);
			match(INDEX);
			setState(810);
			r_id();
			setState(811);
			match(ON);
			setState(812);
			table_name_with_hint();
			setState(813);
			match(LR_BRACKET);
			setState(814);
			column_name_list();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(815);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(818);
			match(RR_BRACKET);
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(819);
				index_options();
				}
				break;
			}
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(822);
				match(ON);
				setState(823);
				r_id();
				}
			}

			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(826);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_statisticsContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode STATISTICS() { return getToken(tsqlParser.STATISTICS, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode FULLSCAN() { return getToken(tsqlParser.FULLSCAN, 0); }
		public TerminalNode SAMPLE() { return getToken(tsqlParser.SAMPLE, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode STATS_STREAM() { return getToken(tsqlParser.STATS_STREAM, 0); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode NORECOMPUTE() { return getToken(tsqlParser.NORECOMPUTE, 0); }
		public TerminalNode INCREMENTAL() { return getToken(tsqlParser.INCREMENTAL, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Create_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_statistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_statistics(this);
		}
	}

	public final Create_statisticsContext create_statistics() throws RecognitionException {
		Create_statisticsContext _localctx = new Create_statisticsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_create_statistics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(CREATE);
			setState(830);
			match(STATISTICS);
			setState(831);
			r_id();
			setState(832);
			match(ON);
			setState(833);
			table_name_with_hint();
			setState(834);
			match(LR_BRACKET);
			setState(835);
			column_name_list();
			setState(836);
			match(RR_BRACKET);
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(837);
				match(WITH);
				setState(843);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FULLSCAN:
					{
					setState(838);
					match(FULLSCAN);
					}
					break;
				case SAMPLE:
					{
					setState(839);
					match(SAMPLE);
					setState(840);
					match(DECIMAL);
					setState(841);
					_la = _input.LA(1);
					if ( !(_la==PERCENT || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case STATS_STREAM:
					{
					setState(842);
					match(STATS_STREAM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(845);
					match(COMMA);
					setState(846);
					match(NORECOMPUTE);
					}
					break;
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(849);
					match(COMMA);
					setState(850);
					match(INCREMENTAL);
					setState(851);
					match(EQUAL);
					setState(852);
					on_off();
					}
				}

				}
				break;
			}
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(857);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Column_def_table_constraintsContext column_def_table_constraints() {
			return getRuleContext(Column_def_table_constraintsContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(tsqlParser.COMMA, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(tsqlParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(tsqlParser.DEFAULT, i);
		}
		public TerminalNode TEXTIMAGE_ON() { return getToken(tsqlParser.TEXTIMAGE_ON, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_table(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(CREATE);
			setState(861);
			match(TABLE);
			setState(862);
			table_name();
			setState(863);
			match(LR_BRACKET);
			setState(864);
			column_def_table_constraints();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(865);
				match(COMMA);
				}
			}

			setState(868);
			match(RR_BRACKET);
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(869);
				match(ON);
				setState(870);
				r_id();
				}
				break;
			case 2:
				{
				setState(871);
				match(DEFAULT);
				}
				break;
			}
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(874);
				match(TEXTIMAGE_ON);
				setState(875);
				r_id();
				}
				break;
			case 2:
				{
				setState(876);
				match(DEFAULT);
				}
				break;
			}
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(879);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_viewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(tsqlParser.VIEW, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> WITH() { return getTokens(tsqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(tsqlParser.WITH, i);
		}
		public List<View_attributeContext> view_attribute() {
			return getRuleContexts(View_attributeContext.class);
		}
		public View_attributeContext view_attribute(int i) {
			return getRuleContext(View_attributeContext.class,i);
		}
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(tsqlParser.OPTION, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_view(this);
		}
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_create_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(CREATE);
			setState(883);
			match(VIEW);
			setState(884);
			simple_name();
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(885);
				match(LR_BRACKET);
				setState(886);
				column_name_list();
				setState(887);
				match(RR_BRACKET);
				}
			}

			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(891);
				match(WITH);
				setState(892);
				view_attribute();
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(893);
					match(COMMA);
					setState(894);
					view_attribute();
					}
					}
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(902);
			match(AS);
			setState(903);
			select_statement();
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(904);
				match(WITH);
				setState(905);
				match(CHECK);
				setState(906);
				match(OPTION);
				}
				break;
			}
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(909);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class View_attributeContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(tsqlParser.SCHEMABINDING, 0); }
		public TerminalNode VIEW_METADATA() { return getToken(tsqlParser.VIEW_METADATA, 0); }
		public View_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterView_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitView_attribute(this);
		}
	}

	public final View_attributeContext view_attribute() throws RecognitionException {
		View_attributeContext _localctx = new View_attributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_view_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_la = _input.LA(1);
			if ( !(_la==ENCRYPTION || _la==SCHEMABINDING || _la==VIEW_METADATA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_tableContext extends ParserRuleContext {
		public R_idContext constraint;
		public Column_name_listContext fk;
		public Column_name_listContext pk;
		public TerminalNode ALTER() { return getToken(tsqlParser.ALTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(tsqlParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(tsqlParser.TABLE, i);
		}
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public List<TerminalNode> LR_BRACKET() { return getTokens(tsqlParser.LR_BRACKET); }
		public TerminalNode LR_BRACKET(int i) {
			return getToken(tsqlParser.LR_BRACKET, i);
		}
		public TerminalNode LOCK_ESCALATION() { return getToken(tsqlParser.LOCK_ESCALATION, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public List<TerminalNode> RR_BRACKET() { return getTokens(tsqlParser.RR_BRACKET); }
		public TerminalNode RR_BRACKET(int i) {
			return getToken(tsqlParser.RR_BRACKET, i);
		}
		public TerminalNode ADD() { return getToken(tsqlParser.ADD, 0); }
		public Column_def_table_constraintContext column_def_table_constraint() {
			return getRuleContext(Column_def_table_constraintContext.class,0);
		}
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public TerminalNode FOREIGN() { return getToken(tsqlParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(tsqlParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(tsqlParser.REFERENCES, 0); }
		public TerminalNode AUTO() { return getToken(tsqlParser.AUTO, 0); }
		public TerminalNode DISABLE() { return getToken(tsqlParser.DISABLE, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAlter_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAlter_table(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alter_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(ALTER);
			setState(915);
			match(TABLE);
			setState(916);
			table_name();
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(917);
				match(SET);
				setState(918);
				match(LR_BRACKET);
				setState(919);
				match(LOCK_ESCALATION);
				setState(920);
				match(EQUAL);
				setState(921);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==AUTO || _la==DISABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(922);
				match(RR_BRACKET);
				}
				break;
			case ADD:
				{
				setState(923);
				match(ADD);
				setState(924);
				column_def_table_constraint();
				}
				break;
			case DROP:
				{
				setState(925);
				match(DROP);
				setState(926);
				match(CONSTRAINT);
				setState(927);
				((Alter_tableContext)_localctx).constraint = r_id();
				}
				break;
			case WITH:
				{
				setState(928);
				match(WITH);
				setState(929);
				match(CHECK);
				setState(930);
				match(ADD);
				setState(931);
				match(CONSTRAINT);
				setState(932);
				((Alter_tableContext)_localctx).constraint = r_id();
				setState(933);
				match(FOREIGN);
				setState(934);
				match(KEY);
				setState(935);
				match(LR_BRACKET);
				setState(936);
				((Alter_tableContext)_localctx).fk = column_name_list();
				setState(937);
				match(RR_BRACKET);
				setState(938);
				match(REFERENCES);
				setState(939);
				table_name();
				setState(940);
				match(LR_BRACKET);
				setState(941);
				((Alter_tableContext)_localctx).pk = column_name_list();
				setState(942);
				match(RR_BRACKET);
				}
				break;
			case CHECK:
				{
				setState(944);
				match(CHECK);
				setState(945);
				match(CONSTRAINT);
				setState(946);
				((Alter_tableContext)_localctx).constraint = r_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(949);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_databaseContext extends ParserRuleContext {
		public R_idContext database;
		public R_idContext new_name;
		public R_idContext collation;
		public TerminalNode ALTER() { return getToken(tsqlParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(tsqlParser.DATABASE, 0); }
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public TerminalNode MODIFY() { return getToken(tsqlParser.MODIFY, 0); }
		public TerminalNode NAME() { return getToken(tsqlParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode COLLATE() { return getToken(tsqlParser.COLLATE, 0); }
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public Database_optionspecContext database_optionspec() {
			return getRuleContext(Database_optionspecContext.class,0);
		}
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminationContext termination() {
			return getRuleContext(TerminationContext.class,0);
		}
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAlter_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAlter_database(this);
		}
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alter_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(ALTER);
			setState(953);
			match(DATABASE);
			setState(956);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(954);
				((Alter_databaseContext)_localctx).database = r_id();
				}
				break;
			case CURRENT:
				{
				setState(955);
				match(CURRENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIFY:
				{
				setState(958);
				match(MODIFY);
				setState(959);
				match(NAME);
				setState(960);
				match(EQUAL);
				setState(961);
				((Alter_databaseContext)_localctx).new_name = r_id();
				}
				break;
			case COLLATE:
				{
				setState(962);
				match(COLLATE);
				setState(963);
				((Alter_databaseContext)_localctx).collation = r_id();
				}
				break;
			case SET:
				{
				setState(964);
				match(SET);
				setState(965);
				database_optionspec();
				setState(968);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(966);
					match(WITH);
					setState(967);
					termination();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(972);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Database_optionspecContext extends ParserRuleContext {
		public Auto_optionContext auto_option() {
			return getRuleContext(Auto_optionContext.class,0);
		}
		public Change_tracking_optionContext change_tracking_option() {
			return getRuleContext(Change_tracking_optionContext.class,0);
		}
		public Containment_optionContext containment_option() {
			return getRuleContext(Containment_optionContext.class,0);
		}
		public Cursor_optionContext cursor_option() {
			return getRuleContext(Cursor_optionContext.class,0);
		}
		public Date_correlation_optimization_optionContext date_correlation_optimization_option() {
			return getRuleContext(Date_correlation_optimization_optionContext.class,0);
		}
		public Db_encryption_optionContext db_encryption_option() {
			return getRuleContext(Db_encryption_optionContext.class,0);
		}
		public Db_state_optionContext db_state_option() {
			return getRuleContext(Db_state_optionContext.class,0);
		}
		public Db_update_optionContext db_update_option() {
			return getRuleContext(Db_update_optionContext.class,0);
		}
		public Db_user_access_optionContext db_user_access_option() {
			return getRuleContext(Db_user_access_optionContext.class,0);
		}
		public Delayed_durability_optionContext delayed_durability_option() {
			return getRuleContext(Delayed_durability_optionContext.class,0);
		}
		public External_access_optionContext external_access_option() {
			return getRuleContext(External_access_optionContext.class,0);
		}
		public TerminalNode FILESTREAM() { return getToken(tsqlParser.FILESTREAM, 0); }
		public Database_filestream_optionContext database_filestream_option() {
			return getRuleContext(Database_filestream_optionContext.class,0);
		}
		public TerminalNode HADR_options() { return getToken(tsqlParser.HADR_options, 0); }
		public Mixed_page_allocation_optionContext mixed_page_allocation_option() {
			return getRuleContext(Mixed_page_allocation_optionContext.class,0);
		}
		public Parameterization_optionContext parameterization_option() {
			return getRuleContext(Parameterization_optionContext.class,0);
		}
		public Recovery_optionContext recovery_option() {
			return getRuleContext(Recovery_optionContext.class,0);
		}
		public Service_broker_optionContext service_broker_option() {
			return getRuleContext(Service_broker_optionContext.class,0);
		}
		public Snapshot_optionContext snapshot_option() {
			return getRuleContext(Snapshot_optionContext.class,0);
		}
		public Sql_optionContext sql_option() {
			return getRuleContext(Sql_optionContext.class,0);
		}
		public Target_recovery_time_optionContext target_recovery_time_option() {
			return getRuleContext(Target_recovery_time_optionContext.class,0);
		}
		public TerminationContext termination() {
			return getRuleContext(TerminationContext.class,0);
		}
		public Database_optionspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_optionspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDatabase_optionspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDatabase_optionspec(this);
		}
	}

	public final Database_optionspecContext database_optionspec() throws RecognitionException {
		Database_optionspecContext _localctx = new Database_optionspecContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_database_optionspec);
		try {
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				auto_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				change_tracking_option();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(977);
				containment_option();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(978);
				cursor_option();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(979);
				date_correlation_optimization_option();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(980);
				db_encryption_option();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(981);
				db_state_option();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(982);
				db_update_option();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(983);
				db_user_access_option();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(984);
				delayed_durability_option();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(985);
				external_access_option();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(986);
				match(FILESTREAM);
				setState(987);
				database_filestream_option();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(988);
				match(HADR_options);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(989);
				mixed_page_allocation_option();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(990);
				parameterization_option();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(991);
				recovery_option();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(992);
				service_broker_option();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(993);
				snapshot_option();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(994);
				sql_option();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(995);
				target_recovery_time_option();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(996);
				termination();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Auto_optionContext extends ParserRuleContext {
		public TerminalNode AUTO_CLOSE() { return getToken(tsqlParser.AUTO_CLOSE, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode AUTO_CREATE_STATISTICS() { return getToken(tsqlParser.AUTO_CREATE_STATISTICS, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public List<TerminalNode> ON() { return getTokens(tsqlParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(tsqlParser.ON, i);
		}
		public TerminalNode INCREMENTAL() { return getToken(tsqlParser.INCREMENTAL, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode AUTO_SHRINK() { return getToken(tsqlParser.AUTO_SHRINK, 0); }
		public TerminalNode AUTO_UPDATE_STATISTICS() { return getToken(tsqlParser.AUTO_UPDATE_STATISTICS, 0); }
		public TerminalNode AUTO_UPDATE_STATISTICS_ASYNC() { return getToken(tsqlParser.AUTO_UPDATE_STATISTICS_ASYNC, 0); }
		public Auto_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auto_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAuto_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAuto_option(this);
		}
	}

	public final Auto_optionContext auto_option() throws RecognitionException {
		Auto_optionContext _localctx = new Auto_optionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_auto_option);
		int _la;
		try {
			setState(1016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO_CLOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				match(AUTO_CLOSE);
				setState(1000);
				on_off();
				}
				break;
			case AUTO_CREATE_STATISTICS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				match(AUTO_CREATE_STATISTICS);
				setState(1002);
				match(OFF);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 3);
				{
				setState(1003);
				match(ON);
				setState(1008);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INCREMENTAL:
					{
					setState(1004);
					match(INCREMENTAL);
					setState(1005);
					match(EQUAL);
					setState(1006);
					match(ON);
					}
					break;
				case OFF:
					{
					setState(1007);
					match(OFF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case AUTO_SHRINK:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				match(AUTO_SHRINK);
				setState(1011);
				on_off();
				}
				break;
			case AUTO_UPDATE_STATISTICS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1012);
				match(AUTO_UPDATE_STATISTICS);
				setState(1013);
				on_off();
				}
				break;
			case AUTO_UPDATE_STATISTICS_ASYNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1014);
				match(AUTO_UPDATE_STATISTICS_ASYNC);
				setState(1015);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Change_tracking_optionContext extends ParserRuleContext {
		public TerminalNode CHANGE_TRACKING() { return getToken(tsqlParser.CHANGE_TRACKING, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public List<Change_tracking_option_listContext> change_tracking_option_list() {
			return getRuleContexts(Change_tracking_option_listContext.class);
		}
		public Change_tracking_option_listContext change_tracking_option_list(int i) {
			return getRuleContext(Change_tracking_option_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Change_tracking_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_tracking_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterChange_tracking_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitChange_tracking_option(this);
		}
	}

	public final Change_tracking_optionContext change_tracking_option() throws RecognitionException {
		Change_tracking_optionContext _localctx = new Change_tracking_optionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_change_tracking_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(CHANGE_TRACKING);
			setState(1019);
			match(EQUAL);
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OFF:
				{
				setState(1020);
				match(OFF);
				}
				break;
			case ON:
				{
				setState(1021);
				match(ON);
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AUTO_CLEANUP || _la==CHANGE_RETENTION) {
					{
					{
					setState(1022);
					change_tracking_option_list();
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1023);
						match(COMMA);
						setState(1024);
						change_tracking_option_list();
						}
						}
						setState(1029);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(1034);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Change_tracking_option_listContext extends ParserRuleContext {
		public TerminalNode AUTO_CLEANUP() { return getToken(tsqlParser.AUTO_CLEANUP, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode CHANGE_RETENTION() { return getToken(tsqlParser.CHANGE_RETENTION, 0); }
		public TerminalNode DAYS() { return getToken(tsqlParser.DAYS, 0); }
		public TerminalNode HOURS() { return getToken(tsqlParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(tsqlParser.MINUTES, 0); }
		public Change_tracking_option_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_tracking_option_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterChange_tracking_option_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitChange_tracking_option_list(this);
		}
	}

	public final Change_tracking_option_listContext change_tracking_option_list() throws RecognitionException {
		Change_tracking_option_listContext _localctx = new Change_tracking_option_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_change_tracking_option_list);
		int _la;
		try {
			setState(1043);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO_CLEANUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				match(AUTO_CLEANUP);
				setState(1038);
				match(EQUAL);
				setState(1039);
				on_off();
				}
				break;
			case CHANGE_RETENTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				match(CHANGE_RETENTION);
				setState(1041);
				match(EQUAL);
				setState(1042);
				_la = _input.LA(1);
				if ( !(_la==DAYS || _la==HOURS || _la==MINUTES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Containment_optionContext extends ParserRuleContext {
		public TerminalNode CONTAINMENT() { return getToken(tsqlParser.CONTAINMENT, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode NONE() { return getToken(tsqlParser.NONE, 0); }
		public TerminalNode PARTIAL() { return getToken(tsqlParser.PARTIAL, 0); }
		public Containment_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containment_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterContainment_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitContainment_option(this);
		}
	}

	public final Containment_optionContext containment_option() throws RecognitionException {
		Containment_optionContext _localctx = new Containment_optionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_containment_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(CONTAINMENT);
			setState(1046);
			match(EQUAL);
			setState(1047);
			_la = _input.LA(1);
			if ( !(_la==NONE || _la==PARTIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cursor_optionContext extends ParserRuleContext {
		public TerminalNode CURSOR_CLOSE_ON_COMMIT() { return getToken(tsqlParser.CURSOR_CLOSE_ON_COMMIT, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode CURSOR_DEFAULT() { return getToken(tsqlParser.CURSOR_DEFAULT, 0); }
		public TerminalNode LOCAL() { return getToken(tsqlParser.LOCAL, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public Cursor_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCursor_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCursor_option(this);
		}
	}

	public final Cursor_optionContext cursor_option() throws RecognitionException {
		Cursor_optionContext _localctx = new Cursor_optionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cursor_option);
		int _la;
		try {
			setState(1053);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURSOR_CLOSE_ON_COMMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				match(CURSOR_CLOSE_ON_COMMIT);
				setState(1050);
				on_off();
				}
				break;
			case CURSOR_DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
				match(CURSOR_DEFAULT);
				setState(1052);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==LOCAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Date_correlation_optimization_optionContext extends ParserRuleContext {
		public TerminalNode DATE_CORRELATION_OPTIMIZATION() { return getToken(tsqlParser.DATE_CORRELATION_OPTIMIZATION, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Date_correlation_optimization_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_correlation_optimization_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDate_correlation_optimization_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDate_correlation_optimization_option(this);
		}
	}

	public final Date_correlation_optimization_optionContext date_correlation_optimization_option() throws RecognitionException {
		Date_correlation_optimization_optionContext _localctx = new Date_correlation_optimization_optionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_date_correlation_optimization_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(DATE_CORRELATION_OPTIMIZATION);
			setState(1056);
			on_off();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Db_encryption_optionContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Db_encryption_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_encryption_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDb_encryption_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDb_encryption_option(this);
		}
	}

	public final Db_encryption_optionContext db_encryption_option() throws RecognitionException {
		Db_encryption_optionContext _localctx = new Db_encryption_optionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_db_encryption_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(ENCRYPTION);
			setState(1059);
			on_off();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Db_state_optionContext extends ParserRuleContext {
		public TerminalNode ONLINE() { return getToken(tsqlParser.ONLINE, 0); }
		public TerminalNode OFFLINE() { return getToken(tsqlParser.OFFLINE, 0); }
		public TerminalNode EMERGENCY() { return getToken(tsqlParser.EMERGENCY, 0); }
		public Db_state_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_state_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDb_state_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDb_state_option(this);
		}
	}

	public final Db_state_optionContext db_state_option() throws RecognitionException {
		Db_state_optionContext _localctx = new Db_state_optionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_db_state_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_la = _input.LA(1);
			if ( !(_la==EMERGENCY || _la==OFFLINE || _la==ONLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Db_update_optionContext extends ParserRuleContext {
		public TerminalNode READ_ONLY() { return getToken(tsqlParser.READ_ONLY, 0); }
		public TerminalNode READ_WRITE() { return getToken(tsqlParser.READ_WRITE, 0); }
		public Db_update_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_update_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDb_update_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDb_update_option(this);
		}
	}

	public final Db_update_optionContext db_update_option() throws RecognitionException {
		Db_update_optionContext _localctx = new Db_update_optionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_db_update_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			_la = _input.LA(1);
			if ( !(_la==READ_ONLY || _la==READ_WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Db_user_access_optionContext extends ParserRuleContext {
		public TerminalNode SINGLE_USER() { return getToken(tsqlParser.SINGLE_USER, 0); }
		public TerminalNode RESTRICTED_USER() { return getToken(tsqlParser.RESTRICTED_USER, 0); }
		public TerminalNode MULTI_USER() { return getToken(tsqlParser.MULTI_USER, 0); }
		public Db_user_access_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_user_access_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDb_user_access_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDb_user_access_option(this);
		}
	}

	public final Db_user_access_optionContext db_user_access_option() throws RecognitionException {
		Db_user_access_optionContext _localctx = new Db_user_access_optionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_db_user_access_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_la = _input.LA(1);
			if ( !(((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & 2305851805306716161L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delayed_durability_optionContext extends ParserRuleContext {
		public TerminalNode DELAYED_DURABILITY() { return getToken(tsqlParser.DELAYED_DURABILITY, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode DISABLED() { return getToken(tsqlParser.DISABLED, 0); }
		public TerminalNode ALLOWED() { return getToken(tsqlParser.ALLOWED, 0); }
		public TerminalNode FORCED() { return getToken(tsqlParser.FORCED, 0); }
		public Delayed_durability_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayed_durability_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDelayed_durability_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDelayed_durability_option(this);
		}
	}

	public final Delayed_durability_optionContext delayed_durability_option() throws RecognitionException {
		Delayed_durability_optionContext _localctx = new Delayed_durability_optionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_delayed_durability_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(DELAYED_DURABILITY);
			setState(1068);
			match(EQUAL);
			setState(1069);
			_la = _input.LA(1);
			if ( !(_la==ALLOWED || _la==DISABLED || _la==FORCED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class External_access_optionContext extends ParserRuleContext {
		public TerminalNode DB_CHAINING() { return getToken(tsqlParser.DB_CHAINING, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode TRUSTWORTHY() { return getToken(tsqlParser.TRUSTWORTHY, 0); }
		public TerminalNode DEFAULT_LANGUAGE() { return getToken(tsqlParser.DEFAULT_LANGUAGE, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode DEFAULT_FULLTEXT_LANGUAGE() { return getToken(tsqlParser.DEFAULT_FULLTEXT_LANGUAGE, 0); }
		public TerminalNode NESTED_TRIGGERS() { return getToken(tsqlParser.NESTED_TRIGGERS, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode TRANSFORM_NOISE_WORDS() { return getToken(tsqlParser.TRANSFORM_NOISE_WORDS, 0); }
		public TerminalNode TWO_DIGIT_YEAR_CUTOFF() { return getToken(tsqlParser.TWO_DIGIT_YEAR_CUTOFF, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public External_access_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_access_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExternal_access_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExternal_access_option(this);
		}
	}

	public final External_access_optionContext external_access_option() throws RecognitionException {
		External_access_optionContext _localctx = new External_access_optionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_external_access_option);
		int _la;
		try {
			setState(1096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DB_CHAINING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				match(DB_CHAINING);
				setState(1072);
				on_off();
				}
				break;
			case TRUSTWORTHY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(TRUSTWORTHY);
				setState(1074);
				on_off();
				}
				break;
			case DEFAULT_LANGUAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				match(DEFAULT_LANGUAGE);
				setState(1076);
				match(EQUAL);
				setState(1079);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case NEXT:
				case NUMERIC:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1077);
					r_id();
					}
					break;
				case STRING:
					{
					setState(1078);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DEFAULT_FULLTEXT_LANGUAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1081);
				match(DEFAULT_FULLTEXT_LANGUAGE);
				setState(1082);
				match(EQUAL);
				setState(1085);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case NEXT:
				case NUMERIC:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1083);
					r_id();
					}
					break;
				case STRING:
					{
					setState(1084);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NESTED_TRIGGERS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1087);
				match(NESTED_TRIGGERS);
				setState(1088);
				match(EQUAL);
				setState(1089);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRANSFORM_NOISE_WORDS:
				enterOuterAlt(_localctx, 6);
				{
				setState(1090);
				match(TRANSFORM_NOISE_WORDS);
				setState(1091);
				match(EQUAL);
				setState(1092);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TWO_DIGIT_YEAR_CUTOFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(1093);
				match(TWO_DIGIT_YEAR_CUTOFF);
				setState(1094);
				match(EQUAL);
				setState(1095);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mixed_page_allocation_optionContext extends ParserRuleContext {
		public TerminalNode MIXED_PAGE_ALLOCATION() { return getToken(tsqlParser.MIXED_PAGE_ALLOCATION, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Mixed_page_allocation_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixed_page_allocation_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterMixed_page_allocation_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitMixed_page_allocation_option(this);
		}
	}

	public final Mixed_page_allocation_optionContext mixed_page_allocation_option() throws RecognitionException {
		Mixed_page_allocation_optionContext _localctx = new Mixed_page_allocation_optionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mixed_page_allocation_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(MIXED_PAGE_ALLOCATION);
			setState(1099);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameterization_optionContext extends ParserRuleContext {
		public TerminalNode PARAMETERIZATION() { return getToken(tsqlParser.PARAMETERIZATION, 0); }
		public TerminalNode SIMPLE() { return getToken(tsqlParser.SIMPLE, 0); }
		public TerminalNode FORCED() { return getToken(tsqlParser.FORCED, 0); }
		public Parameterization_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterization_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterParameterization_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitParameterization_option(this);
		}
	}

	public final Parameterization_optionContext parameterization_option() throws RecognitionException {
		Parameterization_optionContext _localctx = new Parameterization_optionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameterization_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(PARAMETERIZATION);
			setState(1102);
			_la = _input.LA(1);
			if ( !(_la==FORCED || _la==SIMPLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Recovery_optionContext extends ParserRuleContext {
		public TerminalNode RECOVERY() { return getToken(tsqlParser.RECOVERY, 0); }
		public TerminalNode FULL() { return getToken(tsqlParser.FULL, 0); }
		public TerminalNode BULK_LOGGED() { return getToken(tsqlParser.BULK_LOGGED, 0); }
		public TerminalNode SIMPLE() { return getToken(tsqlParser.SIMPLE, 0); }
		public TerminalNode TORN_PAGE_DETECTION() { return getToken(tsqlParser.TORN_PAGE_DETECTION, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode PAGE_VERIFY() { return getToken(tsqlParser.PAGE_VERIFY, 0); }
		public TerminalNode CHECKSUM() { return getToken(tsqlParser.CHECKSUM, 0); }
		public TerminalNode NONE() { return getToken(tsqlParser.NONE, 0); }
		public Recovery_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recovery_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRecovery_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRecovery_option(this);
		}
	}

	public final Recovery_optionContext recovery_option() throws RecognitionException {
		Recovery_optionContext _localctx = new Recovery_optionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_recovery_option);
		int _la;
		try {
			setState(1110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECOVERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1104);
				match(RECOVERY);
				setState(1105);
				_la = _input.LA(1);
				if ( !(_la==FULL || _la==BULK_LOGGED || _la==SIMPLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TORN_PAGE_DETECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				match(TORN_PAGE_DETECTION);
				setState(1107);
				on_off();
				}
				break;
			case PAGE_VERIFY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1108);
				match(PAGE_VERIFY);
				setState(1109);
				_la = _input.LA(1);
				if ( !(_la==NONE || _la==CHECKSUM || _la==TORN_PAGE_DETECTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Service_broker_optionContext extends ParserRuleContext {
		public TerminalNode ENABLE_BROKER() { return getToken(tsqlParser.ENABLE_BROKER, 0); }
		public TerminalNode DISABLE_BROKER() { return getToken(tsqlParser.DISABLE_BROKER, 0); }
		public TerminalNode NEW_BROKER() { return getToken(tsqlParser.NEW_BROKER, 0); }
		public TerminalNode ERROR_BROKER_CONVERSATIONS() { return getToken(tsqlParser.ERROR_BROKER_CONVERSATIONS, 0); }
		public TerminalNode HONOR_BROKER_PRIORITY() { return getToken(tsqlParser.HONOR_BROKER_PRIORITY, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Service_broker_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service_broker_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterService_broker_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitService_broker_option(this);
		}
	}

	public final Service_broker_optionContext service_broker_option() throws RecognitionException {
		Service_broker_optionContext _localctx = new Service_broker_optionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_service_broker_option);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENABLE_BROKER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				match(ENABLE_BROKER);
				}
				break;
			case DISABLE_BROKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				match(DISABLE_BROKER);
				}
				break;
			case NEW_BROKER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1114);
				match(NEW_BROKER);
				}
				break;
			case ERROR_BROKER_CONVERSATIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1115);
				match(ERROR_BROKER_CONVERSATIONS);
				}
				break;
			case HONOR_BROKER_PRIORITY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1116);
				match(HONOR_BROKER_PRIORITY);
				setState(1117);
				on_off();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Snapshot_optionContext extends ParserRuleContext {
		public Token MEMORY_OPTIMIZED_ELEVATE_TO_SNAPSHOT;
		public TerminalNode ALLOW_SNAPSHOT_ISOLATION() { return getToken(tsqlParser.ALLOW_SNAPSHOT_ISOLATION, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode READ_COMMITTED_SNAPSHOT() { return getToken(tsqlParser.READ_COMMITTED_SNAPSHOT, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public Snapshot_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snapshot_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSnapshot_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSnapshot_option(this);
		}
	}

	public final Snapshot_optionContext snapshot_option() throws RecognitionException {
		Snapshot_optionContext _localctx = new Snapshot_optionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_snapshot_option);
		int _la;
		try {
			setState(1125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLOW_SNAPSHOT_ISOLATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1120);
				match(ALLOW_SNAPSHOT_ISOLATION);
				setState(1121);
				on_off();
				}
				break;
			case READ_COMMITTED_SNAPSHOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				match(READ_COMMITTED_SNAPSHOT);
				setState(1123);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case OFF:
			case ON:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				((Snapshot_optionContext)_localctx).MEMORY_OPTIMIZED_ELEVATE_TO_SNAPSHOT = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
					((Snapshot_optionContext)_localctx).MEMORY_OPTIMIZED_ELEVATE_TO_SNAPSHOT = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_optionContext extends ParserRuleContext {
		public TerminalNode ANSI_NULL_DEFAULT() { return getToken(tsqlParser.ANSI_NULL_DEFAULT, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode ANSI_NULLS() { return getToken(tsqlParser.ANSI_NULLS, 0); }
		public TerminalNode ANSI_PADDING() { return getToken(tsqlParser.ANSI_PADDING, 0); }
		public TerminalNode ANSI_WARNINGS() { return getToken(tsqlParser.ANSI_WARNINGS, 0); }
		public TerminalNode ARITHABORT() { return getToken(tsqlParser.ARITHABORT, 0); }
		public TerminalNode COMPATIBILITY_LEVEL() { return getToken(tsqlParser.COMPATIBILITY_LEVEL, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode CONCAT_NULL_YIELDS_NULL() { return getToken(tsqlParser.CONCAT_NULL_YIELDS_NULL, 0); }
		public TerminalNode NUMERIC_ROUNDABORT() { return getToken(tsqlParser.NUMERIC_ROUNDABORT, 0); }
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(tsqlParser.QUOTED_IDENTIFIER, 0); }
		public TerminalNode RECURSIVE_TRIGGERS() { return getToken(tsqlParser.RECURSIVE_TRIGGERS, 0); }
		public Sql_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSql_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSql_option(this);
		}
	}

	public final Sql_optionContext sql_option() throws RecognitionException {
		Sql_optionContext _localctx = new Sql_optionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sql_option);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANSI_NULL_DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				match(ANSI_NULL_DEFAULT);
				setState(1128);
				on_off();
				}
				break;
			case ANSI_NULLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129);
				match(ANSI_NULLS);
				setState(1130);
				on_off();
				}
				break;
			case ANSI_PADDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
				match(ANSI_PADDING);
				setState(1132);
				on_off();
				}
				break;
			case ANSI_WARNINGS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1133);
				match(ANSI_WARNINGS);
				setState(1134);
				on_off();
				}
				break;
			case ARITHABORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1135);
				match(ARITHABORT);
				setState(1136);
				on_off();
				}
				break;
			case COMPATIBILITY_LEVEL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1137);
				match(COMPATIBILITY_LEVEL);
				setState(1138);
				match(EQUAL);
				setState(1139);
				match(DECIMAL);
				}
				break;
			case CONCAT_NULL_YIELDS_NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1140);
				match(CONCAT_NULL_YIELDS_NULL);
				setState(1141);
				on_off();
				}
				break;
			case NUMERIC_ROUNDABORT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1142);
				match(NUMERIC_ROUNDABORT);
				setState(1143);
				on_off();
				}
				break;
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 9);
				{
				setState(1144);
				match(QUOTED_IDENTIFIER);
				setState(1145);
				on_off();
				}
				break;
			case RECURSIVE_TRIGGERS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1146);
				match(RECURSIVE_TRIGGERS);
				setState(1147);
				on_off();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Target_recovery_time_optionContext extends ParserRuleContext {
		public TerminalNode TARGET_RECOVERY_TIME() { return getToken(tsqlParser.TARGET_RECOVERY_TIME, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode SECONDS() { return getToken(tsqlParser.SECONDS, 0); }
		public TerminalNode MINUTES() { return getToken(tsqlParser.MINUTES, 0); }
		public Target_recovery_time_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_recovery_time_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTarget_recovery_time_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTarget_recovery_time_option(this);
		}
	}

	public final Target_recovery_time_optionContext target_recovery_time_option() throws RecognitionException {
		Target_recovery_time_optionContext _localctx = new Target_recovery_time_optionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_target_recovery_time_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(TARGET_RECOVERY_TIME);
			setState(1151);
			match(EQUAL);
			setState(1152);
			match(DECIMAL);
			setState(1153);
			_la = _input.LA(1);
			if ( !(_la==MINUTES || _la==SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminationContext extends ParserRuleContext {
		public Token seconds;
		public TerminalNode ROLLBACK() { return getToken(tsqlParser.ROLLBACK, 0); }
		public TerminalNode AFTER() { return getToken(tsqlParser.AFTER, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode IMMEDIATE() { return getToken(tsqlParser.IMMEDIATE, 0); }
		public TerminalNode NO_WAIT() { return getToken(tsqlParser.NO_WAIT, 0); }
		public TerminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTermination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTermination(this);
		}
	}

	public final TerminationContext termination() throws RecognitionException {
		TerminationContext _localctx = new TerminationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_termination);
		try {
			setState(1161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				match(ROLLBACK);
				setState(1156);
				match(AFTER);
				setState(1157);
				((TerminationContext)_localctx).seconds = match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				match(ROLLBACK);
				setState(1159);
				match(IMMEDIATE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1160);
				match(NO_WAIT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_indexContext extends ParserRuleContext {
		public R_idContext name;
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Drop_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_index(this);
		}
	}

	public final Drop_indexContext drop_index() throws RecognitionException {
		Drop_indexContext _localctx = new Drop_indexContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_drop_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(DROP);
			setState(1164);
			match(INDEX);
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1165);
				match(IF);
				setState(1166);
				match(EXISTS);
				}
			}

			setState(1169);
			((Drop_indexContext)_localctx).name = r_id();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1170);
				match(ON);
				setState(1171);
				table_name();
				}
			}

			setState(1175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1174);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_procedureContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode PROCEDURE() { return getToken(tsqlParser.PROCEDURE, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Drop_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_procedure(this);
		}
	}

	public final Drop_procedureContext drop_procedure() throws RecognitionException {
		Drop_procedureContext _localctx = new Drop_procedureContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_drop_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(DROP);
			setState(1178);
			match(PROCEDURE);
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1179);
				match(IF);
				setState(1180);
				match(EXISTS);
				}
			}

			setState(1183);
			func_proc_name();
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1184);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_statisticsContext extends ParserRuleContext {
		public R_idContext name;
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode STATISTICS() { return getToken(tsqlParser.STATISTICS, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(tsqlParser.DOT, 0); }
		public Drop_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_statistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_statistics(this);
		}
	}

	public final Drop_statisticsContext drop_statistics() throws RecognitionException {
		Drop_statisticsContext _localctx = new Drop_statisticsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_drop_statistics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			match(DROP);
			setState(1188);
			match(STATISTICS);
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1189);
				table_name();
				setState(1190);
				match(DOT);
				}
				break;
			}
			setState(1194);
			((Drop_statisticsContext)_localctx).name = r_id();
			setState(1195);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_table(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(DROP);
			setState(1198);
			match(TABLE);
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1199);
				match(IF);
				setState(1200);
				match(EXISTS);
				}
			}

			setState(1203);
			table_name();
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1204);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_viewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(tsqlParser.VIEW, 0); }
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
		}
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Drop_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_view(this);
		}
	}

	public final Drop_viewContext drop_view() throws RecognitionException {
		Drop_viewContext _localctx = new Drop_viewContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_drop_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(DROP);
			setState(1208);
			match(VIEW);
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1209);
				match(IF);
				setState(1210);
				match(EXISTS);
				}
			}

			setState(1213);
			simple_name();
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1214);
				match(COMMA);
				setState(1215);
				simple_name();
				}
				}
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1221);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_typeContext extends ParserRuleContext {
		public Simple_nameContext name;
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode TYPE() { return getToken(tsqlParser.TYPE, 0); }
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Create_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_type(this);
		}
	}

	public final Create_typeContext create_type() throws RecognitionException {
		Create_typeContext _localctx = new Create_typeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(CREATE);
			setState(1225);
			match(TYPE);
			setState(1226);
			((Create_typeContext)_localctx).name = simple_name();
			setState(1227);
			match(FROM);
			setState(1228);
			data_type();
			setState(1229);
			default_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_typeContext extends ParserRuleContext {
		public Simple_nameContext name;
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode TYPE() { return getToken(tsqlParser.TYPE, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public Drop_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_type(this);
		}
	}

	public final Drop_typeContext drop_type() throws RecognitionException {
		Drop_typeContext _localctx = new Drop_typeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_drop_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(DROP);
			setState(1232);
			match(TYPE);
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1233);
				match(IF);
				setState(1234);
				match(EXISTS);
				}
			}

			setState(1237);
			((Drop_typeContext)_localctx).name = simple_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rowset_function_limitedContext extends ParserRuleContext {
		public OpenqueryContext openquery() {
			return getRuleContext(OpenqueryContext.class,0);
		}
		public OpendatasourceContext opendatasource() {
			return getRuleContext(OpendatasourceContext.class,0);
		}
		public Rowset_function_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset_function_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRowset_function_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRowset_function_limited(this);
		}
	}

	public final Rowset_function_limitedContext rowset_function_limited() throws RecognitionException {
		Rowset_function_limitedContext _localctx = new Rowset_function_limitedContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_rowset_function_limited);
		try {
			setState(1241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENQUERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				openquery();
				}
				break;
			case OPENDATASOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				opendatasource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenqueryContext extends ParserRuleContext {
		public R_idContext linked_server;
		public Token query;
		public TerminalNode OPENQUERY() { return getToken(tsqlParser.OPENQUERY, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(tsqlParser.COMMA, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public OpenqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOpenquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOpenquery(this);
		}
	}

	public final OpenqueryContext openquery() throws RecognitionException {
		OpenqueryContext _localctx = new OpenqueryContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_openquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(OPENQUERY);
			setState(1244);
			match(LR_BRACKET);
			setState(1245);
			((OpenqueryContext)_localctx).linked_server = r_id();
			setState(1246);
			match(COMMA);
			setState(1247);
			((OpenqueryContext)_localctx).query = match(STRING);
			setState(1248);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpendatasourceContext extends ParserRuleContext {
		public Token provider;
		public Token init;
		public R_idContext database;
		public R_idContext scheme;
		public R_idContext table;
		public TerminalNode OPENDATASOURCE() { return getToken(tsqlParser.OPENDATASOURCE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(tsqlParser.COMMA, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> DOT() { return getTokens(tsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(tsqlParser.DOT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(tsqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(tsqlParser.STRING, i);
		}
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public OpendatasourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opendatasource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOpendatasource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOpendatasource(this);
		}
	}

	public final OpendatasourceContext opendatasource() throws RecognitionException {
		OpendatasourceContext _localctx = new OpendatasourceContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_opendatasource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(OPENDATASOURCE);
			setState(1251);
			match(LR_BRACKET);
			setState(1252);
			((OpendatasourceContext)_localctx).provider = match(STRING);
			setState(1253);
			match(COMMA);
			setState(1254);
			((OpendatasourceContext)_localctx).init = match(STRING);
			setState(1255);
			match(RR_BRACKET);
			setState(1256);
			match(DOT);
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1108101562369L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -9220850245999262719L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & -8070459558675465653L) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & -6413215653674627739L) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & 41918743507263L) != 0)) {
				{
				setState(1257);
				((OpendatasourceContext)_localctx).database = r_id();
				}
			}

			setState(1260);
			match(DOT);
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1108101562369L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -9220850245999262719L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & -8070459558675465653L) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & -6413215653674627739L) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & 41918743507263L) != 0)) {
				{
				setState(1261);
				((OpendatasourceContext)_localctx).scheme = r_id();
				}
			}

			setState(1264);
			match(DOT);
			{
			setState(1265);
			((OpendatasourceContext)_localctx).table = r_id();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_statementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(tsqlParser.DECLARE, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Table_type_definitionContext table_type_definition() {
			return getRuleContext(Table_type_definitionContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public List<Declare_localContext> declare_local() {
			return getRuleContexts(Declare_localContext.class);
		}
		public Declare_localContext declare_local(int i) {
			return getRuleContext(Declare_localContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDeclare_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDeclare_statement(this);
		}
	}

	public final Declare_statementContext declare_statement() throws RecognitionException {
		Declare_statementContext _localctx = new Declare_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_declare_statement);
		int _la;
		try {
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				match(DECLARE);
				setState(1268);
				match(LOCAL_ID);
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1269);
					match(AS);
					}
				}

				setState(1272);
				table_type_definition();
				setState(1274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1273);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				match(DECLARE);
				setState(1277);
				declare_local();
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1278);
					match(COMMA);
					setState(1279);
					declare_local();
					}
					}
					setState(1284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1285);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cursor_statementContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(tsqlParser.CLOSE, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode DEALLOCATE() { return getToken(tsqlParser.DEALLOCATE, 0); }
		public Declare_cursorContext declare_cursor() {
			return getRuleContext(Declare_cursorContext.class,0);
		}
		public Fetch_cursorContext fetch_cursor() {
			return getRuleContext(Fetch_cursorContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(tsqlParser.OPEN, 0); }
		public Cursor_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCursor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCursor_statement(this);
		}
	}

	public final Cursor_statementContext cursor_statement() throws RecognitionException {
		Cursor_statementContext _localctx = new Cursor_statementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cursor_statement);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				match(CLOSE);
				setState(1292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1291);
					match(GLOBAL);
					}
					break;
				}
				setState(1294);
				cursor_name();
				setState(1296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1295);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(DEALLOCATE);
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1299);
					match(GLOBAL);
					}
					break;
				}
				setState(1302);
				cursor_name();
				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1303);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case DECLARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306);
				declare_cursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307);
				fetch_cursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1308);
				match(OPEN);
				setState(1310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1309);
					match(GLOBAL);
					}
					break;
				}
				setState(1312);
				cursor_name();
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1313);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Execute_statementContext extends ParserRuleContext {
		public Token return_status;
		public TerminalNode EXECUTE() { return getToken(tsqlParser.EXECUTE, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public List<Execute_statement_argContext> execute_statement_arg() {
			return getRuleContexts(Execute_statement_argContext.class);
		}
		public Execute_statement_argContext execute_statement_arg(int i) {
			return getRuleContext(Execute_statement_argContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<Execute_var_stringContext> execute_var_string() {
			return getRuleContexts(Execute_var_stringContext.class);
		}
		public Execute_var_stringContext execute_var_string(int i) {
			return getRuleContext(Execute_var_stringContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> PLUS() { return getTokens(tsqlParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(tsqlParser.PLUS, i);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode LOGIN() { return getToken(tsqlParser.LOGIN, 0); }
		public TerminalNode USER() { return getToken(tsqlParser.USER, 0); }
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Execute_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExecute_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExecute_statement(this);
		}
	}

	public final Execute_statementContext execute_statement() throws RecognitionException {
		Execute_statementContext _localctx = new Execute_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_execute_statement);
		int _la;
		try {
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				match(EXECUTE);
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL_ID) {
					{
					setState(1319);
					((Execute_statementContext)_localctx).return_status = match(LOCAL_ID);
					setState(1320);
					match(EQUAL);
					}
				}

				setState(1323);
				func_proc_name();
				setState(1332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1324);
					execute_statement_arg();
					setState(1329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1325);
						match(COMMA);
						setState(1326);
						execute_statement_arg();
						}
						}
						setState(1331);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1334);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337);
				match(EXECUTE);
				setState(1338);
				match(LR_BRACKET);
				setState(1339);
				execute_var_string();
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(1340);
					match(PLUS);
					setState(1341);
					execute_var_string();
					}
					}
					setState(1346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1347);
				match(RR_BRACKET);
				setState(1354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1348);
						match(AS);
						}
					}

					setState(1351);
					_la = _input.LA(1);
					if ( !(_la==USER || _la==LOGIN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1352);
					match(EQUAL);
					setState(1353);
					match(STRING);
					}
					break;
				}
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1356);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Execute_statement_argContext extends ParserRuleContext {
		public Token parameter;
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Constant_LOCAL_IDContext constant_LOCAL_ID() {
			return getRuleContext(Constant_LOCAL_IDContext.class,0);
		}
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public TerminalNode OUT() { return getToken(tsqlParser.OUT, 0); }
		public Execute_statement_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_statement_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExecute_statement_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExecute_statement_arg(this);
		}
	}

	public final Execute_statement_argContext execute_statement_arg() throws RecognitionException {
		Execute_statement_argContext _localctx = new Execute_statement_argContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_execute_statement_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1361);
				((Execute_statement_argContext)_localctx).parameter = match(LOCAL_ID);
				setState(1362);
				match(EQUAL);
				}
				break;
			}
			setState(1374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case DECIMAL:
			case ID:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				{
				setState(1367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOCAL_ID:
				case DECIMAL:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case PLUS:
				case MINUS:
					{
					setState(1365);
					constant_LOCAL_ID();
					}
					break;
				case FORCESEEK:
				case NEXT:
				case NUMERIC:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1366);
					r_id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1369);
					_la = _input.LA(1);
					if ( !(_la==OUT || _la==OUTPUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case DEFAULT:
				{
				setState(1372);
				match(DEFAULT);
				}
				break;
			case NULL:
				{
				setState(1373);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Execute_var_stringContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Execute_var_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_var_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExecute_var_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExecute_var_string(this);
		}
	}

	public final Execute_var_stringContext execute_var_string() throws RecognitionException {
		Execute_var_stringContext _localctx = new Execute_var_stringContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_execute_var_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			_la = _input.LA(1);
			if ( !(_la==LOCAL_ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Security_statementContext extends ParserRuleContext {
		public Table_nameContext on_id;
		public R_idContext to_principal;
		public R_idContext as_principal;
		public Execute_clauseContext execute_clause() {
			return getRuleContext(Execute_clauseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public List<TerminalNode> GRANT() { return getTokens(tsqlParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(tsqlParser.GRANT, i);
		}
		public TerminalNode TO() { return getToken(tsqlParser.TO, 0); }
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public Grant_permissionContext grant_permission() {
			return getRuleContext(Grant_permissionContext.class,0);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(tsqlParser.OPTION, 0); }
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode PRIVILEGES() { return getToken(tsqlParser.PRIVILEGES, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode REVERT() { return getToken(tsqlParser.REVERT, 0); }
		public TerminalNode COOKIE() { return getToken(tsqlParser.COOKIE, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Security_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_security_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSecurity_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSecurity_statement(this);
		}
	}

	public final Security_statementContext security_statement() throws RecognitionException {
		Security_statementContext _localctx = new Security_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_security_statement);
		int _la;
		try {
			setState(1426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1378);
				execute_clause();
				setState(1380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1379);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				match(GRANT);
				setState(1394);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1383);
					match(ALL);
					setState(1385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PRIVILEGES) {
						{
						setState(1384);
						match(PRIVILEGES);
						}
					}

					}
					break;
				case ALTER:
				case CREATE:
				case EXECUTE:
				case INSERT:
				case REFERENCES:
				case SELECT:
				case VIEW:
				case CONTROL:
				case IMPERSONATE:
				case SHOWPLAN:
				case TAKE:
					{
					setState(1387);
					grant_permission();
					setState(1392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LR_BRACKET) {
						{
						setState(1388);
						match(LR_BRACKET);
						setState(1389);
						column_name_list();
						setState(1390);
						match(RR_BRACKET);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1396);
					match(ON);
					setState(1397);
					((Security_statementContext)_localctx).on_id = table_name();
					}
				}

				setState(1400);
				match(TO);
				{
				setState(1401);
				((Security_statementContext)_localctx).to_principal = r_id();
				}
				setState(1405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1402);
					match(WITH);
					setState(1403);
					match(GRANT);
					setState(1404);
					match(OPTION);
					}
					break;
				}
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1407);
					match(AS);
					setState(1408);
					((Security_statementContext)_localctx).as_principal = r_id();
					}
				}

				setState(1412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1411);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case REVERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1414);
				match(REVERT);
				setState(1421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1415);
					match(LR_BRACKET);
					setState(1416);
					match(WITH);
					setState(1417);
					match(COOKIE);
					setState(1418);
					match(EQUAL);
					setState(1419);
					match(LOCAL_ID);
					setState(1420);
					match(RR_BRACKET);
					}
					break;
				}
				setState(1424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1423);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Grant_permissionContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(tsqlParser.EXECUTE, 0); }
		public TerminalNode VIEW() { return getToken(tsqlParser.VIEW, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode TAKE() { return getToken(tsqlParser.TAKE, 0); }
		public TerminalNode CONTROL() { return getToken(tsqlParser.CONTROL, 0); }
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public TerminalNode SHOWPLAN() { return getToken(tsqlParser.SHOWPLAN, 0); }
		public TerminalNode IMPERSONATE() { return getToken(tsqlParser.IMPERSONATE, 0); }
		public TerminalNode SELECT() { return getToken(tsqlParser.SELECT, 0); }
		public TerminalNode REFERENCES() { return getToken(tsqlParser.REFERENCES, 0); }
		public TerminalNode INSERT() { return getToken(tsqlParser.INSERT, 0); }
		public TerminalNode ALTER() { return getToken(tsqlParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(tsqlParser.DATABASE, 0); }
		public TerminalNode ANY() { return getToken(tsqlParser.ANY, 0); }
		public Grant_permissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_permission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterGrant_permission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitGrant_permission(this);
		}
	}

	public final Grant_permissionContext grant_permission() throws RecognitionException {
		Grant_permissionContext _localctx = new Grant_permissionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_grant_permission);
		int _la;
		try {
			setState(1454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				match(EXECUTE);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				match(VIEW);
				setState(1430);
				r_id();
				}
				break;
			case TAKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1431);
				match(TAKE);
				setState(1432);
				r_id();
				}
				break;
			case CONTROL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1433);
				match(CONTROL);
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1108101562369L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -9220850245999262719L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & -8070459558675465653L) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & -6413215653674627739L) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & 41918743507263L) != 0)) {
					{
					setState(1434);
					r_id();
					}
				}

				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1437);
				match(CREATE);
				setState(1438);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SHOWPLAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1439);
				match(SHOWPLAN);
				}
				break;
			case IMPERSONATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1440);
				match(IMPERSONATE);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1441);
				match(SELECT);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 9);
				{
				setState(1442);
				match(REFERENCES);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1443);
				match(INSERT);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1444);
				match(ALTER);
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY || _la==DATABASE || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1108101562369L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -9220850245999262719L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & -8070459558675465653L) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & -6413215653674627739L) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & 41918743507263L) != 0)) {
					{
					setState(1446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ANY) {
						{
						setState(1445);
						match(ANY);
						}
					}

					setState(1450);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case NEXT:
					case NUMERIC:
					case VALUE:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case CONTROL:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DATE:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case EXPAND:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FIRST_VALUE:
					case FOLLOWING:
					case FORCE:
					case FORCED:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
					case IMPERSONATE:
					case INT:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case IO:
					case KEEP:
					case KEEPFIXED:
					case KEYSET:
					case LAG:
					case LAST:
					case LAST_VALUE:
					case LEAD:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MAXDOP:
					case MAXRECURSION:
					case MIN:
					case MODIFY:
					case NAME:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLINE:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARAMETERIZATION:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case PRIVILEGES:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROBUST:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SIMPLE:
					case SIZE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case TEXTIMAGE_ON:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEWS:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case ZONE:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1448);
						r_id();
						}
						break;
					case DATABASE:
						{
						setState(1449);
						match(DATABASE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_statementContext extends ParserRuleContext {
		public R_idContext member_name;
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(tsqlParser.DOT, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(tsqlParser.CURSOR, 0); }
		public Declare_set_cursor_commonContext declare_set_cursor_common() {
			return getRuleContext(Declare_set_cursor_commonContext.class,0);
		}
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode READ() { return getToken(tsqlParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Set_specialContext set_special() {
			return getRuleContext(Set_specialContext.class,0);
		}
		public Set_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSet_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSet_statement(this);
		}
	}

	public final Set_statementContext set_statement() throws RecognitionException {
		Set_statementContext _localctx = new Set_statementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_set_statement);
		int _la;
		try {
			setState(1495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1456);
				match(SET);
				setState(1457);
				match(LOCAL_ID);
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1458);
					match(DOT);
					setState(1459);
					((Set_statementContext)_localctx).member_name = r_id();
					}
				}

				setState(1462);
				match(EQUAL);
				setState(1463);
				expression(0);
				setState(1465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1464);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				match(SET);
				setState(1468);
				match(LOCAL_ID);
				setState(1469);
				assignment_operator();
				setState(1470);
				expression(0);
				setState(1472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1471);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1474);
				match(SET);
				setState(1475);
				match(LOCAL_ID);
				setState(1476);
				match(EQUAL);
				setState(1477);
				match(CURSOR);
				setState(1478);
				declare_set_cursor_common();
				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1479);
					match(FOR);
					setState(1487);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case READ:
						{
						setState(1480);
						match(READ);
						setState(1481);
						match(ONLY);
						}
						break;
					case UPDATE:
						{
						setState(1482);
						match(UPDATE);
						setState(1485);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OF) {
							{
							setState(1483);
							match(OF);
							setState(1484);
							column_name_list();
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1491);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1494);
				set_special();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Transaction_statementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(tsqlParser.BEGIN, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(tsqlParser.DISTRIBUTED, 0); }
		public TerminalNode TRAN() { return getToken(tsqlParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(tsqlParser.TRANSACTION, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode MARK() { return getToken(tsqlParser.MARK, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode COMMIT() { return getToken(tsqlParser.COMMIT, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode DELAYED_DURABILITY() { return getToken(tsqlParser.DELAYED_DURABILITY, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode WORK() { return getToken(tsqlParser.WORK, 0); }
		public TerminalNode ROLLBACK() { return getToken(tsqlParser.ROLLBACK, 0); }
		public TerminalNode SAVE() { return getToken(tsqlParser.SAVE, 0); }
		public Transaction_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTransaction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTransaction_statement(this);
		}
	}

	public final Transaction_statementContext transaction_statement() throws RecognitionException {
		Transaction_statementContext _localctx = new Transaction_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_transaction_statement);
		int _la;
		try {
			setState(1574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497);
				match(BEGIN);
				setState(1498);
				match(DISTRIBUTED);
				setState(1499);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1500);
					r_id();
					}
					break;
				case 2:
					{
					setState(1501);
					match(LOCAL_ID);
					}
					break;
				}
				setState(1505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1504);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				match(BEGIN);
				setState(1508);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1511);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case NEXT:
					case NUMERIC:
					case VALUE:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case CONTROL:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DATE:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case EXPAND:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FIRST_VALUE:
					case FOLLOWING:
					case FORCE:
					case FORCED:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
					case IMPERSONATE:
					case INT:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case IO:
					case KEEP:
					case KEEPFIXED:
					case KEYSET:
					case LAG:
					case LAST:
					case LAST_VALUE:
					case LEAD:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MAXDOP:
					case MAXRECURSION:
					case MIN:
					case MODIFY:
					case NAME:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLINE:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARAMETERIZATION:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case PRIVILEGES:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROBUST:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SIMPLE:
					case SIZE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case TEXTIMAGE_ON:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEWS:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case ZONE:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1509);
						r_id();
						}
						break;
					case LOCAL_ID:
						{
						setState(1510);
						match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1516);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						setState(1513);
						match(WITH);
						setState(1514);
						match(MARK);
						setState(1515);
						match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1520);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				match(COMMIT);
				setState(1524);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1527);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case NEXT:
					case NUMERIC:
					case VALUE:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case CONTROL:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DATE:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case EXPAND:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FIRST_VALUE:
					case FOLLOWING:
					case FORCE:
					case FORCED:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
					case IMPERSONATE:
					case INT:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case IO:
					case KEEP:
					case KEEPFIXED:
					case KEYSET:
					case LAG:
					case LAST:
					case LAST_VALUE:
					case LEAD:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MAXDOP:
					case MAXRECURSION:
					case MIN:
					case MODIFY:
					case NAME:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLINE:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARAMETERIZATION:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case PRIVILEGES:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROBUST:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SIMPLE:
					case SIZE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case TEXTIMAGE_ON:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEWS:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case ZONE:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1525);
						r_id();
						}
						break;
					case LOCAL_ID:
						{
						setState(1526);
						match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						setState(1529);
						match(WITH);
						setState(1530);
						match(LR_BRACKET);
						setState(1531);
						match(DELAYED_DURABILITY);
						setState(1532);
						match(EQUAL);
						setState(1533);
						_la = _input.LA(1);
						if ( !(_la==OFF || _la==ON) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1534);
						match(RR_BRACKET);
						}
						break;
					}
					}
					break;
				}
				setState(1540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1539);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1542);
				match(COMMIT);
				setState(1544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1543);
					match(WORK);
					}
					break;
				}
				setState(1547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1546);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1549);
				match(ROLLBACK);
				setState(1550);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1551);
					r_id();
					}
					break;
				case 2:
					{
					setState(1552);
					match(LOCAL_ID);
					}
					break;
				}
				setState(1556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1555);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1558);
				match(ROLLBACK);
				setState(1560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1559);
					match(WORK);
					}
					break;
				}
				setState(1563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1562);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1565);
				match(SAVE);
				setState(1566);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1567);
					r_id();
					}
					break;
				case 2:
					{
					setState(1568);
					match(LOCAL_ID);
					}
					break;
				}
				setState(1572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1571);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Go_statementContext extends ParserRuleContext {
		public Token count;
		public TerminalNode GO() { return getToken(tsqlParser.GO, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Go_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_go_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterGo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitGo_statement(this);
		}
	}

	public final Go_statementContext go_statement() throws RecognitionException {
		Go_statementContext _localctx = new Go_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_go_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(GO);
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECIMAL) {
				{
				setState(1577);
				((Go_statementContext)_localctx).count = match(DECIMAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Use_statementContext extends ParserRuleContext {
		public R_idContext database;
		public TerminalNode USE() { return getToken(tsqlParser.USE, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUse_statement(this);
		}
	}

	public final Use_statementContext use_statement() throws RecognitionException {
		Use_statementContext _localctx = new Use_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_use_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(USE);
			setState(1581);
			((Use_statementContext)_localctx).database = r_id();
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1582);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Execute_clauseContext extends ParserRuleContext {
		public Token clause;
		public TerminalNode EXECUTE() { return getToken(tsqlParser.EXECUTE, 0); }
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode CALLER() { return getToken(tsqlParser.CALLER, 0); }
		public TerminalNode SELF() { return getToken(tsqlParser.SELF, 0); }
		public TerminalNode OWNER() { return getToken(tsqlParser.OWNER, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Execute_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExecute_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExecute_clause(this);
		}
	}

	public final Execute_clauseContext execute_clause() throws RecognitionException {
		Execute_clauseContext _localctx = new Execute_clauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_execute_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(EXECUTE);
			setState(1586);
			match(AS);
			setState(1587);
			((Execute_clauseContext)_localctx).clause = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CALLER || _la==OWNER || _la==SELF || _la==STRING) ) {
				((Execute_clauseContext)_localctx).clause = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_localContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declare_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDeclare_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDeclare_local(this);
		}
	}

	public final Declare_localContext declare_local() throws RecognitionException {
		Declare_localContext _localctx = new Declare_localContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declare_local);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(LOCAL_ID);
			setState(1591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1590);
				match(AS);
				}
			}

			setState(1593);
			data_type();
			setState(1596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1594);
				match(EQUAL);
				setState(1595);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_type_definitionContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Column_def_table_constraintsContext column_def_table_constraints() {
			return getRuleContext(Column_def_table_constraintsContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Table_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_type_definition(this);
		}
	}

	public final Table_type_definitionContext table_type_definition() throws RecognitionException {
		Table_type_definitionContext _localctx = new Table_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_table_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			match(TABLE);
			setState(1599);
			match(LR_BRACKET);
			setState(1600);
			column_def_table_constraints();
			setState(1601);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_def_table_constraintsContext extends ParserRuleContext {
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Column_def_table_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def_table_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_def_table_constraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_def_table_constraints(this);
		}
	}

	public final Column_def_table_constraintsContext column_def_table_constraints() throws RecognitionException {
		Column_def_table_constraintsContext _localctx = new Column_def_table_constraintsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_column_def_table_constraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			column_def_table_constraint();
			setState(1610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1605);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1604);
						match(COMMA);
						}
					}

					setState(1607);
					column_def_table_constraint();
					}
					} 
				}
				setState(1612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_def_table_constraintContext extends ParserRuleContext {
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Column_def_table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_def_table_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_def_table_constraint(this);
		}
	}

	public final Column_def_table_constraintContext column_def_table_constraint() throws RecognitionException {
		Column_def_table_constraintContext _localctx = new Column_def_table_constraintContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_column_def_table_constraint);
		try {
			setState(1615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1613);
				column_definition();
				}
				break;
			case CHECK:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				table_constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_definitionContext extends ParserRuleContext {
		public R_idContext constraint;
		public Token seed;
		public Token increment;
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(tsqlParser.COLLATE, 0); }
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(tsqlParser.ROWGUIDCOL, 0); }
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode VALUES() { return getToken(tsqlParser.VALUES, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(tsqlParser.COMMA, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_definition(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_column_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			r_id();
			setState(1621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case BIGINT:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DATETIME2:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SMALLINT:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TINYINT:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(1618);
				data_type();
				}
				break;
			case AS:
				{
				setState(1619);
				match(AS);
				setState(1620);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1623);
				match(COLLATE);
				setState(1624);
				r_id();
				}
			}

			setState(1628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1627);
				null_notnull();
				}
				break;
			}
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1630);
					match(CONSTRAINT);
					setState(1631);
					((Column_definitionContext)_localctx).constraint = r_id();
					}
				}

				setState(1634);
				match(DEFAULT);
				setState(1635);
				constant_expression();
				setState(1638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1636);
					match(WITH);
					setState(1637);
					match(VALUES);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1640);
				match(IDENTITY);
				setState(1646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1641);
					match(LR_BRACKET);
					setState(1642);
					((Column_definitionContext)_localctx).seed = match(DECIMAL);
					setState(1643);
					match(COMMA);
					setState(1644);
					((Column_definitionContext)_localctx).increment = match(DECIMAL);
					setState(1645);
					match(RR_BRACKET);
					}
					break;
				}
				setState(1651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1648);
					match(NOT);
					setState(1649);
					match(FOR);
					setState(1650);
					match(REPLICATION);
					}
					break;
				}
				}
				break;
			}
			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWGUIDCOL) {
				{
				setState(1655);
				match(ROWGUIDCOL);
				}
			}

			setState(1661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1658);
					column_constraint();
					}
					} 
				}
				setState(1663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode PRIMARY() { return getToken(tsqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(tsqlParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(tsqlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_constraint(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1664);
				match(CONSTRAINT);
				setState(1665);
				r_id();
				}
			}

			setState(1669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(1668);
				null_notnull();
				}
			}

			setState(1692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
				{
				setState(1674);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					setState(1671);
					match(PRIMARY);
					setState(1672);
					match(KEY);
					}
					break;
				case UNIQUE:
					{
					setState(1673);
					match(UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1676);
					clustered();
					}
				}

				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1679);
					index_options();
					}
					break;
				}
				}
				break;
			case CHECK:
				{
				setState(1682);
				match(CHECK);
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1683);
					match(NOT);
					setState(1684);
					match(FOR);
					setState(1685);
					match(REPLICATION);
					}
				}

				setState(1688);
				match(LR_BRACKET);
				setState(1689);
				search_condition(0);
				setState(1690);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public TerminalNode PRIMARY() { return getToken(tsqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(tsqlParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(tsqlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public TerminalNode ASC() { return getToken(tsqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(tsqlParser.DESC, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_constraint(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1694);
				match(CONSTRAINT);
				setState(1695);
				r_id();
				}
			}

			setState(1729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
				{
				setState(1701);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					setState(1698);
					match(PRIMARY);
					setState(1699);
					match(KEY);
					}
					break;
				case UNIQUE:
					{
					setState(1700);
					match(UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1703);
					clustered();
					}
				}

				setState(1706);
				match(LR_BRACKET);
				setState(1707);
				column_name_list();
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(1708);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1711);
				match(RR_BRACKET);
				setState(1713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1712);
					index_options();
					}
					break;
				}
				setState(1717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1715);
					match(ON);
					setState(1716);
					r_id();
					}
				}

				}
				break;
			case CHECK:
				{
				setState(1719);
				match(CHECK);
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1720);
					match(NOT);
					setState(1721);
					match(FOR);
					setState(1722);
					match(REPLICATION);
					}
				}

				setState(1725);
				match(LR_BRACKET);
				setState(1726);
				search_condition(0);
				setState(1727);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitIndex_options(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(WITH);
			setState(1732);
			match(LR_BRACKET);
			setState(1733);
			index_option();
			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1734);
				match(COMMA);
				setState(1735);
				index_option();
				}
				}
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1741);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_optionContext extends ParserRuleContext {
		public List<Simple_idContext> simple_id() {
			return getRuleContexts(Simple_idContext.class);
		}
		public Simple_idContext simple_id(int i) {
			return getRuleContext(Simple_idContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterIndex_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitIndex_option(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_index_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			simple_id();
			setState(1744);
			match(EQUAL);
			setState(1748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case ID:
				{
				setState(1745);
				simple_id();
				}
				break;
			case OFF:
			case ON:
				{
				setState(1746);
				on_off();
				}
				break;
			case DECIMAL:
				{
				setState(1747);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_cursorContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(tsqlParser.DECLARE, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(tsqlParser.CURSOR, 0); }
		public List<TerminalNode> FOR() { return getTokens(tsqlParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(tsqlParser.FOR, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public Declare_set_cursor_commonContext declare_set_cursor_common() {
			return getRuleContext(Declare_set_cursor_commonContext.class,0);
		}
		public TerminalNode INSENSITIVE() { return getToken(tsqlParser.INSENSITIVE, 0); }
		public TerminalNode SCROLL() { return getToken(tsqlParser.SCROLL, 0); }
		public TerminalNode READ() { return getToken(tsqlParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Declare_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDeclare_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDeclare_cursor(this);
		}
	}

	public final Declare_cursorContext declare_cursor() throws RecognitionException {
		Declare_cursorContext _localctx = new Declare_cursorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declare_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			match(DECLARE);
			setState(1751);
			cursor_name();
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(1752);
				match(CURSOR);
				setState(1762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(1753);
					declare_set_cursor_common();
					setState(1760);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FOR) {
						{
						setState(1754);
						match(FOR);
						setState(1755);
						match(UPDATE);
						setState(1758);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OF) {
							{
							setState(1756);
							match(OF);
							setState(1757);
							column_name_list();
							}
						}

						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSENSITIVE) {
					{
					setState(1764);
					match(INSENSITIVE);
					}
				}

				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCROLL) {
					{
					setState(1767);
					match(SCROLL);
					}
				}

				setState(1770);
				match(CURSOR);
				setState(1771);
				match(FOR);
				setState(1772);
				select_statement();
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1773);
					match(FOR);
					setState(1779);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case READ:
						{
						setState(1774);
						match(READ);
						setState(1775);
						match(ONLY);
						}
						break;
					case UPDATE:
						{
						setState(1776);
						match(UPDATE);
						}
						break;
					case OF:
						{
						{
						setState(1777);
						match(OF);
						setState(1778);
						column_name_list();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			}
			setState(1786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1785);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_set_cursor_commonContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode TYPE_WARNING() { return getToken(tsqlParser.TYPE_WARNING, 0); }
		public TerminalNode LOCAL() { return getToken(tsqlParser.LOCAL, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(tsqlParser.FORWARD_ONLY, 0); }
		public TerminalNode SCROLL() { return getToken(tsqlParser.SCROLL, 0); }
		public TerminalNode STATIC() { return getToken(tsqlParser.STATIC, 0); }
		public TerminalNode KEYSET() { return getToken(tsqlParser.KEYSET, 0); }
		public TerminalNode DYNAMIC() { return getToken(tsqlParser.DYNAMIC, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(tsqlParser.FAST_FORWARD, 0); }
		public TerminalNode READ_ONLY() { return getToken(tsqlParser.READ_ONLY, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(tsqlParser.SCROLL_LOCKS, 0); }
		public TerminalNode OPTIMISTIC() { return getToken(tsqlParser.OPTIMISTIC, 0); }
		public Declare_set_cursor_commonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_set_cursor_common; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDeclare_set_cursor_common(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDeclare_set_cursor_common(this);
		}
	}

	public final Declare_set_cursor_commonContext declare_set_cursor_common() throws RecognitionException {
		Declare_set_cursor_commonContext _localctx = new Declare_set_cursor_commonContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_declare_set_cursor_common);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL || _la==LOCAL) {
				{
				setState(1788);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==LOCAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORWARD_ONLY || _la==SCROLL) {
				{
				setState(1791);
				_la = _input.LA(1);
				if ( !(_la==FORWARD_ONLY || _la==SCROLL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & 1099511627905L) != 0) || _la==STATIC) {
				{
				setState(1794);
				_la = _input.LA(1);
				if ( !(((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & 1099511627905L) != 0) || _la==STATIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & 274878431233L) != 0)) {
				{
				setState(1797);
				_la = _input.LA(1);
				if ( !(((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & 274878431233L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_WARNING) {
				{
				setState(1800);
				match(TYPE_WARNING);
				}
			}

			setState(1803);
			match(FOR);
			setState(1804);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fetch_cursorContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(tsqlParser.FETCH, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public TerminalNode PRIOR() { return getToken(tsqlParser.PRIOR, 0); }
		public TerminalNode FIRST() { return getToken(tsqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(tsqlParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode ABSOLUTE() { return getToken(tsqlParser.ABSOLUTE, 0); }
		public TerminalNode RELATIVE() { return getToken(tsqlParser.RELATIVE, 0); }
		public Fetch_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFetch_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFetch_cursor(this);
		}
	}

	public final Fetch_cursorContext fetch_cursor() throws RecognitionException {
		Fetch_cursorContext _localctx = new Fetch_cursorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_fetch_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			match(FETCH);
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(1813);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEXT:
					{
					setState(1807);
					match(NEXT);
					}
					break;
				case PRIOR:
					{
					setState(1808);
					match(PRIOR);
					}
					break;
				case FIRST:
					{
					setState(1809);
					match(FIRST);
					}
					break;
				case LAST:
					{
					setState(1810);
					match(LAST);
					}
					break;
				case ABSOLUTE:
				case RELATIVE:
					{
					setState(1811);
					_la = _input.LA(1);
					if ( !(_la==ABSOLUTE || _la==RELATIVE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1812);
					expression(0);
					}
					break;
				case FROM:
					break;
				default:
					break;
				}
				setState(1815);
				match(FROM);
				}
				break;
			}
			setState(1819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(1818);
				match(GLOBAL);
				}
				break;
			}
			setState(1821);
			cursor_name();
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1822);
				match(INTO);
				setState(1823);
				match(LOCAL_ID);
				setState(1828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1824);
					match(COMMA);
					setState(1825);
					match(LOCAL_ID);
					}
					}
					setState(1830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(1833);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_specialContext extends ParserRuleContext {
		public R_idContext key;
		public R_idContext value;
		public Token set_type;
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public Constant_LOCAL_IDContext constant_LOCAL_ID() {
			return getRuleContext(Constant_LOCAL_IDContext.class,0);
		}
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode ISOLATION() { return getToken(tsqlParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(tsqlParser.LEVEL, 0); }
		public TerminalNode TRANSACTION() { return getToken(tsqlParser.TRANSACTION, 0); }
		public TerminalNode READ() { return getToken(tsqlParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(tsqlParser.UNCOMMITTED, 0); }
		public TerminalNode COMMITTED() { return getToken(tsqlParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(tsqlParser.REPEATABLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(tsqlParser.SNAPSHOT, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(tsqlParser.SERIALIZABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IDENTITY_INSERT() { return getToken(tsqlParser.IDENTITY_INSERT, 0); }
		public TerminalNode ANSI_NULLS() { return getToken(tsqlParser.ANSI_NULLS, 0); }
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(tsqlParser.QUOTED_IDENTIFIER, 0); }
		public TerminalNode ANSI_PADDING() { return getToken(tsqlParser.ANSI_PADDING, 0); }
		public TerminalNode STATISTICS() { return getToken(tsqlParser.STATISTICS, 0); }
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public TerminalNode IO() { return getToken(tsqlParser.IO, 0); }
		public Set_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSet_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSet_special(this);
		}
	}

	public final Set_specialContext set_special() throws RecognitionException {
		Set_specialContext _localctx = new Set_specialContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_set_special);
		int _la;
		try {
			setState(1883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				match(SET);
				setState(1837);
				((Set_specialContext)_localctx).key = r_id();
				setState(1841);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case NEXT:
				case NUMERIC:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1838);
					((Set_specialContext)_localctx).value = r_id();
					}
					break;
				case LOCAL_ID:
				case DECIMAL:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case PLUS:
				case MINUS:
					{
					setState(1839);
					constant_LOCAL_ID();
					}
					break;
				case OFF:
				case ON:
					{
					setState(1840);
					on_off();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(1843);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				match(SET);
				setState(1847);
				((Set_specialContext)_localctx).set_type = match(TRANSACTION);
				setState(1848);
				match(ISOLATION);
				setState(1849);
				match(LEVEL);
				setState(1858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(1850);
					match(READ);
					setState(1851);
					match(UNCOMMITTED);
					}
					break;
				case 2:
					{
					setState(1852);
					match(READ);
					setState(1853);
					match(COMMITTED);
					}
					break;
				case 3:
					{
					setState(1854);
					match(REPEATABLE);
					setState(1855);
					match(READ);
					}
					break;
				case 4:
					{
					setState(1856);
					match(SNAPSHOT);
					}
					break;
				case 5:
					{
					setState(1857);
					match(SERIALIZABLE);
					}
					break;
				}
				setState(1861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(1860);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1863);
				match(SET);
				setState(1864);
				((Set_specialContext)_localctx).set_type = match(IDENTITY_INSERT);
				setState(1865);
				table_name();
				setState(1866);
				on_off();
				setState(1868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(1867);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1870);
				match(SET);
				setState(1871);
				((Set_specialContext)_localctx).set_type = match(ANSI_NULLS);
				setState(1872);
				on_off();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1873);
				match(SET);
				setState(1874);
				((Set_specialContext)_localctx).set_type = match(QUOTED_IDENTIFIER);
				setState(1875);
				on_off();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1876);
				match(SET);
				setState(1877);
				((Set_specialContext)_localctx).set_type = match(ANSI_PADDING);
				setState(1878);
				on_off();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1879);
				match(SET);
				setState(1880);
				((Set_specialContext)_localctx).set_type = match(STATISTICS);
				setState(1881);
				_la = _input.LA(1);
				if ( !(_la==IO || _la==TIME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1882);
				on_off();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_LOCAL_IDContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Constant_LOCAL_IDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_LOCAL_ID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterConstant_LOCAL_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitConstant_LOCAL_ID(this);
		}
	}

	public final Constant_LOCAL_IDContext constant_LOCAL_ID() throws RecognitionException {
		Constant_LOCAL_IDContext _localctx = new Constant_LOCAL_IDContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_constant_LOCAL_ID);
		try {
			setState(1887);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1885);
				constant();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1886);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Binary_operator_expressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(tsqlParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(tsqlParser.DIVIDE, 0); }
		public TerminalNode MODULE() { return getToken(tsqlParser.MODULE, 0); }
		public TerminalNode PLUS() { return getToken(tsqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(tsqlParser.MINUS, 0); }
		public TerminalNode BIT_AND() { return getToken(tsqlParser.BIT_AND, 0); }
		public TerminalNode BIT_XOR() { return getToken(tsqlParser.BIT_XOR, 0); }
		public TerminalNode BIT_OR() { return getToken(tsqlParser.BIT_OR, 0); }
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Binary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBinary_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBinary_operator_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Percentile_cont_expressionContext extends ExpressionContext {
		public Percentile_contContext percentile_cont() {
			return getRuleContext(Percentile_contContext.class,0);
		}
		public Percentile_cont_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterPercentile_cont_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitPercentile_cont_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Primitive_expressionContext extends ExpressionContext {
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Primitive_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterPrimitive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitPrimitive_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bracket_expressionContext extends ExpressionContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Bracket_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBracket_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBracket_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operator_expressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BIT_NOT() { return getToken(tsqlParser.BIT_NOT, 0); }
		public TerminalNode PLUS() { return getToken(tsqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(tsqlParser.MINUS, 0); }
		public Unary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUnary_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUnary_operator_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_expressionContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(tsqlParser.COLLATE, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Function_call_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFunction_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFunction_call_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Conversion_expressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AT() { return getToken(tsqlParser.AT, 0); }
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(tsqlParser.ZONE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Conversion_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterConversion_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitConversion_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Case_expressionContext extends ExpressionContext {
		public ExpressionContext caseExpr;
		public ExpressionContext elseExpr;
		public TerminalNode CASE() { return getToken(tsqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Switch_sectionContext> switch_section() {
			return getRuleContexts(Switch_sectionContext.class);
		}
		public Switch_sectionContext switch_section(int i) {
			return getRuleContext(Switch_sectionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(tsqlParser.ELSE, 0); }
		public List<Switch_search_condition_sectionContext> switch_search_condition_section() {
			return getRuleContexts(Switch_search_condition_sectionContext.class);
		}
		public Switch_search_condition_sectionContext switch_search_condition_section(int i) {
			return getRuleContext(Switch_search_condition_sectionContext.class,i);
		}
		public Case_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCase_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Column_ref_expressionContext extends ExpressionContext {
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public Column_ref_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_ref_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_ref_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class String_agg_expressionContext extends ExpressionContext {
		public String_aggContext string_agg() {
			return getRuleContext(String_aggContext.class,0);
		}
		public String_agg_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterString_agg_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitString_agg_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Subquery_expressionContext extends ExpressionContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Subquery_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSubquery_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSubquery_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Over_clause_expressionContext extends ExpressionContext {
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public Over_clause_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOver_clause_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOver_clause_expression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1890);
				match(DEFAULT);
				}
				break;
			case 2:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1891);
				match(NULL);
				}
				break;
			case 3:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1892);
				match(LOCAL_ID);
				}
				break;
			case 4:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1893);
				constant();
				}
				break;
			case 5:
				{
				_localctx = new Function_call_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1894);
				function_call();
				}
				break;
			case 6:
				{
				_localctx = new Case_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1895);
				match(CASE);
				setState(1896);
				((Case_expressionContext)_localctx).caseExpr = expression(0);
				setState(1898); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1897);
					switch_section();
					}
					}
					setState(1900); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1902);
					match(ELSE);
					setState(1903);
					((Case_expressionContext)_localctx).elseExpr = expression(0);
					}
				}

				setState(1906);
				match(END);
				}
				break;
			case 7:
				{
				_localctx = new Case_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1908);
				match(CASE);
				setState(1910); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1909);
					switch_search_condition_section();
					}
					}
					setState(1912); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1914);
					match(ELSE);
					setState(1915);
					((Case_expressionContext)_localctx).elseExpr = expression(0);
					}
				}

				setState(1918);
				match(END);
				}
				break;
			case 8:
				{
				_localctx = new Column_ref_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1920);
				full_column_name();
				}
				break;
			case 9:
				{
				_localctx = new Bracket_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1921);
				match(LR_BRACKET);
				setState(1922);
				expression(0);
				setState(1923);
				match(RR_BRACKET);
				}
				break;
			case 10:
				{
				_localctx = new Subquery_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1925);
				match(LR_BRACKET);
				setState(1926);
				subquery();
				setState(1927);
				match(RR_BRACKET);
				}
				break;
			case 11:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1929);
				((Unary_operator_expressionContext)_localctx).op = match(BIT_NOT);
				setState(1930);
				expression(8);
				}
				break;
			case 12:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1931);
				((Unary_operator_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Unary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1932);
				expression(6);
				}
				break;
			case 13:
				{
				_localctx = new Over_clause_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1933);
				over_clause();
				}
				break;
			case 14:
				{
				_localctx = new Percentile_cont_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1934);
				percentile_cont();
				}
				break;
			case 15:
				{
				_localctx = new String_agg_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1935);
				string_agg();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1956);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
					case 1:
						{
						_localctx = new Conversion_expressionContext(new ExpressionContext(_parentctx, _parentState));
						((Conversion_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1938);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1939);
						match(AT);
						setState(1940);
						match(TIME);
						setState(1941);
						match(ZONE);
						setState(1942);
						((Conversion_expressionContext)_localctx).right = expression(15);
						}
						break;
					case 2:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						((Binary_operator_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1943);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1944);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 461)) & ~0x3f) == 0 && ((1L << (_la - 461)) & 7L) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1945);
						((Binary_operator_expressionContext)_localctx).right = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						((Binary_operator_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1946);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1947);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 464)) & ~0x3f) == 0 && ((1L << (_la - 464)) & 59L) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1948);
						((Binary_operator_expressionContext)_localctx).right = expression(6);
						}
						break;
					case 4:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						((Binary_operator_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1949);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1950);
						comparison_operator();
						setState(1951);
						((Binary_operator_expressionContext)_localctx).right = expression(5);
						}
						break;
					case 5:
						{
						_localctx = new Function_call_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1953);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1954);
						match(COLLATE);
						setState(1955);
						r_id();
						}
						break;
					}
					} 
				}
				setState(1960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_expressionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_constant_expression);
		try {
			setState(1969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1961);
				match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1962);
				constant();
				}
				break;
			case COALESCE:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case FORCESEEK:
			case IDENTITY:
			case IIF:
			case LEFT:
			case NEXT:
			case NULLIF:
			case NUMERIC:
			case RIGHT:
			case SESSION_USER:
			case SYSTEM_USER:
			case TRY_CAST:
			case TRY_CONVERT:
			case TRY_PARSE:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case BINARY_CHECKSUM:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DATEADD:
			case DATEDIFF:
			case DATENAME:
			case DATEPART:
			case DATETIMEOFFSETFROMPARTS:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MIN_ACTIVE_ROWVERSION:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARSE:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case STRING_SPLIT:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(1963);
				function_call();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(1964);
				match(LOCAL_ID);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(1965);
				match(LR_BRACKET);
				setState(1966);
				constant_expression();
				setState(1967);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSubquery(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_expressionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode XMLNAMESPACES() { return getToken(tsqlParser.XMLNAMESPACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public With_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWith_expression(this);
		}
	}

	public final With_expressionContext with_expression() throws RecognitionException {
		With_expressionContext _localctx = new With_expressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_with_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			match(WITH);
			setState(1976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(1974);
				match(XMLNAMESPACES);
				setState(1975);
				match(COMMA);
				}
				break;
			}
			setState(1978);
			common_table_expression();
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1979);
				match(COMMA);
				setState(1980);
				common_table_expression();
				}
				}
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_table_expressionContext extends ParserRuleContext {
		public R_idContext expression_name;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public List<TerminalNode> LR_BRACKET() { return getTokens(tsqlParser.LR_BRACKET); }
		public TerminalNode LR_BRACKET(int i) {
			return getToken(tsqlParser.LR_BRACKET, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<TerminalNode> RR_BRACKET() { return getTokens(tsqlParser.RR_BRACKET); }
		public TerminalNode RR_BRACKET(int i) {
			return getToken(tsqlParser.RR_BRACKET, i);
		}
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCommon_table_expression(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			((Common_table_expressionContext)_localctx).expression_name = r_id();
			setState(1991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(1987);
				match(LR_BRACKET);
				setState(1988);
				column_name_list();
				setState(1989);
				match(RR_BRACKET);
				}
			}

			setState(1993);
			match(AS);
			setState(1994);
			match(LR_BRACKET);
			setState(1995);
			select_statement();
			setState(1996);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_elemContext extends ParserRuleContext {
		public Token name;
		public R_idContext udt_column_name;
		public R_idContext method_name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode DOT() { return getToken(tsqlParser.DOT, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public Update_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUpdate_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUpdate_elem(this);
		}
	}

	public final Update_elemContext update_elem() throws RecognitionException {
		Update_elemContext _localctx = new Update_elemContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_update_elem);
		try {
			setState(2014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2000);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case NEXT:
				case NUMERIC:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1998);
					full_column_name();
					}
					break;
				case LOCAL_ID:
					{
					setState(1999);
					((Update_elemContext)_localctx).name = match(LOCAL_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2004);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(2002);
					match(EQUAL);
					}
					break;
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
				case AND_ASSIGN:
				case XOR_ASSIGN:
				case OR_ASSIGN:
					{
					setState(2003);
					assignment_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2006);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2007);
				((Update_elemContext)_localctx).udt_column_name = r_id();
				setState(2008);
				match(DOT);
				setState(2009);
				((Update_elemContext)_localctx).method_name = r_id();
				setState(2010);
				match(LR_BRACKET);
				setState(2011);
				expression_list();
				setState(2012);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Search_condition_listContext extends ParserRuleContext {
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Search_condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSearch_condition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSearch_condition_list(this);
		}
	}

	public final Search_condition_listContext search_condition_list() throws RecognitionException {
		Search_condition_listContext _localctx = new Search_condition_listContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_search_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			search_condition(0);
			setState(2021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2017);
				match(COMMA);
				setState(2018);
				search_condition(0);
				}
				}
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Search_conditionContext extends ParserRuleContext {
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
	 
		public Search_conditionContext() { }
		public void copyFrom(Search_conditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Search_cond_orContext extends Search_conditionContext {
		public Search_conditionContext left;
		public Token op;
		public Search_conditionContext right;
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(tsqlParser.OR, 0); }
		public Search_cond_orContext(Search_conditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSearch_cond_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSearch_cond_or(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Search_cond_predContext extends Search_conditionContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Search_cond_predContext(Search_conditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSearch_cond_pred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSearch_cond_pred(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Search_cond_andContext extends Search_conditionContext {
		public Search_conditionContext left;
		public Token op;
		public Search_conditionContext right;
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(tsqlParser.AND, 0); }
		public Search_cond_andContext(Search_conditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSearch_cond_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSearch_cond_and(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		return search_condition(0);
	}

	private Search_conditionContext search_condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, _parentState);
		Search_conditionContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_search_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Search_cond_predContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2025);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(2035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2033);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
					case 1:
						{
						_localctx = new Search_cond_andContext(new Search_conditionContext(_parentctx, _parentState));
						((Search_cond_andContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_search_condition);
						setState(2027);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2028);
						((Search_cond_andContext)_localctx).op = match(AND);
						setState(2029);
						((Search_cond_andContext)_localctx).right = search_condition(4);
						}
						break;
					case 2:
						{
						_localctx = new Search_cond_orContext(new Search_conditionContext(_parentctx, _parentState));
						((Search_cond_orContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_search_condition);
						setState(2030);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2031);
						((Search_cond_orContext)_localctx).op = match(OR);
						setState(2032);
						((Search_cond_orContext)_localctx).right = search_condition(3);
						}
						break;
					}
					} 
				}
				setState(2037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Binary_in_expressionContext extends PredicateContext {
		public ExpressionContext left;
		public Token op;
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(tsqlParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public Binary_in_expressionContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBinary_in_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBinary_in_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operator_expression2Context extends PredicateContext {
		public Token op;
		public SubqueryContext expr;
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Unary_operator_expression2Context(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUnary_operator_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUnary_operator_expression2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Binary_mod_expressionContext extends PredicateContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext expression;
		public List<ExpressionContext> right = new ArrayList<ExpressionContext>();
		public TerminalNode AND() { return getToken(tsqlParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(tsqlParser.BETWEEN, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode LIKE() { return getToken(tsqlParser.LIKE, 0); }
		public TerminalNode ESCAPE() { return getToken(tsqlParser.ESCAPE, 0); }
		public Binary_mod_expressionContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBinary_mod_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBinary_mod_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operator_expression3Context extends PredicateContext {
		public Token op;
		public PredicateContext expr;
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Unary_operator_expression3Context(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUnary_operator_expression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUnary_operator_expression3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bracket_search_expressionContext extends PredicateContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Bracket_search_expressionContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBracket_search_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBracket_search_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Sublink_expressionContext extends PredicateContext {
		public ExpressionContext test_expr;
		public Comparison_operatorContext op;
		public Token pref;
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(tsqlParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(tsqlParser.ANY, 0); }
		public Sublink_expressionContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSublink_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSublink_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Binary_operator_expression2Context extends PredicateContext {
		public ExpressionContext left;
		public Comparison_operatorContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public TerminalNode IS() { return getToken(tsqlParser.IS, 0); }
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public Binary_operator_expression2Context(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBinary_operator_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBinary_operator_expression2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Decimal_expressionContext extends PredicateContext {
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Decimal_expressionContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDecimal_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDecimal_expression(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_predicate);
		int _la;
		try {
			setState(2096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				_localctx = new Unary_operator_expression3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2038);
				((Unary_operator_expression3Context)_localctx).op = match(NOT);
				setState(2039);
				((Unary_operator_expression3Context)_localctx).expr = predicate();
				}
				break;
			case 2:
				_localctx = new Unary_operator_expression2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2040);
				((Unary_operator_expression2Context)_localctx).op = match(EXISTS);
				setState(2041);
				match(LR_BRACKET);
				setState(2042);
				((Unary_operator_expression2Context)_localctx).expr = subquery();
				setState(2043);
				match(RR_BRACKET);
				}
				break;
			case 3:
				_localctx = new Binary_operator_expression2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2045);
				((Binary_operator_expression2Context)_localctx).left = expression(0);
				setState(2046);
				((Binary_operator_expression2Context)_localctx).op = comparison_operator();
				setState(2047);
				((Binary_operator_expression2Context)_localctx).right = expression(0);
				}
				break;
			case 4:
				_localctx = new Sublink_expressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2049);
				((Sublink_expressionContext)_localctx).test_expr = expression(0);
				setState(2050);
				((Sublink_expressionContext)_localctx).op = comparison_operator();
				setState(2051);
				((Sublink_expressionContext)_localctx).pref = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((Sublink_expressionContext)_localctx).pref = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2052);
				match(LR_BRACKET);
				setState(2053);
				subquery();
				setState(2054);
				match(RR_BRACKET);
				}
				break;
			case 5:
				_localctx = new Binary_mod_expressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2056);
				((Binary_mod_expressionContext)_localctx).left = expression(0);
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2057);
					match(NOT);
					}
				}

				setState(2060);
				((Binary_mod_expressionContext)_localctx).op = match(BETWEEN);
				setState(2061);
				((Binary_mod_expressionContext)_localctx).expression = expression(0);
				((Binary_mod_expressionContext)_localctx).right.add(((Binary_mod_expressionContext)_localctx).expression);
				setState(2062);
				match(AND);
				setState(2063);
				((Binary_mod_expressionContext)_localctx).expression = expression(0);
				((Binary_mod_expressionContext)_localctx).right.add(((Binary_mod_expressionContext)_localctx).expression);
				}
				break;
			case 6:
				_localctx = new Binary_in_expressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2065);
				((Binary_in_expressionContext)_localctx).left = expression(0);
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2066);
					match(NOT);
					}
				}

				setState(2069);
				((Binary_in_expressionContext)_localctx).op = match(IN);
				setState(2070);
				match(LR_BRACKET);
				setState(2073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2071);
					subquery();
					}
					break;
				case 2:
					{
					setState(2072);
					expression_list();
					}
					break;
				}
				setState(2075);
				match(RR_BRACKET);
				}
				break;
			case 7:
				_localctx = new Binary_mod_expressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2077);
				((Binary_mod_expressionContext)_localctx).left = expression(0);
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2078);
					match(NOT);
					}
				}

				setState(2081);
				((Binary_mod_expressionContext)_localctx).op = match(LIKE);
				setState(2082);
				((Binary_mod_expressionContext)_localctx).expression = expression(0);
				((Binary_mod_expressionContext)_localctx).right.add(((Binary_mod_expressionContext)_localctx).expression);
				setState(2085);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2083);
					match(ESCAPE);
					setState(2084);
					((Binary_mod_expressionContext)_localctx).expression = expression(0);
					((Binary_mod_expressionContext)_localctx).right.add(((Binary_mod_expressionContext)_localctx).expression);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new Binary_operator_expression2Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2087);
				((Binary_operator_expression2Context)_localctx).left = expression(0);
				setState(2088);
				((Binary_operator_expression2Context)_localctx).op = match(IS);
				setState(2089);
				((Binary_operator_expression2Context)_localctx).right = null_notnull();
				}
				break;
			case 9:
				_localctx = new Bracket_search_expressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2091);
				match(LR_BRACKET);
				setState(2092);
				search_condition(0);
				setState(2093);
				match(RR_BRACKET);
				}
				break;
			case 10:
				_localctx = new Decimal_expressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2095);
				match(DECIMAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_expressionContext extends ParserRuleContext {
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
	 
		public Query_expressionContext() { }
		public void copyFrom(Query_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bracket_query_expressionContext extends Query_expressionContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Bracket_query_expressionContext(Query_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBracket_query_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBracket_query_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Query_specification_expressionContext extends Query_expressionContext {
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Query_specification_expressionContext(Query_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterQuery_specification_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitQuery_specification_expression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Union_query_expressionContext extends Query_expressionContext {
		public Query_expressionContext left;
		public Union_opContext op;
		public Query_expressionContext right;
		public List<Query_expressionContext> query_expression() {
			return getRuleContexts(Query_expressionContext.class);
		}
		public Query_expressionContext query_expression(int i) {
			return getRuleContext(Query_expressionContext.class,i);
		}
		public Union_opContext union_op() {
			return getRuleContext(Union_opContext.class,0);
		}
		public Union_query_expressionContext(Query_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUnion_query_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUnion_query_expression(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		return query_expression(0);
	}

	private Query_expressionContext query_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, _parentState);
		Query_expressionContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_query_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LR_BRACKET:
				{
				_localctx = new Bracket_query_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2099);
				match(LR_BRACKET);
				setState(2100);
				query_expression(0);
				setState(2101);
				match(RR_BRACKET);
				}
				break;
			case SELECT:
				{
				_localctx = new Query_specification_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2103);
				query_specification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Union_query_expressionContext(new Query_expressionContext(_parentctx, _parentState));
					((Union_query_expressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_query_expression);
					setState(2106);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2107);
					((Union_query_expressionContext)_localctx).op = union_op();
					setState(2108);
					((Union_query_expressionContext)_localctx).right = query_expression(3);
					}
					} 
				}
				setState(2114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_opContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(tsqlParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(tsqlParser.EXCEPT, 0); }
		public TerminalNode INTERSECT() { return getToken(tsqlParser.INTERSECT, 0); }
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public Union_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUnion_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUnion_op(this);
		}
	}

	public final Union_opContext union_op() throws RecognitionException {
		Union_opContext _localctx = new Union_opContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_union_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION:
				{
				setState(2115);
				match(UNION);
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(2116);
					match(ALL);
					}
				}

				}
				break;
			case EXCEPT:
				{
				setState(2119);
				match(EXCEPT);
				}
				break;
			case INTERSECT:
				{
				setState(2120);
				match(INTERSECT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_specificationContext extends ParserRuleContext {
		public Token pref;
		public Search_conditionContext where;
		public Search_conditionContext having;
		public TerminalNode SELECT() { return getToken(tsqlParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Top_clauseContext top_clause() {
			return getRuleContext(Top_clauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public Table_sourcesContext table_sources() {
			return getRuleContext(Table_sourcesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(tsqlParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(tsqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public List<Group_by_itemContext> group_by_item() {
			return getRuleContexts(Group_by_itemContext.class);
		}
		public Group_by_itemContext group_by_item(int i) {
			return getRuleContext(Group_by_itemContext.class,i);
		}
		public Group_by_grouping_setsContext group_by_grouping_sets() {
			return getRuleContext(Group_by_grouping_setsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode HAVING() { return getToken(tsqlParser.HAVING, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public TerminalNode CUBE() { return getToken(tsqlParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(tsqlParser.ROLLUP, 0); }
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(tsqlParser.DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Query_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterQuery_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitQuery_specification(this);
		}
	}

	public final Query_specificationContext query_specification() throws RecognitionException {
		Query_specificationContext _localctx = new Query_specificationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_query_specification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			match(SELECT);
			setState(2125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(2124);
				((Query_specificationContext)_localctx).pref = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
					((Query_specificationContext)_localctx).pref = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(2127);
				top_clause();
				}
			}

			setState(2130);
			select_list();
			setState(2133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2131);
				match(INTO);
				setState(2132);
				table_name();
				}
				break;
			}
			setState(2137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				{
				setState(2135);
				match(FROM);
				setState(2136);
				table_sources();
				}
				break;
			}
			setState(2141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				{
				setState(2139);
				match(WHERE);
				setState(2140);
				((Query_specificationContext)_localctx).where = search_condition(0);
				}
				break;
			}
			setState(2153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2143);
				match(GROUP);
				setState(2144);
				match(BY);
				setState(2145);
				group_by_item();
				setState(2150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2146);
						match(COMMA);
						setState(2147);
						group_by_item();
						}
						} 
					}
					setState(2152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
				}
				}
				break;
			}
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2155);
				group_by_grouping_sets();
				}
				break;
			}
			setState(2160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(2158);
				match(WITH);
				setState(2159);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2162);
				match(HAVING);
				setState(2163);
				((Query_specificationContext)_localctx).having = search_condition(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_by_grouping_setsContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(tsqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public TerminalNode GROUPING() { return getToken(tsqlParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(tsqlParser.SETS, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<Grouping_setContext> grouping_set() {
			return getRuleContexts(Grouping_setContext.class);
		}
		public Grouping_setContext grouping_set(int i) {
			return getRuleContext(Grouping_setContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Group_by_grouping_setsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_grouping_sets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterGroup_by_grouping_sets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitGroup_by_grouping_sets(this);
		}
	}

	public final Group_by_grouping_setsContext group_by_grouping_sets() throws RecognitionException {
		Group_by_grouping_setsContext _localctx = new Group_by_grouping_setsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_group_by_grouping_sets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			match(GROUP);
			setState(2167);
			match(BY);
			setState(2168);
			match(GROUPING);
			setState(2169);
			match(SETS);
			setState(2170);
			match(LR_BRACKET);
			setState(2171);
			grouping_set();
			setState(2176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2172);
				match(COMMA);
				setState(2173);
				grouping_set();
				}
				}
				setState(2178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2179);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Grouping_setContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<Group_by_itemContext> group_by_item() {
			return getRuleContexts(Group_by_itemContext.class);
		}
		public Group_by_itemContext group_by_item(int i) {
			return getRuleContext(Group_by_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Grouping_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterGrouping_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitGrouping_set(this);
		}
	}

	public final Grouping_setContext grouping_set() throws RecognitionException {
		Grouping_setContext _localctx = new Grouping_setContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_grouping_set);
		int _la;
		try {
			setState(2195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2181);
				match(LR_BRACKET);
				setState(2182);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2183);
				group_by_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2184);
				match(LR_BRACKET);
				setState(2185);
				group_by_item();
				setState(2190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2186);
					match(COMMA);
					setState(2187);
					group_by_item();
					}
					}
					setState(2192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2193);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Top_clauseContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(tsqlParser.TIES, 0); }
		public Top_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTop_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTop_clause(this);
		}
	}

	public final Top_clauseContext top_clause() throws RecognitionException {
		Top_clauseContext _localctx = new Top_clauseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_top_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			match(TOP);
			setState(2198);
			expression(0);
			setState(2200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERCENT) {
				{
				setState(2199);
				match(PERCENT);
				}
			}

			setState(2204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2202);
				match(WITH);
				setState(2203);
				match(TIES);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Top_clause_dmContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public Top_clause_dmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_clause_dm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTop_clause_dm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTop_clause_dm(this);
		}
	}

	public final Top_clause_dmContext top_clause_dm() throws RecognitionException {
		Top_clause_dmContext _localctx = new Top_clause_dmContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_top_clause_dm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			match(TOP);
			setState(2207);
			match(LR_BRACKET);
			setState(2208);
			expression(0);
			setState(2209);
			match(RR_BRACKET);
			setState(2211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERCENT) {
				{
				setState(2210);
				match(PERCENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_clauseContext extends ParserRuleContext {
		public ExpressionContext offset;
		public TerminalNode ORDER() { return getToken(tsqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public List<Order_by_expressionContext> order_by_expression() {
			return getRuleContexts(Order_by_expressionContext.class);
		}
		public Order_by_expressionContext order_by_expression(int i) {
			return getRuleContext(Order_by_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode OFFSET() { return getToken(tsqlParser.OFFSET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROW() { return getToken(tsqlParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public Fetch_expressionContext fetch_expression() {
			return getRuleContext(Fetch_expressionContext.class,0);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOrder_by_clause(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			match(ORDER);
			setState(2214);
			match(BY);
			setState(2215);
			order_by_expression();
			setState(2220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2216);
					match(COMMA);
					setState(2217);
					order_by_expression();
					}
					} 
				}
				setState(2222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			setState(2229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2223);
				match(OFFSET);
				setState(2224);
				((Order_by_clauseContext)_localctx).offset = expression(0);
				setState(2225);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2226);
					fetch_expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fetch_expressionContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(tsqlParser.FETCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode FIRST() { return getToken(tsqlParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public TerminalNode ROW() { return getToken(tsqlParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public Fetch_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFetch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFetch_expression(this);
		}
	}

	public final Fetch_expressionContext fetch_expression() throws RecognitionException {
		Fetch_expressionContext _localctx = new Fetch_expressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_fetch_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2231);
			match(FETCH);
			setState(2232);
			_la = _input.LA(1);
			if ( !(_la==NEXT || _la==FIRST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2233);
			expression(0);
			setState(2234);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2235);
			match(ONLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode BROWSE() { return getToken(tsqlParser.BROWSE, 0); }
		public TerminalNode XML() { return getToken(tsqlParser.XML, 0); }
		public TerminalNode AUTO() { return getToken(tsqlParser.AUTO, 0); }
		public Xml_common_directivesContext xml_common_directives() {
			return getRuleContext(Xml_common_directivesContext.class,0);
		}
		public TerminalNode PATH() { return getToken(tsqlParser.PATH, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public For_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFor_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFor_clause(this);
		}
	}

	public final For_clauseContext for_clause() throws RecognitionException {
		For_clauseContext _localctx = new For_clauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_for_clause);
		try {
			setState(2256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2237);
				match(FOR);
				setState(2238);
				match(BROWSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2239);
				match(FOR);
				setState(2240);
				match(XML);
				setState(2241);
				match(AUTO);
				setState(2243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2242);
					xml_common_directives();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2245);
				match(FOR);
				setState(2246);
				match(XML);
				setState(2247);
				match(PATH);
				setState(2251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2248);
					match(LR_BRACKET);
					setState(2249);
					match(STRING);
					setState(2250);
					match(RR_BRACKET);
					}
					break;
				}
				setState(2254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2253);
					xml_common_directives();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Xml_common_directivesContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(tsqlParser.COMMA, 0); }
		public TerminalNode BINARY() { return getToken(tsqlParser.BINARY, 0); }
		public TerminalNode BASE64() { return getToken(tsqlParser.BASE64, 0); }
		public TerminalNode TYPE() { return getToken(tsqlParser.TYPE, 0); }
		public TerminalNode ROOT() { return getToken(tsqlParser.ROOT, 0); }
		public Xml_common_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_common_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterXml_common_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitXml_common_directives(this);
		}
	}

	public final Xml_common_directivesContext xml_common_directives() throws RecognitionException {
		Xml_common_directivesContext _localctx = new Xml_common_directivesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_xml_common_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			match(COMMA);
			setState(2263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				{
				setState(2259);
				match(BINARY);
				setState(2260);
				match(BASE64);
				}
				break;
			case TYPE:
				{
				setState(2261);
				match(TYPE);
				}
				break;
			case ROOT:
				{
				setState(2262);
				match(ROOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_expressionContext extends ParserRuleContext {
		public Token direction;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(tsqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(tsqlParser.DESC, 0); }
		public Order_by_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOrder_by_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOrder_by_expression(this);
		}
	}

	public final Order_by_expressionContext order_by_expression() throws RecognitionException {
		Order_by_expressionContext _localctx = new Order_by_expressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			expression(0);
			setState(2267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(2266);
				((Order_by_expressionContext)_localctx).direction = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((Order_by_expressionContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_by_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Group_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterGroup_by_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitGroup_by_item(this);
		}
	}

	public final Group_by_itemContext group_by_item() throws RecognitionException {
		Group_by_itemContext _localctx = new Group_by_itemContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_group_by_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Option_clauseContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(tsqlParser.OPTION, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Option_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOption_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOption_clause(this);
		}
	}

	public final Option_clauseContext option_clause() throws RecognitionException {
		Option_clauseContext _localctx = new Option_clauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_option_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			match(OPTION);
			setState(2272);
			match(LR_BRACKET);
			setState(2273);
			option();
			setState(2278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2274);
				match(COMMA);
				setState(2275);
				option();
				}
				}
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2281);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionContext extends ParserRuleContext {
		public Token number_rows;
		public Token number_of_processors;
		public Token number_recursion;
		public TerminalNode FAST() { return getToken(tsqlParser.FAST, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode GROUP() { return getToken(tsqlParser.GROUP, 0); }
		public TerminalNode HASH() { return getToken(tsqlParser.HASH, 0); }
		public TerminalNode ORDER() { return getToken(tsqlParser.ORDER, 0); }
		public TerminalNode UNION() { return getToken(tsqlParser.UNION, 0); }
		public TerminalNode MERGE() { return getToken(tsqlParser.MERGE, 0); }
		public TerminalNode CONCAT() { return getToken(tsqlParser.CONCAT, 0); }
		public TerminalNode JOIN() { return getToken(tsqlParser.JOIN, 0); }
		public TerminalNode LOOP() { return getToken(tsqlParser.LOOP, 0); }
		public TerminalNode EXPAND() { return getToken(tsqlParser.EXPAND, 0); }
		public TerminalNode VIEWS() { return getToken(tsqlParser.VIEWS, 0); }
		public TerminalNode FORCE() { return getToken(tsqlParser.FORCE, 0); }
		public TerminalNode IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX() { return getToken(tsqlParser.IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX, 0); }
		public TerminalNode KEEP() { return getToken(tsqlParser.KEEP, 0); }
		public TerminalNode PLAN() { return getToken(tsqlParser.PLAN, 0); }
		public TerminalNode KEEPFIXED() { return getToken(tsqlParser.KEEPFIXED, 0); }
		public TerminalNode MAXDOP() { return getToken(tsqlParser.MAXDOP, 0); }
		public TerminalNode MAXRECURSION() { return getToken(tsqlParser.MAXRECURSION, 0); }
		public TerminalNode OPTIMIZE() { return getToken(tsqlParser.OPTIMIZE, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<Optimize_for_argContext> optimize_for_arg() {
			return getRuleContexts(Optimize_for_argContext.class);
		}
		public Optimize_for_argContext optimize_for_arg(int i) {
			return getRuleContext(Optimize_for_argContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode UNKNOWN() { return getToken(tsqlParser.UNKNOWN, 0); }
		public TerminalNode PARAMETERIZATION() { return getToken(tsqlParser.PARAMETERIZATION, 0); }
		public TerminalNode SIMPLE() { return getToken(tsqlParser.SIMPLE, 0); }
		public TerminalNode FORCED() { return getToken(tsqlParser.FORCED, 0); }
		public TerminalNode RECOMPILE() { return getToken(tsqlParser.RECOMPILE, 0); }
		public TerminalNode ROBUST() { return getToken(tsqlParser.ROBUST, 0); }
		public TerminalNode USE() { return getToken(tsqlParser.USE, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_option);
		int _la;
		try {
			setState(2328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2283);
				match(FAST);
				setState(2284);
				((OptionContext)_localctx).number_rows = match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2285);
				_la = _input.LA(1);
				if ( !(_la==ORDER || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2286);
				match(GROUP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2287);
				_la = _input.LA(1);
				if ( !(_la==MERGE || _la==CONCAT || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2288);
				match(UNION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2289);
				_la = _input.LA(1);
				if ( !(_la==MERGE || _la==HASH || _la==LOOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2290);
				match(JOIN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2291);
				match(EXPAND);
				setState(2292);
				match(VIEWS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2293);
				match(FORCE);
				setState(2294);
				match(ORDER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2295);
				match(IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2296);
				match(KEEP);
				setState(2297);
				match(PLAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2298);
				match(KEEPFIXED);
				setState(2299);
				match(PLAN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2300);
				match(MAXDOP);
				setState(2301);
				((OptionContext)_localctx).number_of_processors = match(DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2302);
				match(MAXRECURSION);
				setState(2303);
				((OptionContext)_localctx).number_recursion = match(DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2304);
				match(OPTIMIZE);
				setState(2305);
				match(FOR);
				setState(2306);
				match(LR_BRACKET);
				setState(2307);
				optimize_for_arg();
				setState(2312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2308);
					match(COMMA);
					setState(2309);
					optimize_for_arg();
					}
					}
					setState(2314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2315);
				match(RR_BRACKET);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2317);
				match(OPTIMIZE);
				setState(2318);
				match(FOR);
				setState(2319);
				match(UNKNOWN);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2320);
				match(PARAMETERIZATION);
				setState(2321);
				_la = _input.LA(1);
				if ( !(_la==FORCED || _la==SIMPLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2322);
				match(RECOMPILE);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2323);
				match(ROBUST);
				setState(2324);
				match(PLAN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2325);
				match(USE);
				setState(2326);
				match(PLAN);
				setState(2327);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Optimize_for_argContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode UNKNOWN() { return getToken(tsqlParser.UNKNOWN, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Optimize_for_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimize_for_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOptimize_for_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOptimize_for_arg(this);
		}
	}

	public final Optimize_for_argContext optimize_for_arg() throws RecognitionException {
		Optimize_for_argContext _localctx = new Optimize_for_argContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_optimize_for_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			match(LOCAL_ID);
			setState(2334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNKNOWN:
				{
				setState(2331);
				match(UNKNOWN);
				}
				break;
			case EQUAL:
				{
				setState(2332);
				match(EQUAL);
				setState(2333);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_elemContext> select_list_elem() {
			return getRuleContexts(Select_list_elemContext.class);
		}
		public Select_list_elemContext select_list_elem(int i) {
			return getRuleContext(Select_list_elemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			select_list_elem();
			setState(2341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,338,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2337);
					match(COMMA);
					setState(2338);
					select_list_elem();
					}
					} 
				}
				setState(2343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,338,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_list_elemContext extends ParserRuleContext {
		public Column_aliasContext alias;
		public A_starContext a_star() {
			return getRuleContext(A_starContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(tsqlParser.DOLLAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(tsqlParser.DOT, 0); }
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public TerminalNode ROWGUID() { return getToken(tsqlParser.ROWGUID, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Select_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSelect_list_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSelect_list_elem(this);
		}
	}

	public final Select_list_elemContext select_list_elem() throws RecognitionException {
		Select_list_elemContext _localctx = new Select_list_elemContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_select_list_elem);
		int _la;
		try {
			setState(2365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1108101562369L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -9220850245999262719L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & -8070459558675465653L) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & -6413215653674627739L) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & 41918743507263L) != 0)) {
					{
					setState(2344);
					table_name();
					setState(2345);
					match(DOT);
					}
				}

				setState(2352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2349);
					a_star();
					}
					break;
				case DOLLAR:
					{
					setState(2350);
					match(DOLLAR);
					setState(2351);
					_la = _input.LA(1);
					if ( !(_la==IDENTITY || _la==ROWGUID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2354);
				((Select_list_elemContext)_localctx).alias = column_alias();
				setState(2355);
				match(EQUAL);
				setState(2356);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2358);
				expression(0);
				setState(2363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(2359);
						match(AS);
						}
					}

					setState(2362);
					((Select_list_elemContext)_localctx).alias = column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_sourcesContext extends ParserRuleContext {
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Table_sourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_sources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_sources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_sources(this);
		}
	}

	public final Table_sourcesContext table_sources() throws RecognitionException {
		Table_sourcesContext _localctx = new Table_sourcesContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_table_sources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			table_source(0);
			setState(2372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2368);
					match(COMMA);
					setState(2369);
					table_source(0);
					}
					} 
				}
				setState(2374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_sourceContext extends ParserRuleContext {
		public Table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source; }
	 
		public Table_sourceContext() { }
		public void copyFrom(Table_sourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cross_joinContext extends Table_sourceContext {
		public Table_sourceContext left;
		public Token op;
		public Table_sourceContext right;
		public TerminalNode JOIN() { return getToken(tsqlParser.JOIN, 0); }
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(tsqlParser.CROSS, 0); }
		public Cross_joinContext(Table_sourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCross_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCross_join(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Table_source_item_joinContext extends Table_sourceContext {
		public Table_source_itemContext table_source_item() {
			return getRuleContext(Table_source_itemContext.class,0);
		}
		public Table_source_item_joinContext(Table_sourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_source_item_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_source_item_join(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Standard_joinContext extends Table_sourceContext {
		public Table_sourceContext left;
		public Table_sourceContext right;
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(tsqlParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public Standard_joinContext(Table_sourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterStandard_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitStandard_join(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Apply_joinContext extends Table_sourceContext {
		public Table_sourceContext left;
		public Token op;
		public Table_sourceContext right;
		public TerminalNode APPLY() { return getToken(tsqlParser.APPLY, 0); }
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(tsqlParser.CROSS, 0); }
		public TerminalNode OUTER() { return getToken(tsqlParser.OUTER, 0); }
		public Apply_joinContext(Table_sourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterApply_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitApply_join(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bracket_table_sourceContext extends Table_sourceContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Table_sourceContext table_source() {
			return getRuleContext(Table_sourceContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Bracket_table_sourceContext(Table_sourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBracket_table_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBracket_table_source(this);
		}
	}

	public final Table_sourceContext table_source() throws RecognitionException {
		return table_source(0);
	}

	private Table_sourceContext table_source(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Table_sourceContext _localctx = new Table_sourceContext(_ctx, _parentState);
		Table_sourceContext _prevctx = _localctx;
		int _startState = 222;
		enterRecursionRule(_localctx, 222, RULE_table_source, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				_localctx = new Bracket_table_sourceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2376);
				match(LR_BRACKET);
				setState(2377);
				table_source(0);
				setState(2378);
				match(RR_BRACKET);
				}
				break;
			case 2:
				{
				_localctx = new Table_source_item_joinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2380);
				table_source_item();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2398);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
					case 1:
						{
						_localctx = new Cross_joinContext(new Table_sourceContext(_parentctx, _parentState));
						((Cross_joinContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_table_source);
						setState(2383);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2384);
						((Cross_joinContext)_localctx).op = match(CROSS);
						setState(2385);
						match(JOIN);
						setState(2386);
						((Cross_joinContext)_localctx).right = table_source(4);
						}
						break;
					case 2:
						{
						_localctx = new Apply_joinContext(new Table_sourceContext(_parentctx, _parentState));
						((Apply_joinContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_table_source);
						setState(2387);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2388);
						((Apply_joinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==CROSS || _la==OUTER) ) {
							((Apply_joinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2389);
						match(APPLY);
						setState(2390);
						((Apply_joinContext)_localctx).right = table_source(3);
						}
						break;
					case 3:
						{
						_localctx = new Standard_joinContext(new Table_sourceContext(_parentctx, _parentState));
						((Standard_joinContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_table_source);
						setState(2391);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2392);
						join_type();
						setState(2393);
						match(JOIN);
						setState(2394);
						((Standard_joinContext)_localctx).right = table_source(0);
						setState(2395);
						match(ON);
						setState(2396);
						search_condition(0);
						}
						break;
					}
					} 
				}
				setState(2402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_source_itemContext extends ParserRuleContext {
		public Table_source_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source_item; }
	 
		public Table_source_itemContext() { }
		public void copyFrom(Table_source_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Table_source_item_simpleContext extends Table_source_itemContext {
		public Rowset_functionContext rowset_function() {
			return getRuleContext(Rowset_functionContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Change_tableContext change_table() {
			return getRuleContext(Change_tableContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Table_source_item_simpleContext(Table_source_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_source_item_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_source_item_simple(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Table_source_item_complexContext extends Table_source_itemContext {
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Column_alias_listContext column_alias_list() {
			return getRuleContext(Column_alias_listContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode DOT() { return getToken(tsqlParser.DOT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Table_source_item_complexContext(Table_source_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_source_item_complex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_source_item_complex(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Table_source_item_nameContext extends Table_source_itemContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Tablesample_clauseContext tablesample_clause() {
			return getRuleContext(Tablesample_clauseContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Table_source_item_nameContext(Table_source_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_source_item_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_source_item_name(this);
		}
	}

	public final Table_source_itemContext table_source_item() throws RecognitionException {
		Table_source_itemContext _localctx = new Table_source_itemContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_table_source_item);
		try {
			setState(2445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				_localctx = new Table_source_item_nameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2403);
				table_name();
				setState(2405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
				case 1:
					{
					setState(2404);
					tablesample_clause();
					}
					break;
				}
				setState(2408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
				case 1:
					{
					setState(2407);
					table_alias();
					}
					break;
				}
				setState(2411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2410);
					with_table_hints();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Table_source_item_simpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2413);
				rowset_function();
				setState(2415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
				case 1:
					{
					setState(2414);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Table_source_item_complexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2417);
				derived_table();
				setState(2422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
				case 1:
					{
					setState(2418);
					table_alias();
					setState(2420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
					case 1:
						{
						setState(2419);
						column_alias_list();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Table_source_item_simpleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2424);
				change_table();
				setState(2426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
				case 1:
					{
					setState(2425);
					table_alias();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Table_source_item_simpleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2428);
				function_call();
				setState(2430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
				case 1:
					{
					setState(2429);
					table_alias();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new Table_source_item_simpleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2432);
				match(LOCAL_ID);
				setState(2434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
				case 1:
					{
					setState(2433);
					table_alias();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new Table_source_item_complexContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2436);
				match(LOCAL_ID);
				setState(2437);
				match(DOT);
				setState(2438);
				function_call();
				setState(2443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
				case 1:
					{
					setState(2439);
					table_alias();
					setState(2441);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
					case 1:
						{
						setState(2440);
						column_alias_list();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tablesample_clauseContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(tsqlParser.TABLESAMPLE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Sample_numberContext sample_number() {
			return getRuleContext(Sample_numberContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode SYSTEM() { return getToken(tsqlParser.SYSTEM, 0); }
		public TerminalNode REPEATABLE() { return getToken(tsqlParser.REPEATABLE, 0); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public Repeat_seedContext repeat_seed() {
			return getRuleContext(Repeat_seedContext.class,0);
		}
		public Tablesample_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablesample_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTablesample_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTablesample_clause(this);
		}
	}

	public final Tablesample_clauseContext tablesample_clause() throws RecognitionException {
		Tablesample_clauseContext _localctx = new Tablesample_clauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_tablesample_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			match(TABLESAMPLE);
			setState(2449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYSTEM) {
				{
				setState(2448);
				match(SYSTEM);
				}
			}

			setState(2451);
			match(LR_BRACKET);
			setState(2452);
			sample_number();
			setState(2454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERCENT || _la==ROWS) {
				{
				setState(2453);
				_la = _input.LA(1);
				if ( !(_la==PERCENT || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2456);
			match(RR_BRACKET);
			setState(2459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2457);
				match(REPEATABLE);
				{
				setState(2458);
				repeat_seed();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sample_numberContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Sample_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSample_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSample_number(this);
		}
	}

	public final Sample_numberContext sample_number() throws RecognitionException {
		Sample_numberContext _localctx = new Sample_numberContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_sample_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_seedContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Repeat_seedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_seed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRepeat_seed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRepeat_seed(this);
		}
	}

	public final Repeat_seedContext repeat_seed() throws RecognitionException {
		Repeat_seedContext _localctx = new Repeat_seedContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_repeat_seed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
			match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_aliasContext extends ParserRuleContext {
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_alias(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_table_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2465);
				match(AS);
				}
			}

			setState(2468);
			r_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Change_tableContext extends ParserRuleContext {
		public TerminalNode CHANGETABLE() { return getToken(tsqlParser.CHANGETABLE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode CHANGES() { return getToken(tsqlParser.CHANGES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(tsqlParser.COMMA, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Change_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterChange_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitChange_table(this);
		}
	}

	public final Change_tableContext change_table() throws RecognitionException {
		Change_tableContext _localctx = new Change_tableContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_change_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
			match(CHANGETABLE);
			setState(2471);
			match(LR_BRACKET);
			setState(2472);
			match(CHANGES);
			setState(2473);
			table_name();
			setState(2474);
			match(COMMA);
			setState(2475);
			_la = _input.LA(1);
			if ( !(_la==NULL || _la==LOCAL_ID || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2476);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_typeContext extends ParserRuleContext {
		public Token join_hint;
		public TerminalNode LEFT() { return getToken(tsqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(tsqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(tsqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(tsqlParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(tsqlParser.OUTER, 0); }
		public TerminalNode LOOP() { return getToken(tsqlParser.LOOP, 0); }
		public TerminalNode HASH() { return getToken(tsqlParser.HASH, 0); }
		public TerminalNode MERGE() { return getToken(tsqlParser.MERGE, 0); }
		public TerminalNode REMOTE() { return getToken(tsqlParser.REMOTE, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitJoin_type(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
			case MERGE:
			case HASH:
			case LOOP:
			case REMOTE:
				{
				setState(2479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2478);
					match(INNER);
					}
				}

				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				{
				setState(2481);
				_la = _input.LA(1);
				if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2482);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MERGE || _la==HASH || _la==LOOP || _la==REMOTE) {
				{
				setState(2487);
				((Join_typeContext)_localctx).join_hint = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MERGE || _la==HASH || _la==LOOP || _la==REMOTE) ) {
					((Join_typeContext)_localctx).join_hint = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_name_with_hintContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Table_name_with_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name_with_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_name_with_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_name_with_hint(this);
		}
	}

	public final Table_name_with_hintContext table_name_with_hint() throws RecognitionException {
		Table_name_with_hintContext _localctx = new Table_name_with_hintContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_table_name_with_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			table_name();
			setState(2492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				{
				setState(2491);
				with_table_hints();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rowset_functionContext extends ParserRuleContext {
		public Token provider_name;
		public Token connectionString;
		public Token sql;
		public Token data_file;
		public TerminalNode OPENROWSET() { return getToken(tsqlParser.OPENROWSET, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(tsqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(tsqlParser.STRING, i);
		}
		public TerminalNode BULK() { return getToken(tsqlParser.BULK, 0); }
		public List<Bulk_optionContext> bulk_option() {
			return getRuleContexts(Bulk_optionContext.class);
		}
		public Bulk_optionContext bulk_option(int i) {
			return getRuleContext(Bulk_optionContext.class,i);
		}
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Rowset_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRowset_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRowset_function(this);
		}
	}

	public final Rowset_functionContext rowset_function() throws RecognitionException {
		Rowset_functionContext _localctx = new Rowset_functionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_rowset_function);
		int _la;
		try {
			setState(2520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2494);
				match(OPENROWSET);
				setState(2495);
				match(LR_BRACKET);
				setState(2496);
				((Rowset_functionContext)_localctx).provider_name = match(STRING);
				setState(2497);
				match(COMMA);
				setState(2498);
				((Rowset_functionContext)_localctx).connectionString = match(STRING);
				setState(2499);
				match(COMMA);
				setState(2500);
				((Rowset_functionContext)_localctx).sql = match(STRING);
				setState(2501);
				match(RR_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2502);
				match(OPENROWSET);
				setState(2503);
				match(LR_BRACKET);
				setState(2504);
				match(BULK);
				setState(2505);
				((Rowset_functionContext)_localctx).data_file = match(STRING);
				setState(2506);
				match(COMMA);
				setState(2516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
				case 1:
					{
					setState(2507);
					bulk_option();
					setState(2512);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2508);
						match(COMMA);
						setState(2509);
						bulk_option();
						}
						}
						setState(2514);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2515);
					r_id();
					}
					break;
				}
				setState(2518);
				match(RR_BRACKET);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bulk_optionContext extends ParserRuleContext {
		public Token bulk_option_value;
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Bulk_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulk_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBulk_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBulk_option(this);
		}
	}

	public final Bulk_optionContext bulk_option() throws RecognitionException {
		Bulk_optionContext _localctx = new Bulk_optionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_bulk_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2522);
			r_id();
			setState(2523);
			match(EQUAL);
			setState(2524);
			((Bulk_optionContext)_localctx).bulk_option_value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==STRING) ) {
				((Bulk_optionContext)_localctx).bulk_option_value = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Derived_tableContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Derived_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDerived_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDerived_table(this);
		}
	}

	public final Derived_tableContext derived_table() throws RecognitionException {
		Derived_tableContext _localctx = new Derived_tableContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_derived_table);
		try {
			setState(2531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2526);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2527);
				match(LR_BRACKET);
				setState(2528);
				subquery();
				setState(2529);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Standard_callContext extends Function_callContext {
		public ExpressionContext style;
		public Token seed;
		public Token increment;
		public Scalar_function_nameContext scalar_function_name() {
			return getRuleContext(Scalar_function_nameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode BINARY_CHECKSUM() { return getToken(tsqlParser.BINARY_CHECKSUM, 0); }
		public TerminalNode STAR() { return getToken(tsqlParser.STAR, 0); }
		public TerminalNode CONVERT() { return getToken(tsqlParser.CONVERT, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COALESCE() { return getToken(tsqlParser.COALESCE, 0); }
		public TerminalNode DATEADD() { return getToken(tsqlParser.DATEADD, 0); }
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public TerminalNode DATEDIFF() { return getToken(tsqlParser.DATEDIFF, 0); }
		public TerminalNode DATENAME() { return getToken(tsqlParser.DATENAME, 0); }
		public TerminalNode DATEPART() { return getToken(tsqlParser.DATEPART, 0); }
		public TerminalNode DATETIMEOFFSETFROMPARTS() { return getToken(tsqlParser.DATETIMEOFFSETFROMPARTS, 0); }
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public TerminalNode IIF() { return getToken(tsqlParser.IIF, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode NULLIF() { return getToken(tsqlParser.NULLIF, 0); }
		public TerminalNode STRING_SPLIT() { return getToken(tsqlParser.STRING_SPLIT, 0); }
		public TerminalNode TRY_CONVERT() { return getToken(tsqlParser.TRY_CONVERT, 0); }
		public Standard_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterStandard_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitStandard_call(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_callContext extends Function_callContext {
		public Aggregate_windowed_functionContext aggregate_windowed_function() {
			return getRuleContext(Aggregate_windowed_functionContext.class,0);
		}
		public Aggregate_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAggregate_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAggregate_call(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Nvf_callContext extends Function_callContext {
		public Next_value_for_functionContext next_value_for_function() {
			return getRuleContext(Next_value_for_functionContext.class,0);
		}
		public Nvf_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterNvf_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitNvf_call(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Rank_callContext extends Function_callContext {
		public Ranking_windowed_functionContext ranking_windowed_function() {
			return getRuleContext(Ranking_windowed_functionContext.class,0);
		}
		public Rank_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRank_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRank_call(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_callContext extends Function_callContext {
		public ExpressionContext left;
		public Data_typeContext alias;
		public ExpressionContext right;
		public TerminalNode PARSE() { return getToken(tsqlParser.PARSE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode USING() { return getToken(tsqlParser.USING, 0); }
		public TerminalNode TRY_PARSE() { return getToken(tsqlParser.TRY_PARSE, 0); }
		public Expression_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExpression_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExpression_call(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Simple_callContext extends Function_callContext {
		public TerminalNode CHECKSUM() { return getToken(tsqlParser.CHECKSUM, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode STAR() { return getToken(tsqlParser.STAR, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(tsqlParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(tsqlParser.CURRENT_USER, 0); }
		public TerminalNode MIN_ACTIVE_ROWVERSION() { return getToken(tsqlParser.MIN_ACTIVE_ROWVERSION, 0); }
		public TerminalNode SESSION_USER() { return getToken(tsqlParser.SESSION_USER, 0); }
		public TerminalNode SYSTEM_USER() { return getToken(tsqlParser.SYSTEM_USER, 0); }
		public Simple_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSimple_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSimple_call(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cast_callContext extends Function_callContext {
		public Data_typeContext alias;
		public TerminalNode CAST() { return getToken(tsqlParser.CAST, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(tsqlParser.TRY_CAST, 0); }
		public Cast_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCast_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCast_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_function_call);
		int _la;
		try {
			setState(2706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				_localctx = new Rank_callContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2533);
				ranking_windowed_function();
				}
				break;
			case 2:
				_localctx = new Aggregate_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2534);
				aggregate_windowed_function();
				}
				break;
			case 3:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2535);
				scalar_function_name();
				setState(2536);
				match(LR_BRACKET);
				setState(2538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576212880064512L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 18016331311892481L) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & -8065942527057326079L) != 0) || ((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & -2321806371062850325L) != 0) || ((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & -4625929839377974965L) != 0) || ((((_la - 348)) & ~0x3f) == 0 && ((1L << (_la - 348)) & -6781296620682193025L) != 0) || ((((_la - 412)) & ~0x3f) == 0 && ((1L << (_la - 412)) & 31551585804632047L) != 0)) {
					{
					setState(2537);
					expression_list();
					}
				}

				setState(2540);
				match(RR_BRACKET);
				}
				break;
			case 4:
				_localctx = new Nvf_callContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2542);
				next_value_for_function();
				}
				break;
			case 5:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2543);
				match(BINARY_CHECKSUM);
				setState(2544);
				match(LR_BRACKET);
				setState(2545);
				match(STAR);
				setState(2546);
				match(RR_BRACKET);
				}
				break;
			case 6:
				_localctx = new Cast_callContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2547);
				match(CAST);
				setState(2548);
				match(LR_BRACKET);
				setState(2549);
				expression(0);
				setState(2550);
				match(AS);
				setState(2551);
				((Cast_callContext)_localctx).alias = data_type();
				setState(2552);
				match(RR_BRACKET);
				}
				break;
			case 7:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2554);
				match(CONVERT);
				setState(2555);
				match(LR_BRACKET);
				setState(2556);
				data_type();
				setState(2557);
				match(COMMA);
				setState(2558);
				expression(0);
				setState(2561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2559);
					match(COMMA);
					setState(2560);
					((Standard_callContext)_localctx).style = expression(0);
					}
				}

				setState(2563);
				match(RR_BRACKET);
				}
				break;
			case 8:
				_localctx = new Simple_callContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2565);
				match(CHECKSUM);
				setState(2566);
				match(LR_BRACKET);
				setState(2567);
				match(STAR);
				setState(2568);
				match(RR_BRACKET);
				}
				break;
			case 9:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2569);
				match(COALESCE);
				setState(2570);
				match(LR_BRACKET);
				setState(2571);
				expression_list();
				setState(2572);
				match(RR_BRACKET);
				}
				break;
			case 10:
				_localctx = new Simple_callContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2574);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 11:
				_localctx = new Simple_callContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(2575);
				match(CURRENT_USER);
				}
				break;
			case 12:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(2576);
				match(DATEADD);
				setState(2577);
				match(LR_BRACKET);
				setState(2578);
				match(ID);
				setState(2579);
				match(COMMA);
				setState(2580);
				expression(0);
				setState(2581);
				match(COMMA);
				setState(2582);
				expression(0);
				setState(2583);
				match(RR_BRACKET);
				}
				break;
			case 13:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(2585);
				match(DATEDIFF);
				setState(2586);
				match(LR_BRACKET);
				setState(2587);
				match(ID);
				setState(2588);
				match(COMMA);
				setState(2589);
				expression(0);
				setState(2590);
				match(COMMA);
				setState(2591);
				expression(0);
				setState(2592);
				match(RR_BRACKET);
				}
				break;
			case 14:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(2594);
				match(DATENAME);
				setState(2595);
				match(LR_BRACKET);
				setState(2596);
				match(ID);
				setState(2597);
				match(COMMA);
				setState(2598);
				expression(0);
				setState(2599);
				match(RR_BRACKET);
				}
				break;
			case 15:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(2601);
				match(DATEPART);
				setState(2602);
				match(LR_BRACKET);
				setState(2603);
				match(ID);
				setState(2604);
				match(COMMA);
				setState(2605);
				expression(0);
				setState(2606);
				match(RR_BRACKET);
				}
				break;
			case 16:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(2608);
				match(DATETIMEOFFSETFROMPARTS);
				setState(2609);
				match(LR_BRACKET);
				setState(2610);
				expression(0);
				setState(2611);
				match(COMMA);
				setState(2612);
				expression(0);
				setState(2613);
				match(COMMA);
				setState(2614);
				expression(0);
				setState(2615);
				match(COMMA);
				setState(2616);
				expression(0);
				setState(2617);
				match(COMMA);
				setState(2618);
				expression(0);
				setState(2619);
				match(COMMA);
				setState(2620);
				expression(0);
				setState(2621);
				match(COMMA);
				setState(2622);
				expression(0);
				setState(2623);
				match(COMMA);
				setState(2624);
				expression(0);
				setState(2625);
				match(COMMA);
				setState(2626);
				expression(0);
				setState(2627);
				match(COMMA);
				setState(2628);
				expression(0);
				setState(2629);
				match(RR_BRACKET);
				}
				break;
			case 17:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(2631);
				match(IDENTITY);
				setState(2632);
				match(LR_BRACKET);
				setState(2633);
				data_type();
				setState(2636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2634);
					match(COMMA);
					setState(2635);
					((Standard_callContext)_localctx).seed = match(DECIMAL);
					}
					break;
				}
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2638);
					match(COMMA);
					setState(2639);
					((Standard_callContext)_localctx).increment = match(DECIMAL);
					}
				}

				setState(2642);
				match(RR_BRACKET);
				}
				break;
			case 18:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(2644);
				match(IIF);
				setState(2645);
				match(LR_BRACKET);
				setState(2646);
				search_condition(0);
				setState(2647);
				match(COMMA);
				setState(2648);
				expression(0);
				setState(2649);
				match(COMMA);
				setState(2650);
				expression(0);
				setState(2651);
				match(RR_BRACKET);
				}
				break;
			case 19:
				_localctx = new Simple_callContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(2653);
				match(MIN_ACTIVE_ROWVERSION);
				}
				break;
			case 20:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(2654);
				match(NULLIF);
				setState(2655);
				match(LR_BRACKET);
				setState(2656);
				expression(0);
				setState(2657);
				match(COMMA);
				setState(2658);
				expression(0);
				setState(2659);
				match(RR_BRACKET);
				}
				break;
			case 21:
				_localctx = new Expression_callContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(2661);
				match(PARSE);
				setState(2662);
				match(LR_BRACKET);
				setState(2663);
				((Expression_callContext)_localctx).left = expression(0);
				setState(2664);
				match(AS);
				setState(2665);
				((Expression_callContext)_localctx).alias = data_type();
				setState(2668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(2666);
					match(USING);
					setState(2667);
					((Expression_callContext)_localctx).right = expression(0);
					}
				}

				setState(2670);
				match(RR_BRACKET);
				}
				break;
			case 22:
				_localctx = new Simple_callContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(2672);
				match(SESSION_USER);
				}
				break;
			case 23:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(2673);
				match(STRING_SPLIT);
				setState(2674);
				match(LR_BRACKET);
				setState(2675);
				expression(0);
				setState(2676);
				match(COMMA);
				setState(2677);
				expression(0);
				setState(2678);
				match(RR_BRACKET);
				}
				break;
			case 24:
				_localctx = new Simple_callContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(2680);
				match(SYSTEM_USER);
				}
				break;
			case 25:
				_localctx = new Standard_callContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(2681);
				match(TRY_CONVERT);
				setState(2682);
				match(LR_BRACKET);
				setState(2683);
				data_type();
				setState(2684);
				match(COMMA);
				setState(2685);
				expression(0);
				setState(2686);
				match(RR_BRACKET);
				}
				break;
			case 26:
				_localctx = new Cast_callContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(2688);
				match(TRY_CAST);
				setState(2689);
				match(LR_BRACKET);
				setState(2690);
				expression(0);
				setState(2691);
				match(AS);
				setState(2692);
				((Cast_callContext)_localctx).alias = data_type();
				setState(2693);
				match(RR_BRACKET);
				}
				break;
			case 27:
				_localctx = new Expression_callContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(2695);
				match(TRY_PARSE);
				setState(2696);
				match(LR_BRACKET);
				setState(2697);
				((Expression_callContext)_localctx).left = expression(0);
				setState(2698);
				match(AS);
				setState(2699);
				((Expression_callContext)_localctx).alias = data_type();
				setState(2702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(2700);
					match(USING);
					setState(2701);
					((Expression_callContext)_localctx).right = expression(0);
					}
				}

				setState(2704);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_sectionContext extends ParserRuleContext {
		public ExpressionContext whenExpr;
		public ExpressionContext thenExpr;
		public TerminalNode WHEN() { return getToken(tsqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(tsqlParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Switch_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSwitch_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSwitch_section(this);
		}
	}

	public final Switch_sectionContext switch_section() throws RecognitionException {
		Switch_sectionContext _localctx = new Switch_sectionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_switch_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2708);
			match(WHEN);
			setState(2709);
			((Switch_sectionContext)_localctx).whenExpr = expression(0);
			setState(2710);
			match(THEN);
			setState(2711);
			((Switch_sectionContext)_localctx).thenExpr = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_search_condition_sectionContext extends ParserRuleContext {
		public Search_conditionContext whenExpr;
		public ExpressionContext thenExpr;
		public TerminalNode WHEN() { return getToken(tsqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(tsqlParser.THEN, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_search_condition_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_search_condition_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSwitch_search_condition_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSwitch_search_condition_section(this);
		}
	}

	public final Switch_search_condition_sectionContext switch_search_condition_section() throws RecognitionException {
		Switch_search_condition_sectionContext _localctx = new Switch_search_condition_sectionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_switch_search_condition_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2713);
			match(WHEN);
			setState(2714);
			((Switch_search_condition_sectionContext)_localctx).whenExpr = search_condition(0);
			setState(2715);
			match(THEN);
			setState(2716);
			((Switch_search_condition_sectionContext)_localctx).thenExpr = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_table_hintsContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<Table_hintContext> table_hint() {
			return getRuleContexts(Table_hintContext.class);
		}
		public Table_hintContext table_hint(int i) {
			return getRuleContext(Table_hintContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public With_table_hintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_table_hints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWith_table_hints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWith_table_hints(this);
		}
	}

	public final With_table_hintsContext with_table_hints() throws RecognitionException {
		With_table_hintsContext _localctx = new With_table_hintsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_with_table_hints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2718);
				match(WITH);
				}
			}

			setState(2721);
			match(LR_BRACKET);
			setState(2722);
			table_hint();
			setState(2727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2723);
				match(COMMA);
				setState(2724);
				table_hint();
				}
				}
				setState(2729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2730);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_with_table_hintsContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<Table_hintContext> table_hint() {
			return getRuleContexts(Table_hintContext.class);
		}
		public Table_hintContext table_hint(int i) {
			return getRuleContext(Table_hintContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Insert_with_table_hintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_with_table_hints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterInsert_with_table_hints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitInsert_with_table_hints(this);
		}
	}

	public final Insert_with_table_hintsContext insert_with_table_hints() throws RecognitionException {
		Insert_with_table_hintsContext _localctx = new Insert_with_table_hintsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_insert_with_table_hints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2732);
			match(WITH);
			setState(2733);
			match(LR_BRACKET);
			setState(2734);
			table_hint();
			setState(2739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2735);
				match(COMMA);
				setState(2736);
				table_hint();
				}
				}
				setState(2741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2742);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_hintContext extends ParserRuleContext {
		public TerminalNode NOEXPAND() { return getToken(tsqlParser.NOEXPAND, 0); }
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public List<TerminalNode> LR_BRACKET() { return getTokens(tsqlParser.LR_BRACKET); }
		public TerminalNode LR_BRACKET(int i) {
			return getToken(tsqlParser.LR_BRACKET, i);
		}
		public List<Index_valueContext> index_value() {
			return getRuleContexts(Index_valueContext.class);
		}
		public Index_valueContext index_value(int i) {
			return getRuleContext(Index_valueContext.class,i);
		}
		public List<TerminalNode> RR_BRACKET() { return getTokens(tsqlParser.RR_BRACKET); }
		public TerminalNode RR_BRACKET(int i) {
			return getToken(tsqlParser.RR_BRACKET, i);
		}
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode FORCESEEK() { return getToken(tsqlParser.FORCESEEK, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(tsqlParser.SERIALIZABLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(tsqlParser.SNAPSHOT, 0); }
		public TerminalNode SPATIAL_WINDOW_MAX_CELLS() { return getToken(tsqlParser.SPATIAL_WINDOW_MAX_CELLS, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public List<TerminalNode> ID() { return getTokens(tsqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tsqlParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Table_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_hint(this);
		}
	}

	public final Table_hintContext table_hint() throws RecognitionException {
		Table_hintContext _localctx = new Table_hintContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_table_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOEXPAND) {
				{
				setState(2744);
				match(NOEXPAND);
				}
			}

			setState(2785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
			case 1:
				{
				setState(2747);
				match(INDEX);
				setState(2748);
				match(LR_BRACKET);
				setState(2749);
				index_value();
				setState(2754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2750);
					match(COMMA);
					setState(2751);
					index_value();
					}
					}
					setState(2756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2757);
				match(RR_BRACKET);
				}
				break;
			case 2:
				{
				setState(2759);
				match(INDEX);
				setState(2760);
				match(EQUAL);
				setState(2761);
				index_value();
				}
				break;
			case 3:
				{
				setState(2762);
				match(FORCESEEK);
				setState(2777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(2763);
					match(LR_BRACKET);
					setState(2764);
					index_value();
					setState(2765);
					match(LR_BRACKET);
					setState(2766);
					match(ID);
					setState(2771);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2767);
						match(COMMA);
						setState(2768);
						match(ID);
						}
						}
						setState(2773);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2774);
					match(RR_BRACKET);
					setState(2775);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case 4:
				{
				setState(2779);
				match(SERIALIZABLE);
				}
				break;
			case 5:
				{
				setState(2780);
				match(SNAPSHOT);
				}
				break;
			case 6:
				{
				setState(2781);
				match(SPATIAL_WINDOW_MAX_CELLS);
				setState(2782);
				match(EQUAL);
				setState(2783);
				match(DECIMAL);
				}
				break;
			case 7:
				{
				setState(2784);
				match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_valueContext extends ParserRuleContext {
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Index_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterIndex_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitIndex_value(this);
		}
	}

	public final Index_valueContext index_value() throws RecognitionException {
		Index_valueContext _localctx = new Index_valueContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_index_value);
		try {
			setState(2789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2787);
				r_id();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2788);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_alias_listContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<Column_aliasContext> column_alias() {
			return getRuleContexts(Column_aliasContext.class);
		}
		public Column_aliasContext column_alias(int i) {
			return getRuleContext(Column_aliasContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Column_alias_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_alias_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_alias_list(this);
		}
	}

	public final Column_alias_listContext column_alias_list() throws RecognitionException {
		Column_alias_listContext _localctx = new Column_alias_listContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_column_alias_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2791);
			match(LR_BRACKET);
			setState(2792);
			column_alias();
			setState(2797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2793);
				match(COMMA);
				setState(2794);
				column_alias();
				}
				}
				setState(2799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2800);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_aliasContext extends ParserRuleContext {
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_alias(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_column_alias);
		try {
			setState(2804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2802);
				r_id();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2803);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class A_starContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(tsqlParser.STAR, 0); }
		public A_starContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterA_star(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitA_star(this);
		}
	}

	public final A_starContext a_star() throws RecognitionException {
		A_starContext _localctx = new A_starContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_a_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2806);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_value_constructorContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(tsqlParser.VALUES, 0); }
		public List<Value_listContext> value_list() {
			return getRuleContexts(Value_listContext.class);
		}
		public Value_listContext value_list(int i) {
			return getRuleContext(Value_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Table_value_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_value_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_value_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_value_constructor(this);
		}
	}

	public final Table_value_constructorContext table_value_constructor() throws RecognitionException {
		Table_value_constructorContext _localctx = new Table_value_constructorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_table_value_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2808);
			match(VALUES);
			setState(2809);
			value_list();
			setState(2814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2810);
				match(COMMA);
				setState(2811);
				value_list();
				}
				}
				setState(2816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2817);
			expression(0);
			setState(2822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2818);
				match(COMMA);
				setState(2819);
				expression(0);
				}
				}
				setState(2824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value_listContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitValue_list(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_value_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2825);
			match(LR_BRACKET);
			setState(2826);
			expression_list();
			setState(2827);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Next_value_forContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public TerminalNode VALUE() { return getToken(tsqlParser.VALUE, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public Next_value_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_value_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterNext_value_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitNext_value_for(this);
		}
	}

	public final Next_value_forContext next_value_for() throws RecognitionException {
		Next_value_forContext _localctx = new Next_value_forContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_next_value_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2829);
			match(NEXT);
			setState(2830);
			match(VALUE);
			setState(2831);
			match(FOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Next_value_for_functionContext extends ParserRuleContext {
		public Func_proc_nameContext args;
		public Next_value_forContext next_value_for() {
			return getRuleContext(Next_value_forContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public Next_value_for_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_value_for_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterNext_value_for_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitNext_value_for_function(this);
		}
	}

	public final Next_value_for_functionContext next_value_for_function() throws RecognitionException {
		Next_value_for_functionContext _localctx = new Next_value_for_functionContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_next_value_for_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2833);
			next_value_for();
			setState(2834);
			((Next_value_for_functionContext)_localctx).args = func_proc_name();
			setState(2835);
			over_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ranking_windowed_functionContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode RANK() { return getToken(tsqlParser.RANK, 0); }
		public TerminalNode DENSE_RANK() { return getToken(tsqlParser.DENSE_RANK, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(tsqlParser.ROW_NUMBER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NTILE() { return getToken(tsqlParser.NTILE, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(tsqlParser.FIRST_VALUE, 0); }
		public TerminalNode LAST_VALUE() { return getToken(tsqlParser.LAST_VALUE, 0); }
		public TerminalNode LEAD() { return getToken(tsqlParser.LEAD, 0); }
		public TerminalNode LAG() { return getToken(tsqlParser.LAG, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Ranking_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranking_windowed_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRanking_windowed_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRanking_windowed_function(this);
		}
	}

	public final Ranking_windowed_functionContext ranking_windowed_function() throws RecognitionException {
		Ranking_windowed_functionContext _localctx = new Ranking_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_ranking_windowed_function);
		int _la;
		try {
			setState(2860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DENSE_RANK:
			case RANK:
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2837);
				_la = _input.LA(1);
				if ( !(_la==DENSE_RANK || _la==RANK || _la==ROW_NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2838);
				match(LR_BRACKET);
				setState(2839);
				match(RR_BRACKET);
				setState(2840);
				over_clause();
				}
				break;
			case FIRST_VALUE:
			case LAST_VALUE:
			case NTILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2841);
				_la = _input.LA(1);
				if ( !(((((_la - 275)) & ~0x3f) == 0 && ((1L << (_la - 275)) & 576460754450907137L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2842);
				match(LR_BRACKET);
				setState(2843);
				expression(0);
				setState(2844);
				match(RR_BRACKET);
				setState(2845);
				over_clause();
				}
				break;
			case LAG:
			case LEAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2847);
				_la = _input.LA(1);
				if ( !(_la==LAG || _la==LEAD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2848);
				match(LR_BRACKET);
				setState(2849);
				expression(0);
				setState(2854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2850);
					match(COMMA);
					setState(2851);
					expression(0);
					}
					}
					setState(2856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2857);
				match(RR_BRACKET);
				setState(2858);
				over_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_windowed_functionContext extends ParserRuleContext {
		public Token args;
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode AVG() { return getToken(tsqlParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(tsqlParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(tsqlParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(tsqlParser.SUM, 0); }
		public TerminalNode STDEV() { return getToken(tsqlParser.STDEV, 0); }
		public TerminalNode STDEVP() { return getToken(tsqlParser.STDEVP, 0); }
		public TerminalNode VAR() { return getToken(tsqlParser.VAR, 0); }
		public TerminalNode VARP() { return getToken(tsqlParser.VARP, 0); }
		public All_distinctContext all_distinct() {
			return getRuleContext(All_distinctContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode COUNT() { return getToken(tsqlParser.COUNT, 0); }
		public TerminalNode COUNT_BIG() { return getToken(tsqlParser.COUNT_BIG, 0); }
		public TerminalNode STAR() { return getToken(tsqlParser.STAR, 0); }
		public TerminalNode CHECKSUM_AGG() { return getToken(tsqlParser.CHECKSUM_AGG, 0); }
		public TerminalNode GROUPING() { return getToken(tsqlParser.GROUPING, 0); }
		public TerminalNode GROUPING_ID() { return getToken(tsqlParser.GROUPING_ID, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Aggregate_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_windowed_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAggregate_windowed_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAggregate_windowed_function(this);
		}
	}

	public final Aggregate_windowed_functionContext aggregate_windowed_function() throws RecognitionException {
		Aggregate_windowed_functionContext _localctx = new Aggregate_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_aggregate_windowed_function);
		int _la;
		try {
			setState(2903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVG:
			case MAX:
			case MIN:
			case STDEV:
			case STDEVP:
			case SUM:
			case VAR:
			case VARP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2862);
				_la = _input.LA(1);
				if ( !(_la==AVG || _la==MAX || _la==MIN || ((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & 100663315L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2863);
				match(LR_BRACKET);
				setState(2865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(2864);
					all_distinct();
					}
				}

				setState(2867);
				expression(0);
				setState(2868);
				match(RR_BRACKET);
				setState(2870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
				case 1:
					{
					setState(2869);
					over_clause();
					}
					break;
				}
				}
				break;
			case COUNT:
			case COUNT_BIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(2872);
				_la = _input.LA(1);
				if ( !(_la==COUNT || _la==COUNT_BIG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2873);
				match(LR_BRACKET);
				setState(2879);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2874);
					((Aggregate_windowed_functionContext)_localctx).args = match(STAR);
					}
					break;
				case ALL:
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case DISTINCT:
				case FORCESEEK:
				case IDENTITY:
				case IIF:
				case LEFT:
				case NEXT:
				case NULL:
				case NULLIF:
				case NUMERIC:
				case OVER:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case TRY_CAST:
				case TRY_CONVERT:
				case TRY_PARSE:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DATETIMEOFFSETFROMPARTS:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARSE:
				case PARTITION:
				case PATH:
				case PERCENTILE_CONT:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case STRING_AGG:
				case STRING_SPLIT:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(2876);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(2875);
						all_distinct();
						}
					}

					setState(2878);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2881);
				match(RR_BRACKET);
				setState(2883);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,399,_ctx) ) {
				case 1:
					{
					setState(2882);
					over_clause();
					}
					break;
				}
				}
				break;
			case CHECKSUM_AGG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2885);
				match(CHECKSUM_AGG);
				setState(2886);
				match(LR_BRACKET);
				setState(2888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(2887);
					all_distinct();
					}
				}

				setState(2890);
				expression(0);
				setState(2891);
				match(RR_BRACKET);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2893);
				match(GROUPING);
				setState(2894);
				match(LR_BRACKET);
				setState(2895);
				expression(0);
				setState(2896);
				match(RR_BRACKET);
				}
				break;
			case GROUPING_ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(2898);
				match(GROUPING_ID);
				setState(2899);
				match(LR_BRACKET);
				setState(2900);
				expression_list();
				setState(2901);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class All_distinctContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(tsqlParser.DISTINCT, 0); }
		public All_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAll_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAll_distinct(this);
		}
	}

	public final All_distinctContext all_distinct() throws RecognitionException {
		All_distinctContext _localctx = new All_distinctContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2905);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(tsqlParser.OVER, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode PARTITION() { return getToken(tsqlParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Row_or_range_clauseContext row_or_range_clause() {
			return getRuleContext(Row_or_range_clauseContext.class,0);
		}
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOver_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOver_clause(this);
		}
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2907);
			match(OVER);
			setState(2908);
			match(LR_BRACKET);
			setState(2912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2909);
				match(PARTITION);
				setState(2910);
				match(BY);
				setState(2911);
				expression_list();
				}
			}

			setState(2915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2914);
				order_by_clause();
				}
			}

			setState(2918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(2917);
				row_or_range_clause();
				}
			}

			setState(2920);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Row_or_range_clauseContext extends ParserRuleContext {
		public Window_frame_extentContext window_frame_extent() {
			return getRuleContext(Window_frame_extentContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(tsqlParser.RANGE, 0); }
		public Row_or_range_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_or_range_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRow_or_range_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRow_or_range_clause(this);
		}
	}

	public final Row_or_range_clauseContext row_or_range_clause() throws RecognitionException {
		Row_or_range_clauseContext _localctx = new Row_or_range_clauseContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_row_or_range_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2922);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2923);
			window_frame_extent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_frame_extentContext extends ParserRuleContext {
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(tsqlParser.BETWEEN, 0); }
		public List<Window_frame_boundContext> window_frame_bound() {
			return getRuleContexts(Window_frame_boundContext.class);
		}
		public Window_frame_boundContext window_frame_bound(int i) {
			return getRuleContext(Window_frame_boundContext.class,i);
		}
		public TerminalNode AND() { return getToken(tsqlParser.AND, 0); }
		public Window_frame_extentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_extent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWindow_frame_extent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWindow_frame_extent(this);
		}
	}

	public final Window_frame_extentContext window_frame_extent() throws RecognitionException {
		Window_frame_extentContext _localctx = new Window_frame_extentContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_window_frame_extent);
		try {
			setState(2931);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT:
			case UNBOUNDED:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2925);
				window_frame_preceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2926);
				match(BETWEEN);
				setState(2927);
				window_frame_bound();
				setState(2928);
				match(AND);
				setState(2929);
				window_frame_bound();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_frame_boundContext extends ParserRuleContext {
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public Window_frame_followingContext window_frame_following() {
			return getRuleContext(Window_frame_followingContext.class,0);
		}
		public Window_frame_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWindow_frame_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWindow_frame_bound(this);
		}
	}

	public final Window_frame_boundContext window_frame_bound() throws RecognitionException {
		Window_frame_boundContext _localctx = new Window_frame_boundContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_window_frame_bound);
		try {
			setState(2935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2933);
				window_frame_preceding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2934);
				window_frame_following();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_frame_precedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(tsqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(tsqlParser.PRECEDING, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(tsqlParser.ROW, 0); }
		public Window_frame_precedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_preceding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWindow_frame_preceding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWindow_frame_preceding(this);
		}
	}

	public final Window_frame_precedingContext window_frame_preceding() throws RecognitionException {
		Window_frame_precedingContext _localctx = new Window_frame_precedingContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_window_frame_preceding);
		try {
			setState(2943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2937);
				match(UNBOUNDED);
				setState(2938);
				match(PRECEDING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2939);
				match(DECIMAL);
				setState(2940);
				match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2941);
				match(CURRENT);
				setState(2942);
				match(ROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_frame_followingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(tsqlParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(tsqlParser.FOLLOWING, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Window_frame_followingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_following; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWindow_frame_following(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWindow_frame_following(this);
		}
	}

	public final Window_frame_followingContext window_frame_following() throws RecognitionException {
		Window_frame_followingContext _localctx = new Window_frame_followingContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_window_frame_following);
		try {
			setState(2949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2945);
				match(UNBOUNDED);
				setState(2946);
				match(FOLLOWING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2947);
				match(DECIMAL);
				setState(2948);
				match(FOLLOWING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode FILESTREAM() { return getToken(tsqlParser.FILESTREAM, 0); }
		public List<Database_filestream_optionContext> database_filestream_option() {
			return getRuleContexts(Database_filestream_optionContext.class);
		}
		public Database_filestream_optionContext database_filestream_option(int i) {
			return getRuleContext(Database_filestream_optionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode DEFAULT_LANGUAGE() { return getToken(tsqlParser.DEFAULT_LANGUAGE, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode DEFAULT_FULLTEXT_LANGUAGE() { return getToken(tsqlParser.DEFAULT_FULLTEXT_LANGUAGE, 0); }
		public TerminalNode NESTED_TRIGGERS() { return getToken(tsqlParser.NESTED_TRIGGERS, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode TRANSFORM_NOISE_WORDS() { return getToken(tsqlParser.TRANSFORM_NOISE_WORDS, 0); }
		public TerminalNode TWO_DIGIT_YEAR_CUTOFF() { return getToken(tsqlParser.TWO_DIGIT_YEAR_CUTOFF, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode DB_CHAINING() { return getToken(tsqlParser.DB_CHAINING, 0); }
		public TerminalNode TRUSTWORTHY() { return getToken(tsqlParser.TRUSTWORTHY, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_database_option(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_create_database_option);
		int _la;
		try {
			int _alt;
			setState(2985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILESTREAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(2951);
				match(FILESTREAM);
				{
				setState(2952);
				database_filestream_option();
				setState(2957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,409,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2953);
						match(COMMA);
						setState(2954);
						database_filestream_option();
						}
						} 
					}
					setState(2959);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,409,_ctx);
				}
				}
				}
				break;
			case DEFAULT_LANGUAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2960);
				match(DEFAULT_LANGUAGE);
				setState(2961);
				match(EQUAL);
				setState(2964);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case NEXT:
				case NUMERIC:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(2962);
					r_id();
					}
					break;
				case STRING:
					{
					setState(2963);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DEFAULT_FULLTEXT_LANGUAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2966);
				match(DEFAULT_FULLTEXT_LANGUAGE);
				setState(2967);
				match(EQUAL);
				setState(2970);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case NEXT:
				case NUMERIC:
				case VALUE:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATE:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FIRST_VALUE:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INT:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case IO:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAG:
				case LAST:
				case LAST_VALUE:
				case LEAD:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SIZE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case ZONE:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(2968);
					r_id();
					}
					break;
				case STRING:
					{
					setState(2969);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NESTED_TRIGGERS:
				enterOuterAlt(_localctx, 4);
				{
				setState(2972);
				match(NESTED_TRIGGERS);
				setState(2973);
				match(EQUAL);
				setState(2974);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRANSFORM_NOISE_WORDS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2975);
				match(TRANSFORM_NOISE_WORDS);
				setState(2976);
				match(EQUAL);
				setState(2977);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TWO_DIGIT_YEAR_CUTOFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(2978);
				match(TWO_DIGIT_YEAR_CUTOFF);
				setState(2979);
				match(EQUAL);
				setState(2980);
				match(DECIMAL);
				}
				break;
			case DB_CHAINING:
				enterOuterAlt(_localctx, 7);
				{
				setState(2981);
				match(DB_CHAINING);
				setState(2982);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUSTWORTHY:
				enterOuterAlt(_localctx, 8);
				{
				setState(2983);
				match(TRUSTWORTHY);
				setState(2984);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Database_filestream_optionContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode NON_TRANSACTED_ACCESS() { return getToken(tsqlParser.NON_TRANSACTED_ACCESS, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode DIRECTORY_NAME() { return getToken(tsqlParser.DIRECTORY_NAME, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public TerminalNode READ_ONLY() { return getToken(tsqlParser.READ_ONLY, 0); }
		public TerminalNode FULL() { return getToken(tsqlParser.FULL, 0); }
		public Database_filestream_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_filestream_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDatabase_filestream_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDatabase_filestream_option(this);
		}
	}

	public final Database_filestream_optionContext database_filestream_option() throws RecognitionException {
		Database_filestream_optionContext _localctx = new Database_filestream_optionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_database_filestream_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2987);
			match(LR_BRACKET);
			setState(2994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TRANSACTED_ACCESS:
				{
				{
				setState(2988);
				match(NON_TRANSACTED_ACCESS);
				setState(2989);
				match(EQUAL);
				setState(2990);
				_la = _input.LA(1);
				if ( !(_la==FULL || _la==OFF || _la==READ_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case DIRECTORY_NAME:
				{
				{
				setState(2991);
				match(DIRECTORY_NAME);
				setState(2992);
				match(EQUAL);
				setState(2993);
				match(STRING);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2996);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Database_file_specContext extends ParserRuleContext {
		public File_groupContext file_group() {
			return getRuleContext(File_groupContext.class,0);
		}
		public File_specContext file_spec() {
			return getRuleContext(File_specContext.class,0);
		}
		public Database_file_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_file_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDatabase_file_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDatabase_file_spec(this);
		}
	}

	public final Database_file_specContext database_file_spec() throws RecognitionException {
		Database_file_specContext _localctx = new Database_file_specContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_database_file_spec);
		try {
			setState(3000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILEGROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2998);
				file_group();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2999);
				file_spec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_groupContext extends ParserRuleContext {
		public TerminalNode FILEGROUP() { return getToken(tsqlParser.FILEGROUP, 0); }
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public List<File_specContext> file_spec() {
			return getRuleContexts(File_specContext.class);
		}
		public File_specContext file_spec(int i) {
			return getRuleContext(File_specContext.class,i);
		}
		public List<TerminalNode> CONTAINS() { return getTokens(tsqlParser.CONTAINS); }
		public TerminalNode CONTAINS(int i) {
			return getToken(tsqlParser.CONTAINS, i);
		}
		public TerminalNode FILESTREAM() { return getToken(tsqlParser.FILESTREAM, 0); }
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public TerminalNode MEMORY_OPTIMIZED_DATA() { return getToken(tsqlParser.MEMORY_OPTIMIZED_DATA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public File_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFile_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFile_group(this);
		}
	}

	public final File_groupContext file_group() throws RecognitionException {
		File_groupContext _localctx = new File_groupContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_file_group);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3002);
			match(FILEGROUP);
			setState(3003);
			r_id();
			setState(3006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
			case 1:
				{
				setState(3004);
				match(CONTAINS);
				setState(3005);
				match(FILESTREAM);
				}
				break;
			}
			setState(3009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(3008);
				match(DEFAULT);
				}
			}

			setState(3013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(3011);
				match(CONTAINS);
				setState(3012);
				match(MEMORY_OPTIMIZED_DATA);
				}
			}

			setState(3015);
			file_spec();
			setState(3020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3016);
					match(COMMA);
					setState(3017);
					file_spec();
					}
					} 
				}
				setState(3022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_specContext extends ParserRuleContext {
		public Token r_file;
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(tsqlParser.NAME, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(tsqlParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(tsqlParser.EQUAL, i);
		}
		public TerminalNode FILENAME() { return getToken(tsqlParser.FILENAME, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(tsqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(tsqlParser.STRING, i);
		}
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode SIZE() { return getToken(tsqlParser.SIZE, 0); }
		public List<File_sizeContext> file_size() {
			return getRuleContexts(File_sizeContext.class);
		}
		public File_sizeContext file_size(int i) {
			return getRuleContext(File_sizeContext.class,i);
		}
		public TerminalNode MAXSIZE() { return getToken(tsqlParser.MAXSIZE, 0); }
		public TerminalNode FILEGROWTH() { return getToken(tsqlParser.FILEGROWTH, 0); }
		public TerminalNode UNLIMITED() { return getToken(tsqlParser.UNLIMITED, 0); }
		public File_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFile_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFile_spec(this);
		}
	}

	public final File_specContext file_spec() throws RecognitionException {
		File_specContext _localctx = new File_specContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_file_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3023);
			match(LR_BRACKET);
			setState(3024);
			match(NAME);
			setState(3025);
			match(EQUAL);
			setState(3028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(3026);
				r_id();
				}
				break;
			case STRING:
				{
				setState(3027);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(3030);
				match(COMMA);
				}
			}

			setState(3033);
			match(FILENAME);
			setState(3034);
			match(EQUAL);
			setState(3035);
			((File_specContext)_localctx).r_file = match(STRING);
			setState(3037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(3036);
				match(COMMA);
				}
			}

			setState(3045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIZE) {
				{
				setState(3039);
				match(SIZE);
				setState(3040);
				match(EQUAL);
				setState(3041);
				file_size();
				setState(3043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(3042);
					match(COMMA);
					}
				}

				}
			}

			setState(3056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAXSIZE) {
				{
				setState(3047);
				match(MAXSIZE);
				setState(3048);
				match(EQUAL);
				setState(3051);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECIMAL:
					{
					setState(3049);
					file_size();
					}
					break;
				case UNLIMITED:
					{
					setState(3050);
					match(UNLIMITED);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(3053);
					match(COMMA);
					}
				}

				}
			}

			setState(3064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILEGROWTH) {
				{
				setState(3058);
				match(FILEGROWTH);
				setState(3059);
				match(EQUAL);
				setState(3060);
				file_size();
				setState(3062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(3061);
					match(COMMA);
					}
				}

				}
			}

			setState(3066);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Full_table_nameContext extends ParserRuleContext {
		public R_idContext server;
		public R_idContext database;
		public R_idContext schema;
		public R_idContext table;
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(tsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(tsqlParser.DOT, i);
		}
		public Full_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFull_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFull_table_name(this);
		}
	}

	public final Full_table_nameContext full_table_name() throws RecognitionException {
		Full_table_nameContext _localctx = new Full_table_nameContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_full_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,430,_ctx) ) {
			case 1:
				{
				setState(3068);
				((Full_table_nameContext)_localctx).server = r_id();
				setState(3069);
				match(DOT);
				setState(3070);
				((Full_table_nameContext)_localctx).database = r_id();
				setState(3071);
				match(DOT);
				setState(3072);
				((Full_table_nameContext)_localctx).schema = r_id();
				setState(3073);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(3075);
				((Full_table_nameContext)_localctx).database = r_id();
				setState(3076);
				match(DOT);
				setState(3078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1108101562369L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -9220850245999262719L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & -8070459558675465653L) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & -6413215653674627739L) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & 41918743507263L) != 0)) {
					{
					setState(3077);
					((Full_table_nameContext)_localctx).schema = r_id();
					}
				}

				setState(3080);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(3082);
				((Full_table_nameContext)_localctx).schema = r_id();
				setState(3083);
				match(DOT);
				}
				break;
			}
			setState(3087);
			((Full_table_nameContext)_localctx).table = r_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public R_idContext database;
		public R_idContext schema;
		public R_idContext table;
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(tsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(tsqlParser.DOT, i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				{
				setState(3089);
				((Table_nameContext)_localctx).database = r_id();
				setState(3090);
				match(DOT);
				setState(3092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1108101562369L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -9220850245999262719L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & -8070459558675465653L) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & -6413215653674627739L) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & 41918743507263L) != 0)) {
					{
					setState(3091);
					((Table_nameContext)_localctx).schema = r_id();
					}
				}

				setState(3094);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(3096);
				((Table_nameContext)_localctx).schema = r_id();
				setState(3097);
				match(DOT);
				}
				break;
			}
			setState(3101);
			((Table_nameContext)_localctx).table = r_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_nameContext extends ParserRuleContext {
		public R_idContext schema;
		public R_idContext name;
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public TerminalNode DOT() { return getToken(tsqlParser.DOT, 0); }
		public Simple_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSimple_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSimple_name(this);
		}
	}

	public final Simple_nameContext simple_name() throws RecognitionException {
		Simple_nameContext _localctx = new Simple_nameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,433,_ctx) ) {
			case 1:
				{
				setState(3103);
				((Simple_nameContext)_localctx).schema = r_id();
				setState(3104);
				match(DOT);
				}
				break;
			}
			setState(3108);
			((Simple_nameContext)_localctx).name = r_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_proc_nameContext extends ParserRuleContext {
		public R_idContext database;
		public R_idContext schema;
		public R_idContext procedure;
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(tsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(tsqlParser.DOT, i);
		}
		public Func_proc_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_proc_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFunc_proc_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFunc_proc_name(this);
		}
	}

	public final Func_proc_nameContext func_proc_name() throws RecognitionException {
		Func_proc_nameContext _localctx = new Func_proc_nameContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_func_proc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,435,_ctx) ) {
			case 1:
				{
				setState(3110);
				((Func_proc_nameContext)_localctx).database = r_id();
				setState(3111);
				match(DOT);
				setState(3113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1108101562369L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -9220850245999262719L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & -8070459558675465653L) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & -6413215653674627739L) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & 41918743507263L) != 0)) {
					{
					setState(3112);
					((Func_proc_nameContext)_localctx).schema = r_id();
					}
				}

				setState(3115);
				match(DOT);
				}
				break;
			case 2:
				{
				{
				setState(3117);
				((Func_proc_nameContext)_localctx).schema = r_id();
				}
				setState(3118);
				match(DOT);
				}
				break;
			}
			setState(3122);
			((Func_proc_nameContext)_localctx).procedure = r_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ddl_objectContext extends ParserRuleContext {
		public Full_table_nameContext full_table_name() {
			return getRuleContext(Full_table_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Ddl_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDdl_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDdl_object(this);
		}
	}

	public final Ddl_objectContext ddl_object() throws RecognitionException {
		Ddl_objectContext _localctx = new Ddl_objectContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_ddl_object);
		try {
			setState(3126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3124);
				full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3125);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Full_column_nameContext extends ParserRuleContext {
		public Table_nameContext table;
		public R_idContext name;
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode DOT() { return getToken(tsqlParser.DOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Full_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFull_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFull_column_name(this);
		}
	}

	public final Full_column_nameContext full_column_name() throws RecognitionException {
		Full_column_nameContext _localctx = new Full_column_nameContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_full_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,437,_ctx) ) {
			case 1:
				{
				setState(3128);
				((Full_column_nameContext)_localctx).table = table_name();
				setState(3129);
				match(DOT);
				}
				break;
			}
			setState(3133);
			((Full_column_nameContext)_localctx).name = r_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_name_listContext extends ParserRuleContext {
		public List<R_idContext> r_id() {
			return getRuleContexts(R_idContext.class);
		}
		public R_idContext r_id(int i) {
			return getRuleContext(R_idContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_name_list(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3135);
			r_id();
			setState(3140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3136);
				match(COMMA);
				setState(3137);
				r_id();
				}
				}
				setState(3142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cursor_nameContext extends ParserRuleContext {
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Cursor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCursor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCursor_name(this);
		}
	}

	public final Cursor_nameContext cursor_name() throws RecognitionException {
		Cursor_nameContext _localctx = new Cursor_nameContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_cursor_name);
		try {
			setState(3145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3143);
				r_id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3144);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class On_offContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public On_offContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_off; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOn_off(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOn_off(this);
		}
	}

	public final On_offContext on_off() throws RecognitionException {
		On_offContext _localctx = new On_offContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_on_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3147);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClusteredContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(tsqlParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(tsqlParser.NONCLUSTERED, 0); }
		public ClusteredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustered; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterClustered(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitClustered(this);
		}
	}

	public final ClusteredContext clustered() throws RecognitionException {
		ClusteredContext _localctx = new ClusteredContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_clustered);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3149);
			_la = _input.LA(1);
			if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Null_notnullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public Null_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_notnull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterNull_notnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitNull_notnull(this);
		}
	}

	public final Null_notnullContext null_notnull() throws RecognitionException {
		Null_notnullContext _localctx = new Null_notnullContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3151);
				match(NOT);
				}
			}

			setState(3154);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Scalar_function_nameContext extends ParserRuleContext {
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(tsqlParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(tsqlParser.LEFT, 0); }
		public TerminalNode BINARY_CHECKSUM() { return getToken(tsqlParser.BINARY_CHECKSUM, 0); }
		public TerminalNode CHECKSUM() { return getToken(tsqlParser.CHECKSUM, 0); }
		public Scalar_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterScalar_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitScalar_function_name(this);
		}
	}

	public final Scalar_function_nameContext scalar_function_name() throws RecognitionException {
		Scalar_function_nameContext _localctx = new Scalar_function_nameContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_scalar_function_name);
		try {
			setState(3161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3156);
				func_proc_name();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3157);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3158);
				match(LEFT);
				}
				break;
			case BINARY_CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(3159);
				match(BINARY_CHECKSUM);
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(3160);
				match(CHECKSUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDefault_value(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_default_value);
		try {
			setState(3165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3163);
				match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(3164);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public Token dollar;
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode BINARY() { return getToken(tsqlParser.BINARY, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode REAL() { return getToken(tsqlParser.REAL, 0); }
		public TerminalNode FLOAT() { return getToken(tsqlParser.FLOAT, 0); }
		public TerminalNode DOLLAR() { return getToken(tsqlParser.DOLLAR, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_constant);
		int _la;
		try {
			setState(3182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,446,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3167);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3168);
				match(BINARY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(3169);
					sign();
					}
				}

				setState(3172);
				match(DECIMAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(3173);
					sign();
					}
				}

				setState(3176);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==REAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(3177);
					sign();
					}
				}

				setState(3180);
				((ConstantContext)_localctx).dollar = match(DOLLAR);
				setState(3181);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(tsqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(tsqlParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3184);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class R_idContext extends ParserRuleContext {
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(tsqlParser.DOUBLE_QUOTE_ID, 0); }
		public TerminalNode SQUARE_BRACKET_ID() { return getToken(tsqlParser.SQUARE_BRACKET_ID, 0); }
		public R_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterR_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitR_id(this);
		}
	}

	public final R_idContext r_id() throws RecognitionException {
		R_idContext _localctx = new R_idContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_r_id);
		try {
			setState(3189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case NEXT:
			case NUMERIC:
			case VALUE:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATE:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INT:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case IO:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SIZE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ZONE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3186);
				simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3187);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case SQUARE_BRACKET_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(3188);
				match(SQUARE_BRACKET_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public TerminalNode IO() { return getToken(tsqlParser.IO, 0); }
		public TerminalNode ABSOLUTE() { return getToken(tsqlParser.ABSOLUTE, 0); }
		public TerminalNode APPLY() { return getToken(tsqlParser.APPLY, 0); }
		public TerminalNode AUTO() { return getToken(tsqlParser.AUTO, 0); }
		public TerminalNode AVG() { return getToken(tsqlParser.AVG, 0); }
		public TerminalNode BASE64() { return getToken(tsqlParser.BASE64, 0); }
		public TerminalNode CALLER() { return getToken(tsqlParser.CALLER, 0); }
		public TerminalNode CAST() { return getToken(tsqlParser.CAST, 0); }
		public TerminalNode CATCH() { return getToken(tsqlParser.CATCH, 0); }
		public TerminalNode CHECKSUM_AGG() { return getToken(tsqlParser.CHECKSUM_AGG, 0); }
		public TerminalNode COMMITTED() { return getToken(tsqlParser.COMMITTED, 0); }
		public TerminalNode CONCAT() { return getToken(tsqlParser.CONCAT, 0); }
		public TerminalNode CONTROL() { return getToken(tsqlParser.CONTROL, 0); }
		public TerminalNode COOKIE() { return getToken(tsqlParser.COOKIE, 0); }
		public TerminalNode COUNT() { return getToken(tsqlParser.COUNT, 0); }
		public TerminalNode COUNT_BIG() { return getToken(tsqlParser.COUNT_BIG, 0); }
		public TerminalNode DATE() { return getToken(tsqlParser.DATE, 0); }
		public TerminalNode DELAY() { return getToken(tsqlParser.DELAY, 0); }
		public TerminalNode DELETED() { return getToken(tsqlParser.DELETED, 0); }
		public TerminalNode DENSE_RANK() { return getToken(tsqlParser.DENSE_RANK, 0); }
		public TerminalNode DISABLE() { return getToken(tsqlParser.DISABLE, 0); }
		public TerminalNode DYNAMIC() { return getToken(tsqlParser.DYNAMIC, 0); }
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public TerminalNode EXPAND() { return getToken(tsqlParser.EXPAND, 0); }
		public TerminalNode FAST() { return getToken(tsqlParser.FAST, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(tsqlParser.FAST_FORWARD, 0); }
		public TerminalNode FIRST() { return getToken(tsqlParser.FIRST, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(tsqlParser.FIRST_VALUE, 0); }
		public TerminalNode FOLLOWING() { return getToken(tsqlParser.FOLLOWING, 0); }
		public TerminalNode FORCE() { return getToken(tsqlParser.FORCE, 0); }
		public TerminalNode FORCESEEK() { return getToken(tsqlParser.FORCESEEK, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(tsqlParser.FORWARD_ONLY, 0); }
		public TerminalNode FULLSCAN() { return getToken(tsqlParser.FULLSCAN, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode GO() { return getToken(tsqlParser.GO, 0); }
		public TerminalNode GROUPING() { return getToken(tsqlParser.GROUPING, 0); }
		public TerminalNode GROUPING_ID() { return getToken(tsqlParser.GROUPING_ID, 0); }
		public TerminalNode HASH() { return getToken(tsqlParser.HASH, 0); }
		public TerminalNode IMPERSONATE() { return getToken(tsqlParser.IMPERSONATE, 0); }
		public TerminalNode INSENSITIVE() { return getToken(tsqlParser.INSENSITIVE, 0); }
		public TerminalNode INT() { return getToken(tsqlParser.INT, 0); }
		public TerminalNode INSERTED() { return getToken(tsqlParser.INSERTED, 0); }
		public TerminalNode ISOLATION() { return getToken(tsqlParser.ISOLATION, 0); }
		public TerminalNode KEEP() { return getToken(tsqlParser.KEEP, 0); }
		public TerminalNode KEEPFIXED() { return getToken(tsqlParser.KEEPFIXED, 0); }
		public TerminalNode FORCED() { return getToken(tsqlParser.FORCED, 0); }
		public TerminalNode KEYSET() { return getToken(tsqlParser.KEYSET, 0); }
		public TerminalNode IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX() { return getToken(tsqlParser.IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX, 0); }
		public TerminalNode LAG() { return getToken(tsqlParser.LAG, 0); }
		public TerminalNode LAST() { return getToken(tsqlParser.LAST, 0); }
		public TerminalNode LAST_VALUE() { return getToken(tsqlParser.LAST_VALUE, 0); }
		public TerminalNode LEAD() { return getToken(tsqlParser.LEAD, 0); }
		public TerminalNode LEVEL() { return getToken(tsqlParser.LEVEL, 0); }
		public TerminalNode LOCAL() { return getToken(tsqlParser.LOCAL, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(tsqlParser.LOCK_ESCALATION, 0); }
		public TerminalNode LOGIN() { return getToken(tsqlParser.LOGIN, 0); }
		public TerminalNode LOOP() { return getToken(tsqlParser.LOOP, 0); }
		public TerminalNode MARK() { return getToken(tsqlParser.MARK, 0); }
		public TerminalNode MAX() { return getToken(tsqlParser.MAX, 0); }
		public TerminalNode MAXDOP() { return getToken(tsqlParser.MAXDOP, 0); }
		public TerminalNode MAXRECURSION() { return getToken(tsqlParser.MAXRECURSION, 0); }
		public TerminalNode MIN() { return getToken(tsqlParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(tsqlParser.MODIFY, 0); }
		public TerminalNode NAME() { return getToken(tsqlParser.NAME, 0); }
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public TerminalNode NOCOUNT() { return getToken(tsqlParser.NOCOUNT, 0); }
		public TerminalNode NOEXPAND() { return getToken(tsqlParser.NOEXPAND, 0); }
		public TerminalNode NORECOMPUTE() { return getToken(tsqlParser.NORECOMPUTE, 0); }
		public TerminalNode NTILE() { return getToken(tsqlParser.NTILE, 0); }
		public TerminalNode NUMBER() { return getToken(tsqlParser.NUMBER, 0); }
		public TerminalNode NUMERIC() { return getToken(tsqlParser.NUMERIC, 0); }
		public TerminalNode OFFSET() { return getToken(tsqlParser.OFFSET, 0); }
		public TerminalNode ONLINE() { return getToken(tsqlParser.ONLINE, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode OPTIMISTIC() { return getToken(tsqlParser.OPTIMISTIC, 0); }
		public TerminalNode OPTIMIZE() { return getToken(tsqlParser.OPTIMIZE, 0); }
		public TerminalNode OUT() { return getToken(tsqlParser.OUT, 0); }
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public TerminalNode OWNER() { return getToken(tsqlParser.OWNER, 0); }
		public TerminalNode PARAMETERIZATION() { return getToken(tsqlParser.PARAMETERIZATION, 0); }
		public TerminalNode PARTITION() { return getToken(tsqlParser.PARTITION, 0); }
		public TerminalNode PATH() { return getToken(tsqlParser.PATH, 0); }
		public TerminalNode PRECEDING() { return getToken(tsqlParser.PRECEDING, 0); }
		public TerminalNode PRIOR() { return getToken(tsqlParser.PRIOR, 0); }
		public TerminalNode PRIVILEGES() { return getToken(tsqlParser.PRIVILEGES, 0); }
		public TerminalNode RANGE() { return getToken(tsqlParser.RANGE, 0); }
		public TerminalNode RANK() { return getToken(tsqlParser.RANK, 0); }
		public TerminalNode READONLY() { return getToken(tsqlParser.READONLY, 0); }
		public TerminalNode READ_ONLY() { return getToken(tsqlParser.READ_ONLY, 0); }
		public TerminalNode RECOMPILE() { return getToken(tsqlParser.RECOMPILE, 0); }
		public TerminalNode RELATIVE() { return getToken(tsqlParser.RELATIVE, 0); }
		public TerminalNode REMOTE() { return getToken(tsqlParser.REMOTE, 0); }
		public TerminalNode REPEATABLE() { return getToken(tsqlParser.REPEATABLE, 0); }
		public TerminalNode ROBUST() { return getToken(tsqlParser.ROBUST, 0); }
		public TerminalNode ROOT() { return getToken(tsqlParser.ROOT, 0); }
		public TerminalNode ROW() { return getToken(tsqlParser.ROW, 0); }
		public TerminalNode ROWGUID() { return getToken(tsqlParser.ROWGUID, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(tsqlParser.ROW_NUMBER, 0); }
		public TerminalNode SAMPLE() { return getToken(tsqlParser.SAMPLE, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(tsqlParser.SCHEMABINDING, 0); }
		public TerminalNode SCROLL() { return getToken(tsqlParser.SCROLL, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(tsqlParser.SCROLL_LOCKS, 0); }
		public TerminalNode SELF() { return getToken(tsqlParser.SELF, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(tsqlParser.SERIALIZABLE, 0); }
		public TerminalNode SIMPLE() { return getToken(tsqlParser.SIMPLE, 0); }
		public TerminalNode SIZE() { return getToken(tsqlParser.SIZE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(tsqlParser.SNAPSHOT, 0); }
		public TerminalNode SPATIAL_WINDOW_MAX_CELLS() { return getToken(tsqlParser.SPATIAL_WINDOW_MAX_CELLS, 0); }
		public TerminalNode STATIC() { return getToken(tsqlParser.STATIC, 0); }
		public TerminalNode STATS_STREAM() { return getToken(tsqlParser.STATS_STREAM, 0); }
		public TerminalNode STDEV() { return getToken(tsqlParser.STDEV, 0); }
		public TerminalNode STDEVP() { return getToken(tsqlParser.STDEVP, 0); }
		public TerminalNode SUM() { return getToken(tsqlParser.SUM, 0); }
		public TerminalNode TEXTIMAGE_ON() { return getToken(tsqlParser.TEXTIMAGE_ON, 0); }
		public TerminalNode THROW() { return getToken(tsqlParser.THROW, 0); }
		public TerminalNode TIES() { return getToken(tsqlParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public TerminalNode TRY() { return getToken(tsqlParser.TRY, 0); }
		public TerminalNode TYPE() { return getToken(tsqlParser.TYPE, 0); }
		public TerminalNode TYPE_WARNING() { return getToken(tsqlParser.TYPE_WARNING, 0); }
		public TerminalNode UNBOUNDED() { return getToken(tsqlParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(tsqlParser.UNCOMMITTED, 0); }
		public TerminalNode UNKNOWN() { return getToken(tsqlParser.UNKNOWN, 0); }
		public TerminalNode USING() { return getToken(tsqlParser.USING, 0); }
		public TerminalNode VAR() { return getToken(tsqlParser.VAR, 0); }
		public TerminalNode VARP() { return getToken(tsqlParser.VARP, 0); }
		public TerminalNode VALUE() { return getToken(tsqlParser.VALUE, 0); }
		public TerminalNode VIEW_METADATA() { return getToken(tsqlParser.VIEW_METADATA, 0); }
		public TerminalNode VIEWS() { return getToken(tsqlParser.VIEWS, 0); }
		public TerminalNode WORK() { return getToken(tsqlParser.WORK, 0); }
		public TerminalNode XML() { return getToken(tsqlParser.XML, 0); }
		public TerminalNode XMLNAMESPACES() { return getToken(tsqlParser.XMLNAMESPACES, 0); }
		public TerminalNode ZONE() { return getToken(tsqlParser.ZONE, 0); }
		public Simple_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSimple_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSimple_id(this);
		}
	}

	public final Simple_idContext simple_id() throws RecognitionException {
		Simple_idContext _localctx = new Simple_idContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_simple_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3191);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1108101562369L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -9220850245999262719L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & -8070459558675465653L) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & -6413215653674627739L) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & 35321673740607L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(tsqlParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(tsqlParser.LESS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(tsqlParser.EXCLAMATION, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitComparison_operator(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_comparison_operator);
		try {
			setState(3208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,448,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3193);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3194);
				match(GREATER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3195);
				match(LESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3196);
				match(LESS);
				setState(3197);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3198);
				match(GREATER);
				setState(3199);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3200);
				match(LESS);
				setState(3201);
				match(GREATER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3202);
				match(EXCLAMATION);
				setState(3203);
				match(EQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3204);
				match(EXCLAMATION);
				setState(3205);
				match(GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3206);
				match(EXCLAMATION);
				setState(3207);
				match(LESS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS_ASSIGN() { return getToken(tsqlParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(tsqlParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(tsqlParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(tsqlParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(tsqlParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(tsqlParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(tsqlParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(tsqlParser.OR_ASSIGN, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3210);
			_la = _input.LA(1);
			if ( !(((((_la - 443)) & ~0x3f) == 0 && ((1L << (_la - 443)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_sizeContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode KB() { return getToken(tsqlParser.KB, 0); }
		public TerminalNode MB() { return getToken(tsqlParser.MB, 0); }
		public TerminalNode GB() { return getToken(tsqlParser.GB, 0); }
		public TerminalNode TB() { return getToken(tsqlParser.TB, 0); }
		public TerminalNode MODULE() { return getToken(tsqlParser.MODULE, 0); }
		public File_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFile_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFile_size(this);
		}
	}

	public final File_sizeContext file_size() throws RecognitionException {
		File_sizeContext _localctx = new File_sizeContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_file_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3212);
			match(DECIMAL);
			setState(3214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & 137439477761L) != 0) || _la==TB || _la==MODULE) {
				{
				setState(3213);
				_la = _input.LA(1);
				if ( !(((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & 137439477761L) != 0) || _la==TB || _la==MODULE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_or_alter_procedureContext extends ParserRuleContext {
		public Token proc;
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(tsqlParser.ALTER, 0); }
		public TerminalNode PROC() { return getToken(tsqlParser.PROC, 0); }
		public TerminalNode PROCEDURE() { return getToken(tsqlParser.PROCEDURE, 0); }
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public List<Procedure_paramContext> procedure_param() {
			return getRuleContexts(Procedure_paramContext.class);
		}
		public Procedure_paramContext procedure_param(int i) {
			return getRuleContext(Procedure_paramContext.class,i);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Procedure_optionContext> procedure_option() {
			return getRuleContexts(Procedure_optionContext.class);
		}
		public Procedure_optionContext procedure_option(int i) {
			return getRuleContext(Procedure_optionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode OR() { return getToken(tsqlParser.OR, 0); }
		public Create_or_alter_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_or_alter_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_or_alter_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_or_alter_procedure(this);
		}
	}

	public final Create_or_alter_procedureContext create_or_alter_procedure() throws RecognitionException {
		Create_or_alter_procedureContext _localctx = new Create_or_alter_procedureContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_create_or_alter_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				{
				{
				setState(3216);
				match(CREATE);
				setState(3219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(3217);
					match(OR);
					setState(3218);
					match(ALTER);
					}
				}

				}
				}
				break;
			case ALTER:
				{
				setState(3221);
				match(ALTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3224);
			((Create_or_alter_procedureContext)_localctx).proc = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PROC || _la==PROCEDURE) ) {
				((Create_or_alter_procedureContext)_localctx).proc = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3225);
			func_proc_name();
			setState(3228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(3226);
				match(SEMI);
				setState(3227);
				match(DECIMAL);
				}
			}

			setState(3244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL_ID || _la==LR_BRACKET) {
				{
				setState(3231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(3230);
					match(LR_BRACKET);
					}
				}

				setState(3233);
				procedure_param();
				setState(3238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3234);
					match(COMMA);
					setState(3235);
					procedure_param();
					}
					}
					setState(3240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RR_BRACKET) {
					{
					setState(3241);
					match(RR_BRACKET);
					}
				}

				}
			}

			setState(3255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3246);
				match(WITH);
				setState(3247);
				procedure_option();
				setState(3252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3248);
					match(COMMA);
					setState(3249);
					procedure_option();
					}
					}
					setState(3254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(3257);
				match(FOR);
				setState(3258);
				match(REPLICATION);
				}
			}

			setState(3261);
			match(AS);
			setState(3262);
			sql_clauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_or_alter_functionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(tsqlParser.FUNCTION, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(tsqlParser.ALTER, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public Func_body_returns_selectContext func_body_returns_select() {
			return getRuleContext(Func_body_returns_selectContext.class,0);
		}
		public Func_body_returns_tableContext func_body_returns_table() {
			return getRuleContext(Func_body_returns_tableContext.class,0);
		}
		public Func_body_returns_scalarContext func_body_returns_scalar() {
			return getRuleContext(Func_body_returns_scalarContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public List<Procedure_paramContext> procedure_param() {
			return getRuleContexts(Procedure_paramContext.class);
		}
		public Procedure_paramContext procedure_param(int i) {
			return getRuleContext(Procedure_paramContext.class,i);
		}
		public TerminalNode OR() { return getToken(tsqlParser.OR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Create_or_alter_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_or_alter_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_or_alter_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_or_alter_function(this);
		}
	}

	public final Create_or_alter_functionContext create_or_alter_function() throws RecognitionException {
		Create_or_alter_functionContext _localctx = new Create_or_alter_functionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_create_or_alter_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				{
				{
				setState(3264);
				match(CREATE);
				setState(3267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(3265);
					match(OR);
					setState(3266);
					match(ALTER);
					}
				}

				}
				}
				break;
			case ALTER:
				{
				setState(3269);
				match(ALTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3272);
			match(FUNCTION);
			setState(3273);
			func_proc_name();
			setState(3287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,463,_ctx) ) {
			case 1:
				{
				{
				setState(3274);
				match(LR_BRACKET);
				setState(3275);
				procedure_param();
				setState(3280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3276);
					match(COMMA);
					setState(3277);
					procedure_param();
					}
					}
					setState(3282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3283);
				match(RR_BRACKET);
				}
				}
				break;
			case 2:
				{
				setState(3285);
				match(LR_BRACKET);
				setState(3286);
				match(RR_BRACKET);
				}
				break;
			}
			setState(3292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,464,_ctx) ) {
			case 1:
				{
				setState(3289);
				func_body_returns_select();
				}
				break;
			case 2:
				{
				setState(3290);
				func_body_returns_table();
				}
				break;
			case 3:
				{
				setState(3291);
				func_body_returns_scalar();
				}
				break;
			}
			setState(3295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,465,_ctx) ) {
			case 1:
				{
				setState(3294);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_body_returns_selectContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(tsqlParser.RETURNS, 0); }
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public TerminalNode RETURN() { return getToken(tsqlParser.RETURN, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Function_optionContext> function_option() {
			return getRuleContexts(Function_optionContext.class);
		}
		public Function_optionContext function_option(int i) {
			return getRuleContext(Function_optionContext.class,i);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Func_body_returns_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body_returns_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFunc_body_returns_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFunc_body_returns_select(this);
		}
	}

	public final Func_body_returns_selectContext func_body_returns_select() throws RecognitionException {
		Func_body_returns_selectContext _localctx = new Func_body_returns_selectContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_func_body_returns_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3297);
			match(RETURNS);
			setState(3298);
			match(TABLE);
			setState(3308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3299);
				match(WITH);
				setState(3300);
				function_option();
				setState(3305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3301);
					match(COMMA);
					setState(3302);
					function_option();
					}
					}
					setState(3307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(3310);
				match(AS);
				}
			}

			setState(3313);
			match(RETURN);
			setState(3319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,469,_ctx) ) {
			case 1:
				{
				setState(3314);
				match(LR_BRACKET);
				setState(3315);
				select_statement();
				setState(3316);
				match(RR_BRACKET);
				}
				break;
			case 2:
				{
				setState(3318);
				select_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_body_returns_tableContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(tsqlParser.RETURNS, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Table_type_definitionContext table_type_definition() {
			return getRuleContext(Table_type_definitionContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(tsqlParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(tsqlParser.RETURN, 0); }
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Function_optionContext> function_option() {
			return getRuleContexts(Function_optionContext.class);
		}
		public Function_optionContext function_option(int i) {
			return getRuleContext(Function_optionContext.class,i);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(tsqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(tsqlParser.SEMI, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Func_body_returns_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body_returns_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFunc_body_returns_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFunc_body_returns_table(this);
		}
	}

	public final Func_body_returns_tableContext func_body_returns_table() throws RecognitionException {
		Func_body_returns_tableContext _localctx = new Func_body_returns_tableContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_func_body_returns_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3321);
			match(RETURNS);
			setState(3322);
			match(LOCAL_ID);
			setState(3323);
			table_type_definition();
			setState(3333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3324);
				match(WITH);
				setState(3325);
				function_option();
				setState(3330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3326);
					match(COMMA);
					setState(3327);
					function_option();
					}
					}
					setState(3332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(3335);
				match(AS);
				}
			}

			setState(3338);
			match(BEGIN);
			setState(3342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3339);
					sql_clause();
					}
					} 
				}
				setState(3344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
			}
			setState(3345);
			match(RETURN);
			setState(3347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(3346);
				match(SEMI);
				}
			}

			setState(3349);
			match(END);
			setState(3351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,475,_ctx) ) {
			case 1:
				{
				setState(3350);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_body_returns_scalarContext extends ParserRuleContext {
		public ExpressionContext ret;
		public TerminalNode RETURNS() { return getToken(tsqlParser.RETURNS, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(tsqlParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(tsqlParser.RETURN, 0); }
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Function_optionContext> function_option() {
			return getRuleContexts(Function_optionContext.class);
		}
		public Function_optionContext function_option(int i) {
			return getRuleContext(Function_optionContext.class,i);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(tsqlParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(tsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tsqlParser.COMMA, i);
		}
		public Func_body_returns_scalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body_returns_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFunc_body_returns_scalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFunc_body_returns_scalar(this);
		}
	}

	public final Func_body_returns_scalarContext func_body_returns_scalar() throws RecognitionException {
		Func_body_returns_scalarContext _localctx = new Func_body_returns_scalarContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_func_body_returns_scalar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3353);
			match(RETURNS);
			setState(3354);
			data_type();
			setState(3364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3355);
				match(WITH);
				setState(3356);
				function_option();
				setState(3361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3357);
					match(COMMA);
					setState(3358);
					function_option();
					}
					}
					setState(3363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(3366);
				match(AS);
				}
			}

			setState(3369);
			match(BEGIN);
			setState(3373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3370);
					sql_clause();
					}
					} 
				}
				setState(3375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
			}
			setState(3376);
			match(RETURN);
			setState(3377);
			((Func_body_returns_scalarContext)_localctx).ret = expression(0);
			setState(3379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(3378);
				match(SEMI);
				}
			}

			setState(3381);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_paramContext extends ParserRuleContext {
		public Default_valueContext default_val;
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode DOT() { return getToken(tsqlParser.DOT, 0); }
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode VARYING() { return getToken(tsqlParser.VARYING, 0); }
		public TerminalNode EQUAL() { return getToken(tsqlParser.EQUAL, 0); }
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public TerminalNode OUT() { return getToken(tsqlParser.OUT, 0); }
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public TerminalNode READONLY() { return getToken(tsqlParser.READONLY, 0); }
		public Procedure_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterProcedure_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitProcedure_param(this);
		}
	}

	public final Procedure_paramContext procedure_param() throws RecognitionException {
		Procedure_paramContext _localctx = new Procedure_paramContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_procedure_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3383);
			match(LOCAL_ID);
			setState(3387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,481,_ctx) ) {
			case 1:
				{
				setState(3384);
				r_id();
				setState(3385);
				match(DOT);
				}
				break;
			}
			setState(3390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(3389);
				match(AS);
				}
			}

			setState(3392);
			data_type();
			setState(3394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARYING) {
				{
				setState(3393);
				match(VARYING);
				}
			}

			setState(3398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(3396);
				match(EQUAL);
				setState(3397);
				((Procedure_paramContext)_localctx).default_val = default_value();
				}
			}

			setState(3401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & 32771L) != 0)) {
				{
				setState(3400);
				_la = _input.LA(1);
				if ( !(((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & 32771L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_optionContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public TerminalNode RECOMPILE() { return getToken(tsqlParser.RECOMPILE, 0); }
		public Execute_clauseContext execute_clause() {
			return getRuleContext(Execute_clauseContext.class,0);
		}
		public Procedure_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterProcedure_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitProcedure_option(this);
		}
	}

	public final Procedure_optionContext procedure_option() throws RecognitionException {
		Procedure_optionContext _localctx = new Procedure_optionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_procedure_option);
		try {
			setState(3406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCRYPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(3403);
				match(ENCRYPTION);
				}
				break;
			case RECOMPILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3404);
				match(RECOMPILE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3405);
				execute_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_optionContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(tsqlParser.SCHEMABINDING, 0); }
		public TerminalNode RETURNS() { return getToken(tsqlParser.RETURNS, 0); }
		public List<TerminalNode> NULL() { return getTokens(tsqlParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(tsqlParser.NULL, i);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode INPUT() { return getToken(tsqlParser.INPUT, 0); }
		public TerminalNode CALLED() { return getToken(tsqlParser.CALLED, 0); }
		public Execute_clauseContext execute_clause() {
			return getRuleContext(Execute_clauseContext.class,0);
		}
		public Function_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFunction_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFunction_option(this);
		}
	}

	public final Function_optionContext function_option() throws RecognitionException {
		Function_optionContext _localctx = new Function_optionContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_function_option);
		try {
			setState(3420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCRYPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(3408);
				match(ENCRYPTION);
				}
				break;
			case SCHEMABINDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(3409);
				match(SCHEMABINDING);
				}
				break;
			case RETURNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(3410);
				match(RETURNS);
				setState(3411);
				match(NULL);
				setState(3412);
				match(ON);
				setState(3413);
				match(NULL);
				setState(3414);
				match(INPUT);
				}
				break;
			case CALLED:
				enterOuterAlt(_localctx, 4);
				{
				setState(3415);
				match(CALLED);
				setState(3416);
				match(ON);
				setState(3417);
				match(NULL);
				setState(3418);
				match(INPUT);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(3419);
				execute_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Percentile_contContext extends ParserRuleContext {
		public TerminalNode PERCENTILE_CONT() { return getToken(tsqlParser.PERCENTILE_CONT, 0); }
		public List<TerminalNode> LR_BRACKET() { return getTokens(tsqlParser.LR_BRACKET); }
		public TerminalNode LR_BRACKET(int i) {
			return getToken(tsqlParser.LR_BRACKET, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RR_BRACKET() { return getTokens(tsqlParser.RR_BRACKET); }
		public TerminalNode RR_BRACKET(int i) {
			return getToken(tsqlParser.RR_BRACKET, i);
		}
		public TerminalNode WITHIN() { return getToken(tsqlParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(tsqlParser.GROUP, 0); }
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public Percentile_contContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentile_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterPercentile_cont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitPercentile_cont(this);
		}
	}

	public final Percentile_contContext percentile_cont() throws RecognitionException {
		Percentile_contContext _localctx = new Percentile_contContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_percentile_cont);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3422);
			match(PERCENTILE_CONT);
			setState(3423);
			match(LR_BRACKET);
			setState(3424);
			expression(0);
			setState(3425);
			match(RR_BRACKET);
			setState(3426);
			match(WITHIN);
			setState(3427);
			match(GROUP);
			setState(3428);
			match(LR_BRACKET);
			setState(3429);
			order_by_clause();
			setState(3430);
			match(RR_BRACKET);
			setState(3431);
			over_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_aggContext extends ParserRuleContext {
		public TerminalNode STRING_AGG() { return getToken(tsqlParser.STRING_AGG, 0); }
		public List<TerminalNode> LR_BRACKET() { return getTokens(tsqlParser.LR_BRACKET); }
		public TerminalNode LR_BRACKET(int i) {
			return getToken(tsqlParser.LR_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(tsqlParser.COMMA, 0); }
		public List<TerminalNode> RR_BRACKET() { return getTokens(tsqlParser.RR_BRACKET); }
		public TerminalNode RR_BRACKET(int i) {
			return getToken(tsqlParser.RR_BRACKET, i);
		}
		public TerminalNode WITHIN() { return getToken(tsqlParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(tsqlParser.GROUP, 0); }
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public String_aggContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_agg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterString_agg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitString_agg(this);
		}
	}

	public final String_aggContext string_agg() throws RecognitionException {
		String_aggContext _localctx = new String_aggContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_string_agg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3433);
			match(STRING_AGG);
			setState(3434);
			match(LR_BRACKET);
			setState(3435);
			expression(0);
			setState(3436);
			match(COMMA);
			setState(3437);
			expression(0);
			setState(3438);
			match(RR_BRACKET);
			setState(3439);
			match(WITHIN);
			setState(3440);
			match(GROUP);
			setState(3441);
			match(LR_BRACKET);
			setState(3442);
			order_by_clause();
			setState(3443);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Data_typeContext extends ParserRuleContext {
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public TerminalNode LR_BRACKET() { return getToken(tsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(tsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public TerminalNode MAX() { return getToken(tsqlParser.MAX, 0); }
		public TerminalNode COMMA() { return getToken(tsqlParser.COMMA, 0); }
		public TerminalNode DATE() { return getToken(tsqlParser.DATE, 0); }
		public TerminalNode DATETIME2() { return getToken(tsqlParser.DATETIME2, 0); }
		public TerminalNode DOUBLE() { return getToken(tsqlParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(tsqlParser.PRECISION, 0); }
		public TerminalNode INT() { return getToken(tsqlParser.INT, 0); }
		public TerminalNode TINYINT() { return getToken(tsqlParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(tsqlParser.SMALLINT, 0); }
		public TerminalNode BIGINT() { return getToken(tsqlParser.BIGINT, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_data_type);
		int _la;
		try {
			setState(3471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,492,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3445);
				r_id();
				setState(3447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,488,_ctx) ) {
				case 1:
					{
					setState(3446);
					match(IDENTITY);
					}
					break;
				}
				setState(3456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,490,_ctx) ) {
				case 1:
					{
					setState(3449);
					match(LR_BRACKET);
					setState(3450);
					_la = _input.LA(1);
					if ( !(_la==MAX || _la==DECIMAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3453);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(3451);
						match(COMMA);
						setState(3452);
						match(DECIMAL);
						}
					}

					setState(3455);
					match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3458);
				match(DATE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3459);
				match(DATETIME2);
				setState(3460);
				match(LR_BRACKET);
				setState(3461);
				match(DECIMAL);
				setState(3462);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3463);
				match(DOUBLE);
				setState(3465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRECISION) {
					{
					setState(3464);
					match(PRECISION);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3467);
				match(INT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3468);
				match(TINYINT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3469);
				match(SMALLINT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3470);
				match(BIGINT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 83:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 90:
			return search_condition_sempred((Search_conditionContext)_localctx, predIndex);
		case 92:
			return query_expression_sempred((Query_expressionContext)_localctx, predIndex);
		case 111:
			return table_source_sempred((Table_sourceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean search_condition_sempred(Search_conditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean query_expression_sempred(Query_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean table_source_sempred(Table_sourceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 4);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u01d5\u0d92\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0001\u0000\u0005\u0000\u0170\b\u0000\n\u0000\f\u0000\u0173\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0179\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u017d\b\u0002\u0004\u0002\u017f\b"+
		"\u0002\u000b\u0002\f\u0002\u0180\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0187\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u018d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u019f\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u01a3"+
		"\b\u0006\u0001\u0006\u0003\u0006\u01a6\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u01aa\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01ae\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01b2\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u01b7\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u01bc\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u01c3\b\u0006\u0001\u0006\u0003\u0006\u01c6"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01ca\b\u0006\u0001\u0006"+
		"\u0003\u0006\u01cd\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u01d5\b\u0006\u0001\u0006\u0003\u0006"+
		"\u01d8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01dd\b"+
		"\u0006\u0001\u0006\u0003\u0006\u01e0\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u01e5\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u01ea\b\u0006\u0001\u0006\u0003\u0006\u01ed\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u01f2\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u01f8\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01ff\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0203\b\u0006\u0003\u0006\u0205\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u020a\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0215\b\u0006\n\u0006\f\u0006\u0218\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u021c\b\u0006\u0003\u0006\u021e\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0227\b\u0007\u0001\b\u0003\b\u022a\b\b"+
		"\u0001\b\u0001\b\u0003\b\u022e\b\b\u0001\b\u0003\b\u0231\b\b\u0001\b\u0001"+
		"\b\u0003\b\u0235\b\b\u0001\b\u0003\b\u0238\b\b\u0001\b\u0001\b\u0003\b"+
		"\u023c\b\b\u0001\b\u0003\b\u023f\b\b\u0001\b\u0003\b\u0242\b\b\u0001\b"+
		"\u0003\b\u0245\b\b\u0001\b\u0003\b\u0248\b\b\u0001\t\u0001\t\u0003\t\u024c"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0251\b\t\u0001\n\u0003\n\u0254\b"+
		"\n\u0001\n\u0001\n\u0003\n\u0258\b\n\u0001\n\u0003\n\u025b\b\n\u0001\n"+
		"\u0001\n\u0003\n\u025f\b\n\u0001\n\u0003\n\u0262\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0268\b\n\u0001\n\u0003\n\u026b\b\n\u0001\n\u0001\n"+
		"\u0003\n\u026f\b\n\u0001\n\u0003\n\u0272\b\n\u0001\n\u0003\n\u0275\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u027c\b\u000b\u0001\f\u0003\f\u027f\b\f\u0001\f\u0001\f\u0003\f\u0283"+
		"\b\f\u0001\f\u0003\f\u0286\b\f\u0001\f\u0003\f\u0289\b\f\u0001\f\u0003"+
		"\f\u028c\b\f\u0001\r\u0003\r\u028f\b\r\u0001\r\u0001\r\u0003\r\u0293\b"+
		"\r\u0001\r\u0001\r\u0003\r\u0297\b\r\u0001\r\u0003\r\u029a\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u02a0\b\r\n\r\f\r\u02a3\t\r\u0001\r\u0003"+
		"\r\u02a6\b\r\u0001\r\u0001\r\u0003\r\u02aa\b\r\u0001\r\u0003\r\u02ad\b"+
		"\r\u0001\r\u0003\r\u02b0\b\r\u0001\r\u0003\r\u02b3\b\r\u0001\r\u0003\r"+
		"\u02b6\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u02bd\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u02c1\b"+
		"\u000e\u0003\u000e\u02c3\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u02c9\b\u000f\n\u000f\f\u000f\u02cc\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u02d1\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u02d7\b\u000f\u0003\u000f\u02d9\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u02dd\b\u0010\u0001\u0010\u0003"+
		"\u0010\u02e0\b\u0010\u0001\u0010\u0003\u0010\u02e3\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u02e8\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u02ed\b\u0011\u0001\u0011\u0003\u0011\u02f0\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u02f8\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u02fc"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0301\b\u0012"+
		"\n\u0012\f\u0012\u0304\t\u0012\u0003\u0012\u0306\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u030d\b\u0012\n"+
		"\u0012\f\u0012\u0310\t\u0012\u0003\u0012\u0312\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0316\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u031c\b\u0012\n\u0012\f\u0012\u031f\t\u0012\u0003\u0012"+
		"\u0321\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0325\b\u0013\u0001"+
		"\u0013\u0003\u0013\u0328\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0331\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0335\b\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0339\b\u0013\u0001\u0013\u0003\u0013\u033c\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u034c\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0350\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0356\b\u0014\u0003\u0014\u0358\b\u0014\u0001\u0014\u0003\u0014\u035b"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0363\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0369\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u036e\b\u0015\u0001\u0015\u0003\u0015\u0371\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u037a\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0380\b\u0016\n\u0016\f\u0016\u0383\t\u0016\u0003\u0016\u0385"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u038c\b\u0016\u0001\u0016\u0003\u0016\u038f\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u03b4\b\u0018"+
		"\u0001\u0018\u0003\u0018\u03b7\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u03bd\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u03c9\b\u0019\u0003\u0019\u03cb\b\u0019\u0001"+
		"\u0019\u0003\u0019\u03ce\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u03e6\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u03f1\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u03f9\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0402"+
		"\b\u001c\n\u001c\f\u001c\u0405\t\u001c\u0005\u001c\u0407\b\u001c\n\u001c"+
		"\f\u001c\u040a\t\u001c\u0003\u001c\u040c\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0414\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u041e\b\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u0438\b&\u0001&\u0001&\u0001&\u0001&\u0003&\u043e\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0449"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0001)\u0003)\u0457\b)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u045f\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0466"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u047d\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u048a\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u0490\b/\u0001/\u0001/\u0001/\u0003/\u0495\b/\u0001/\u0003/\u0498"+
		"\b/\u00010\u00010\u00010\u00010\u00030\u049e\b0\u00010\u00010\u00030\u04a2"+
		"\b0\u00011\u00011\u00011\u00011\u00011\u00031\u04a9\b1\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00032\u04b2\b2\u00012\u00012\u00032\u04b6"+
		"\b2\u00013\u00013\u00013\u00013\u00033\u04bc\b3\u00013\u00013\u00013\u0005"+
		"3\u04c1\b3\n3\f3\u04c4\t3\u00013\u00033\u04c7\b3\u00014\u00014\u00014"+
		"\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00035\u04d4"+
		"\b5\u00015\u00015\u00016\u00016\u00036\u04da\b6\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00038\u04eb\b8\u00018\u00018\u00038\u04ef\b8\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00039\u04f7\b9\u00019\u00019\u00039\u04fb\b9\u0001"+
		"9\u00019\u00019\u00019\u00059\u0501\b9\n9\f9\u0504\t9\u00019\u00039\u0507"+
		"\b9\u00039\u0509\b9\u0001:\u0001:\u0003:\u050d\b:\u0001:\u0001:\u0003"+
		":\u0511\b:\u0001:\u0001:\u0003:\u0515\b:\u0001:\u0001:\u0003:\u0519\b"+
		":\u0001:\u0001:\u0001:\u0001:\u0003:\u051f\b:\u0001:\u0001:\u0003:\u0523"+
		"\b:\u0003:\u0525\b:\u0001;\u0001;\u0001;\u0003;\u052a\b;\u0001;\u0001"+
		";\u0001;\u0001;\u0005;\u0530\b;\n;\f;\u0533\t;\u0003;\u0535\b;\u0001;"+
		"\u0003;\u0538\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u053f\b;\n"+
		";\f;\u0542\t;\u0001;\u0001;\u0003;\u0546\b;\u0001;\u0001;\u0001;\u0003"+
		";\u054b\b;\u0001;\u0003;\u054e\b;\u0003;\u0550\b;\u0001<\u0001<\u0003"+
		"<\u0554\b<\u0001<\u0001<\u0003<\u0558\b<\u0001<\u0003<\u055b\b<\u0001"+
		"<\u0001<\u0003<\u055f\b<\u0001=\u0001=\u0001>\u0001>\u0003>\u0565\b>\u0001"+
		">\u0001>\u0001>\u0003>\u056a\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003"+
		">\u0571\b>\u0003>\u0573\b>\u0001>\u0001>\u0003>\u0577\b>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u057e\b>\u0001>\u0001>\u0003>\u0582\b>\u0001"+
		">\u0003>\u0585\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003"+
		">\u058e\b>\u0001>\u0003>\u0591\b>\u0003>\u0593\b>\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0003?\u059c\b?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u05a7\b?\u0001?\u0001?\u0003"+
		"?\u05ab\b?\u0003?\u05ad\b?\u0003?\u05af\b?\u0001@\u0001@\u0001@\u0001"+
		"@\u0003@\u05b5\b@\u0001@\u0001@\u0001@\u0003@\u05ba\b@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0003@\u05c1\b@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u05ce\b@\u0003@\u05d0\b@\u0003"+
		"@\u05d2\b@\u0001@\u0003@\u05d5\b@\u0001@\u0003@\u05d8\b@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u05df\bA\u0001A\u0003A\u05e2\bA\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u05e8\bA\u0001A\u0001A\u0001A\u0003A\u05ed\bA\u0003"+
		"A\u05ef\bA\u0001A\u0003A\u05f2\bA\u0001A\u0001A\u0001A\u0001A\u0003A\u05f8"+
		"\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0600\bA\u0003A\u0602"+
		"\bA\u0001A\u0003A\u0605\bA\u0001A\u0001A\u0003A\u0609\bA\u0001A\u0003"+
		"A\u060c\bA\u0001A\u0001A\u0001A\u0001A\u0003A\u0612\bA\u0001A\u0003A\u0615"+
		"\bA\u0001A\u0001A\u0003A\u0619\bA\u0001A\u0003A\u061c\bA\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u0622\bA\u0001A\u0003A\u0625\bA\u0003A\u0627\b"+
		"A\u0001B\u0001B\u0003B\u062b\bB\u0001C\u0001C\u0001C\u0003C\u0630\bC\u0001"+
		"D\u0001D\u0001D\u0001D\u0001E\u0001E\u0003E\u0638\bE\u0001E\u0001E\u0001"+
		"E\u0003E\u063d\bE\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0003"+
		"G\u0646\bG\u0001G\u0005G\u0649\bG\nG\fG\u064c\tG\u0001H\u0001H\u0003H"+
		"\u0650\bH\u0001I\u0001I\u0001I\u0001I\u0003I\u0656\bI\u0001I\u0001I\u0003"+
		"I\u065a\bI\u0001I\u0003I\u065d\bI\u0001I\u0001I\u0003I\u0661\bI\u0001"+
		"I\u0001I\u0001I\u0001I\u0003I\u0667\bI\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0003I\u066f\bI\u0001I\u0001I\u0001I\u0003I\u0674\bI\u0003I\u0676"+
		"\bI\u0001I\u0003I\u0679\bI\u0001I\u0005I\u067c\bI\nI\fI\u067f\tI\u0001"+
		"J\u0001J\u0003J\u0683\bJ\u0001J\u0003J\u0686\bJ\u0001J\u0001J\u0001J\u0003"+
		"J\u068b\bJ\u0001J\u0003J\u068e\bJ\u0001J\u0003J\u0691\bJ\u0001J\u0001"+
		"J\u0001J\u0001J\u0003J\u0697\bJ\u0001J\u0001J\u0001J\u0001J\u0003J\u069d"+
		"\bJ\u0001K\u0001K\u0003K\u06a1\bK\u0001K\u0001K\u0001K\u0003K\u06a6\b"+
		"K\u0001K\u0003K\u06a9\bK\u0001K\u0001K\u0001K\u0003K\u06ae\bK\u0001K\u0001"+
		"K\u0003K\u06b2\bK\u0001K\u0001K\u0003K\u06b6\bK\u0001K\u0001K\u0001K\u0001"+
		"K\u0003K\u06bc\bK\u0001K\u0001K\u0001K\u0001K\u0003K\u06c2\bK\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0005L\u06c9\bL\nL\fL\u06cc\tL\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0003M\u06d5\bM\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0003N\u06df\bN\u0003N\u06e1\bN\u0003N\u06e3"+
		"\bN\u0001N\u0003N\u06e6\bN\u0001N\u0003N\u06e9\bN\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u06f4\bN\u0003N\u06f6"+
		"\bN\u0003N\u06f8\bN\u0001N\u0003N\u06fb\bN\u0001O\u0003O\u06fe\bO\u0001"+
		"O\u0003O\u0701\bO\u0001O\u0003O\u0704\bO\u0001O\u0003O\u0707\bO\u0001"+
		"O\u0003O\u070a\bO\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0003P\u0716\bP\u0001P\u0003P\u0719\bP\u0001P\u0003P\u071c"+
		"\bP\u0001P\u0001P\u0001P\u0001P\u0001P\u0005P\u0723\bP\nP\fP\u0726\tP"+
		"\u0003P\u0728\bP\u0001P\u0003P\u072b\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0003Q\u0732\bQ\u0001Q\u0003Q\u0735\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0743\bQ\u0001"+
		"Q\u0003Q\u0746\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u074d\bQ\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0003Q\u075c\bQ\u0001R\u0001R\u0003R\u0760\bR\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0004S\u076b\bS\u000b"+
		"S\fS\u076c\u0001S\u0001S\u0003S\u0771\bS\u0001S\u0001S\u0001S\u0001S\u0004"+
		"S\u0777\bS\u000bS\fS\u0778\u0001S\u0001S\u0003S\u077d\bS\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0791\bS\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0005S\u07a5\bS\nS\fS\u07a8"+
		"\tS\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0003T\u07b2"+
		"\bT\u0001U\u0001U\u0001V\u0001V\u0001V\u0003V\u07b9\bV\u0001V\u0001V\u0001"+
		"V\u0005V\u07be\bV\nV\fV\u07c1\tV\u0001W\u0001W\u0001W\u0001W\u0001W\u0003"+
		"W\u07c8\bW\u0001W\u0001W\u0001W\u0001W\u0001W\u0001X\u0001X\u0003X\u07d1"+
		"\bX\u0001X\u0001X\u0003X\u07d5\bX\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0003X\u07df\bX\u0001Y\u0001Y\u0001Y\u0005Y\u07e4\bY\n"+
		"Y\fY\u07e7\tY\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z"+
		"\u0001Z\u0005Z\u07f2\bZ\nZ\fZ\u07f5\tZ\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0003[\u080b\b[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0003[\u0814\b[\u0001[\u0001[\u0001[\u0001"+
		"[\u0003[\u081a\b[\u0001[\u0001[\u0001[\u0001[\u0003[\u0820\b[\u0001[\u0001"+
		"[\u0001[\u0001[\u0003[\u0826\b[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0003[\u0831\b[\u0001\\\u0001\\\u0001\\\u0001\\"+
		"\u0001\\\u0001\\\u0003\\\u0839\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0005"+
		"\\\u083f\b\\\n\\\f\\\u0842\t\\\u0001]\u0001]\u0003]\u0846\b]\u0001]\u0001"+
		"]\u0003]\u084a\b]\u0001^\u0001^\u0003^\u084e\b^\u0001^\u0003^\u0851\b"+
		"^\u0001^\u0001^\u0001^\u0003^\u0856\b^\u0001^\u0001^\u0003^\u085a\b^\u0001"+
		"^\u0001^\u0003^\u085e\b^\u0001^\u0001^\u0001^\u0001^\u0001^\u0005^\u0865"+
		"\b^\n^\f^\u0868\t^\u0003^\u086a\b^\u0001^\u0003^\u086d\b^\u0001^\u0001"+
		"^\u0003^\u0871\b^\u0001^\u0001^\u0003^\u0875\b^\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0005_\u087f\b_\n_\f_\u0882\t_\u0001_\u0001"+
		"_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0005`\u088d\b`\n`"+
		"\f`\u0890\t`\u0001`\u0001`\u0003`\u0894\b`\u0001a\u0001a\u0001a\u0003"+
		"a\u0899\ba\u0001a\u0001a\u0003a\u089d\ba\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0003b\u08a4\bb\u0001c\u0001c\u0001c\u0001c\u0001c\u0005c\u08ab\bc\n"+
		"c\fc\u08ae\tc\u0001c\u0001c\u0001c\u0001c\u0003c\u08b4\bc\u0003c\u08b6"+
		"\bc\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0003e\u08c4\be\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0003e\u08cc\be\u0001e\u0003e\u08cf\be\u0003e\u08d1\be\u0001f\u0001"+
		"f\u0001f\u0001f\u0001f\u0003f\u08d8\bf\u0001g\u0001g\u0003g\u08dc\bg\u0001"+
		"h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001i\u0005i\u08e5\bi\ni\fi\u08e8"+
		"\ti\u0001i\u0001i\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0005"+
		"j\u0907\bj\nj\fj\u090a\tj\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0003j\u0919\bj\u0001k\u0001"+
		"k\u0001k\u0001k\u0003k\u091f\bk\u0001l\u0001l\u0001l\u0005l\u0924\bl\n"+
		"l\fl\u0927\tl\u0001m\u0001m\u0001m\u0003m\u092c\bm\u0001m\u0001m\u0001"+
		"m\u0003m\u0931\bm\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0003m\u0939"+
		"\bm\u0001m\u0003m\u093c\bm\u0003m\u093e\bm\u0001n\u0001n\u0001n\u0005"+
		"n\u0943\bn\nn\fn\u0946\tn\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0003"+
		"o\u094e\bo\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001"+
		"o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0005o\u095f\bo\no\fo\u0962"+
		"\to\u0001p\u0001p\u0003p\u0966\bp\u0001p\u0003p\u0969\bp\u0001p\u0003"+
		"p\u096c\bp\u0001p\u0001p\u0003p\u0970\bp\u0001p\u0001p\u0001p\u0003p\u0975"+
		"\bp\u0003p\u0977\bp\u0001p\u0001p\u0003p\u097b\bp\u0001p\u0001p\u0003"+
		"p\u097f\bp\u0001p\u0001p\u0003p\u0983\bp\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0003p\u098a\bp\u0003p\u098c\bp\u0003p\u098e\bp\u0001q\u0001q\u0003"+
		"q\u0992\bq\u0001q\u0001q\u0001q\u0003q\u0997\bq\u0001q\u0001q\u0001q\u0003"+
		"q\u099c\bq\u0001r\u0001r\u0001s\u0001s\u0001t\u0003t\u09a3\bt\u0001t\u0001"+
		"t\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001v\u0003"+
		"v\u09b0\bv\u0001v\u0001v\u0003v\u09b4\bv\u0003v\u09b6\bv\u0001v\u0003"+
		"v\u09b9\bv\u0001w\u0001w\u0003w\u09bd\bw\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0005x\u09cf\bx\nx\fx\u09d2\tx\u0001x\u0003x\u09d5\bx\u0001x"+
		"\u0001x\u0003x\u09d9\bx\u0001y\u0001y\u0001y\u0001y\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0003z\u09e4\bz\u0001{\u0001{\u0001{\u0001{\u0001{\u0003"+
		"{\u09eb\b{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0003{\u0a02\b{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0003{\u0a4d\b{\u0001"+
		"{\u0001{\u0003{\u0a51\b{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0003"+
		"{\u0a6d\b{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0003{\u0a8f\b{\u0001{\u0001{\u0003{\u0a93\b{\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001}\u0001}\u0001}\u0001}\u0001}\u0001"+
		"~\u0003~\u0aa0\b~\u0001~\u0001~\u0001~\u0001~\u0005~\u0aa6\b~\n~\f~\u0aa9"+
		"\t~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001"+
		"\u007f\u0005\u007f\u0ab2\b\u007f\n\u007f\f\u007f\u0ab5\t\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u0080\u0003\u0080\u0aba\b\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u0ac1\b\u0080\n\u0080"+
		"\f\u0080\u0ac4\t\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0005\u0080\u0ad2\b\u0080\n\u0080\f\u0080\u0ad5"+
		"\t\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0003\u0080\u0ada\b\u0080"+
		"\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0003\u0080\u0ae2\b\u0080\u0001\u0081\u0001\u0081\u0003\u0081\u0ae6\b"+
		"\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u0aec"+
		"\b\u0082\n\u0082\f\u0082\u0aef\t\u0082\u0001\u0082\u0001\u0082\u0001\u0083"+
		"\u0001\u0083\u0003\u0083\u0af5\b\u0083\u0001\u0084\u0001\u0084\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0005\u0085\u0afd\b\u0085\n\u0085"+
		"\f\u0085\u0b00\t\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0005\u0086"+
		"\u0b05\b\u0086\n\u0086\f\u0086\u0b08\t\u0086\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001"+
		"\u008a\u0005\u008a\u0b25\b\u008a\n\u008a\f\u008a\u0b28\t\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0003\u008a\u0b2d\b\u008a\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0003\u008b\u0b32\b\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0003\u008b\u0b37\b\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0003\u008b\u0b3d\b\u008b\u0001\u008b\u0003\u008b\u0b40\b\u008b\u0001"+
		"\u008b\u0001\u008b\u0003\u008b\u0b44\b\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0003\u008b\u0b49\b\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u0b58\b\u008b\u0001"+
		"\u008c\u0001\u008c\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0003\u008d\u0b61\b\u008d\u0001\u008d\u0003\u008d\u0b64\b\u008d"+
		"\u0001\u008d\u0003\u008d\u0b67\b\u008d\u0001\u008d\u0001\u008d\u0001\u008e"+
		"\u0001\u008e\u0001\u008e\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0003\u008f\u0b74\b\u008f\u0001\u0090\u0001\u0090"+
		"\u0003\u0090\u0b78\b\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091"+
		"\u0001\u0091\u0001\u0091\u0003\u0091\u0b80\b\u0091\u0001\u0092\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0003\u0092\u0b86\b\u0092\u0001\u0093\u0001\u0093"+
		"\u0001\u0093\u0001\u0093\u0005\u0093\u0b8c\b\u0093\n\u0093\f\u0093\u0b8f"+
		"\t\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u0b95"+
		"\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u0b9b"+
		"\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001"+
		"\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001"+
		"\u0093\u0001\u0093\u0003\u0093\u0baa\b\u0093\u0001\u0094\u0001\u0094\u0001"+
		"\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0003\u0094\u0bb3"+
		"\b\u0094\u0001\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0003\u0095\u0bb9"+
		"\b\u0095\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0003\u0096\u0bbf"+
		"\b\u0096\u0001\u0096\u0003\u0096\u0bc2\b\u0096\u0001\u0096\u0001\u0096"+
		"\u0003\u0096\u0bc6\b\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0005\u0096"+
		"\u0bcb\b\u0096\n\u0096\f\u0096\u0bce\t\u0096\u0001\u0097\u0001\u0097\u0001"+
		"\u0097\u0001\u0097\u0001\u0097\u0003\u0097\u0bd5\b\u0097\u0001\u0097\u0003"+
		"\u0097\u0bd8\b\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0003"+
		"\u0097\u0bde\b\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0003"+
		"\u0097\u0be4\b\u0097\u0003\u0097\u0be6\b\u0097\u0001\u0097\u0001\u0097"+
		"\u0001\u0097\u0001\u0097\u0003\u0097\u0bec\b\u0097\u0001\u0097\u0003\u0097"+
		"\u0bef\b\u0097\u0003\u0097\u0bf1\b\u0097\u0001\u0097\u0001\u0097\u0001"+
		"\u0097\u0001\u0097\u0003\u0097\u0bf7\b\u0097\u0003\u0097\u0bf9\b\u0097"+
		"\u0001\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0003\u0098\u0c07\b\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0001\u0098\u0003\u0098\u0c0e\b\u0098\u0001\u0098\u0001\u0098\u0001\u0099"+
		"\u0001\u0099\u0001\u0099\u0003\u0099\u0c15\b\u0099\u0001\u0099\u0001\u0099"+
		"\u0001\u0099\u0001\u0099\u0001\u0099\u0003\u0099\u0c1c\b\u0099\u0001\u0099"+
		"\u0001\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a\u0c23\b\u009a"+
		"\u0001\u009a\u0001\u009a\u0001\u009b\u0001\u009b\u0001\u009b\u0003\u009b"+
		"\u0c2a\b\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0003\u009b\u0c31\b\u009b\u0001\u009b\u0001\u009b\u0001\u009c\u0001\u009c"+
		"\u0003\u009c\u0c37\b\u009c\u0001\u009d\u0001\u009d\u0001\u009d\u0003\u009d"+
		"\u0c3c\b\u009d\u0001\u009d\u0001\u009d\u0001\u009e\u0001\u009e\u0001\u009e"+
		"\u0005\u009e\u0c43\b\u009e\n\u009e\f\u009e\u0c46\t\u009e\u0001\u009f\u0001"+
		"\u009f\u0003\u009f\u0c4a\b\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001"+
		"\u00a1\u0001\u00a2\u0003\u00a2\u0c51\b\u00a2\u0001\u00a2\u0001\u00a2\u0001"+
		"\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0003\u00a3\u0c5a"+
		"\b\u00a3\u0001\u00a4\u0001\u00a4\u0003\u00a4\u0c5e\b\u00a4\u0001\u00a5"+
		"\u0001\u00a5\u0001\u00a5\u0003\u00a5\u0c63\b\u00a5\u0001\u00a5\u0001\u00a5"+
		"\u0003\u00a5\u0c67\b\u00a5\u0001\u00a5\u0001\u00a5\u0003\u00a5\u0c6b\b"+
		"\u00a5\u0001\u00a5\u0001\u00a5\u0003\u00a5\u0c6f\b\u00a5\u0001\u00a6\u0001"+
		"\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0003\u00a7\u0c76\b\u00a7\u0001"+
		"\u00a8\u0001\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001"+
		"\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001"+
		"\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0003\u00a9\u0c89"+
		"\b\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00ab\u0001\u00ab\u0003\u00ab\u0c8f"+
		"\b\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0003\u00ac\u0c94\b\u00ac"+
		"\u0001\u00ac\u0003\u00ac\u0c97\b\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac"+
		"\u0001\u00ac\u0003\u00ac\u0c9d\b\u00ac\u0001\u00ac\u0003\u00ac\u0ca0\b"+
		"\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0005\u00ac\u0ca5\b\u00ac\n"+
		"\u00ac\f\u00ac\u0ca8\t\u00ac\u0001\u00ac\u0003\u00ac\u0cab\b\u00ac\u0003"+
		"\u00ac\u0cad\b\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0005"+
		"\u00ac\u0cb3\b\u00ac\n\u00ac\f\u00ac\u0cb6\t\u00ac\u0003\u00ac\u0cb8\b"+
		"\u00ac\u0001\u00ac\u0001\u00ac\u0003\u00ac\u0cbc\b\u00ac\u0001\u00ac\u0001"+
		"\u00ac\u0001\u00ac\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u0cc4"+
		"\b\u00ad\u0001\u00ad\u0003\u00ad\u0cc7\b\u00ad\u0001\u00ad\u0001\u00ad"+
		"\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0005\u00ad\u0ccf\b\u00ad"+
		"\n\u00ad\f\u00ad\u0cd2\t\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001"+
		"\u00ad\u0003\u00ad\u0cd8\b\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003"+
		"\u00ad\u0cdd\b\u00ad\u0001\u00ad\u0003\u00ad\u0ce0\b\u00ad\u0001\u00ae"+
		"\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0005\u00ae"+
		"\u0ce8\b\u00ae\n\u00ae\f\u00ae\u0ceb\t\u00ae\u0003\u00ae\u0ced\b\u00ae"+
		"\u0001\u00ae\u0003\u00ae\u0cf0\b\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae"+
		"\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0003\u00ae\u0cf8\b\u00ae\u0001\u00af"+
		"\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af"+
		"\u0005\u00af\u0d01\b\u00af\n\u00af\f\u00af\u0d04\t\u00af\u0003\u00af\u0d06"+
		"\b\u00af\u0001\u00af\u0003\u00af\u0d09\b\u00af\u0001\u00af\u0001\u00af"+
		"\u0005\u00af\u0d0d\b\u00af\n\u00af\f\u00af\u0d10\t\u00af\u0001\u00af\u0001"+
		"\u00af\u0003\u00af\u0d14\b\u00af\u0001\u00af\u0001\u00af\u0003\u00af\u0d18"+
		"\b\u00af\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001"+
		"\u00b0\u0005\u00b0\u0d20\b\u00b0\n\u00b0\f\u00b0\u0d23\t\u00b0\u0003\u00b0"+
		"\u0d25\b\u00b0\u0001\u00b0\u0003\u00b0\u0d28\b\u00b0\u0001\u00b0\u0001"+
		"\u00b0\u0005\u00b0\u0d2c\b\u00b0\n\u00b0\f\u00b0\u0d2f\t\u00b0\u0001\u00b0"+
		"\u0001\u00b0\u0001\u00b0\u0003\u00b0\u0d34\b\u00b0\u0001\u00b0\u0001\u00b0"+
		"\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0003\u00b1\u0d3c\b\u00b1"+
		"\u0001\u00b1\u0003\u00b1\u0d3f\b\u00b1\u0001\u00b1\u0001\u00b1\u0003\u00b1"+
		"\u0d43\b\u00b1\u0001\u00b1\u0001\u00b1\u0003\u00b1\u0d47\b\u00b1\u0001"+
		"\u00b1\u0003\u00b1\u0d4a\b\u00b1\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0003"+
		"\u00b2\u0d4f\b\u00b2\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0003\u00b3\u0d5d\b\u00b3\u0001\u00b4\u0001\u00b4\u0001"+
		"\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001"+
		"\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001"+
		"\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001"+
		"\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b6\u0001\u00b6\u0003\u00b6\u0d78"+
		"\b\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0003\u00b6\u0d7e"+
		"\b\u00b6\u0001\u00b6\u0003\u00b6\u0d81\b\u00b6\u0001\u00b6\u0001\u00b6"+
		"\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0003\u00b6"+
		"\u0d8a\b\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0003\u00b6"+
		"\u0d90\b\u00b6\u0001\u00b6\u0000\u0004\u00a6\u00b4\u00b8\u00de\u00b7\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u0000?\u0001\u0000\u01b0"+
		"\u01b1\u0002\u0000\u01b0\u01b0\u01b3\u01b3\u0002\u0000\u00ff\u00ff\u0194"+
		"\u0194\u0002\u0000\u01b0\u01b1\u01b3\u01b3\u0002\u0000mm\u0080\u0080\u0002"+
		"\u0000\b\b44\u0002\u0000\u0081\u0081\u0176\u0176\u0003\u0000\u010a\u010a"+
		"\u0179\u0179\u01a5\u01a5\u0003\u0000\u00aa\u00aa\u00d5\u00d5\u0104\u0104"+
		"\u0002\u0000ssuu\u0003\u0000\u00fb\u00fb\u0121\u0121\u0141\u0141\u0002"+
		"\u0000\u011a\u011a\u0135\u0135\u0003\u0000\u0108\u0108\u0151\u0151\u0153"+
		"\u0153\u0001\u0000\u0168\u0169\u0003\u0000\u0145\u0145\u0170\u0170\u0182"+
		"\u0182\u0003\u0000\u00cc\u00cc\u0105\u0105\u0116\u0116\u0002\u0000\u0116"+
		"\u0116\u0181\u0181\u0003\u0000NN\u00e0\u00e0\u0181\u0181\u0003\u0000m"+
		"m\u00e6\u00e6\u0196\u0196\u0002\u0000\u0141\u0141\u017c\u017c\u0002\u0000"+
		"\u00be\u00be\u0137\u0137\u0001\u0000\u0157\u0158\u0002\u0000\u00aa\u00aa"+
		"\u00c2\u00c2\u0001\u0000\u00b0\u00b1\u0004\u0000\u00e1\u00e1\u0159\u0159"+
		"\u017d\u017d\u01b3\u01b3\u0002\u0000\u0117\u0117\u017a\u017a\u0004\u0000"+
		"\u0107\u0107\u010e\u010e\u012f\u012f\u0187\u0187\u0003\u0000\u0155\u0155"+
		"\u0168\u0168\u017b\u017b\u0002\u0000\u00ca\u00ca\u016d\u016d\u0002\u0000"+
		"\u012b\u012b\u0194\u0194\u0001\u0000\u01d0\u01d1\u0001\u0000\u01cd\u01cf"+
		"\u0002\u0000\u01d0\u01d1\u01d3\u01d5\u0003\u0000\u0003\u0003\u0006\u0006"+
		"\u00a6\u00a6\u0002\u0000\u0003\u000366\u0002\u0000\u00f0\u00f0\u0172\u0172"+
		"\u0002\u0000\u0174\u0174\u0176\u0176\u0002\u0000jj\u0112\u0112\u0002\u0000"+
		"}}\u011f\u011f\u0003\u0000hh\u00ea\u00ea\u011f\u011f\u0003\u0000hh\u011f"+
		"\u011f\u0138\u0138\u0002\u0000TT\u0175\u0175\u0002\u0000&&~~\u0002\u0000"+
		"oo\u01b0\u01b1\u0003\u0000NNcc\u0096\u0096\u0004\u0000hh\u011f\u011f\u0138"+
		"\u0138\u016e\u016e\u0002\u0000\u01b1\u01b1\u01b3\u01b3\u0003\u0000\u0102"+
		"\u0102\u0165\u0165\u0177\u0177\u0003\u0000\u0113\u0113\u0132\u0132\u014e"+
		"\u014e\u0002\u0000\u0130\u0130\u0133\u0133\u0006\u0000\u00dc\u00dc\u013a"+
		"\u013a\u0140\u0140\u0189\u018a\u018d\u018d\u01a2\u01a3\u0001\u0000\u00ee"+
		"\u00ef\u0002\u0000\u0164\u0164\u0176\u0176\u0003\u0000NNss\u0168\u0168"+
		"\u0002\u0000\u0019\u0019ll\u0001\u0000\u01b5\u01b6\u0002\u0000\u01b1\u01b1"+
		"\u01b5\u01b54\u0000IIjjqq\u00c0\u00c0\u00ca\u00ca\u00d2\u00d2\u00d5\u00d5"+
		"\u00dc\u00dd\u00e1\u00e3\u00e7\u00e8\u00ea\u00ea\u00ec\u00ef\u00f3\u00f3"+
		"\u00ff\u00ff\u0101\u0102\u0104\u0104\u0107\u0107\u010a\u010a\u010c\u010e"+
		"\u0112\u0118\u011a\u011d\u011f\u011f\u0122\u0122\u0124\u0124\u0127\u012b"+
		"\u012d\u013c\u0140\u0140\u0144\u0144\u0146\u0146\u0149\u014a\u014c\u014c"+
		"\u014e\u014f\u0152\u0159\u015b\u015b\u015d\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u0168\u016a\u016a\u016d\u016f\u0171\u0171\u0173\u017b\u017d\u017e"+
		"\u0181\u0181\u0183\u0183\u0185\u018a\u018d\u018d\u0191\u0194\u0199\u0199"+
		"\u019b\u019f\u01a1\u01a9\u01b2\u01b2\u0001\u0000\u01bb\u01c2\u0005\u0000"+
		"\u0119\u0119\u012c\u012c\u013e\u013e\u0190\u0190\u01cf\u01cf\u0001\u0000"+
		"\u0087\u0088\u0002\u0000\u0157\u0158\u0166\u0166\u0002\u0000\u013a\u013a"+
		"\u01b1\u01b1\u0fc4\u0000\u0171\u0001\u0000\u0000\u0000\u0002\u0176\u0001"+
		"\u0000\u0000\u0000\u0004\u017e\u0001\u0000\u0000\u0000\u0006\u0186\u0001"+
		"\u0000\u0000\u0000\b\u018c\u0001\u0000\u0000\u0000\n\u019e\u0001\u0000"+
		"\u0000\u0000\f\u021d\u0001\u0000\u0000\u0000\u000e\u0226\u0001\u0000\u0000"+
		"\u0000\u0010\u0229\u0001\u0000\u0000\u0000\u0012\u0250\u0001\u0000\u0000"+
		"\u0000\u0014\u0253\u0001\u0000\u0000\u0000\u0016\u027b\u0001\u0000\u0000"+
		"\u0000\u0018\u027e\u0001\u0000\u0000\u0000\u001a\u028e\u0001\u0000\u0000"+
		"\u0000\u001c\u02b7\u0001\u0000\u0000\u0000\u001e\u02c4\u0001\u0000\u0000"+
		"\u0000 \u02dc\u0001\u0000\u0000\u0000\"\u02ef\u0001\u0000\u0000\u0000"+
		"$\u02f1\u0001\u0000\u0000\u0000&\u0322\u0001\u0000\u0000\u0000(\u033d"+
		"\u0001\u0000\u0000\u0000*\u035c\u0001\u0000\u0000\u0000,\u0372\u0001\u0000"+
		"\u0000\u0000.\u0390\u0001\u0000\u0000\u00000\u0392\u0001\u0000\u0000\u0000"+
		"2\u03b8\u0001\u0000\u0000\u00004\u03e5\u0001\u0000\u0000\u00006\u03f8"+
		"\u0001\u0000\u0000\u00008\u03fa\u0001\u0000\u0000\u0000:\u0413\u0001\u0000"+
		"\u0000\u0000<\u0415\u0001\u0000\u0000\u0000>\u041d\u0001\u0000\u0000\u0000"+
		"@\u041f\u0001\u0000\u0000\u0000B\u0422\u0001\u0000\u0000\u0000D\u0425"+
		"\u0001\u0000\u0000\u0000F\u0427\u0001\u0000\u0000\u0000H\u0429\u0001\u0000"+
		"\u0000\u0000J\u042b\u0001\u0000\u0000\u0000L\u0448\u0001\u0000\u0000\u0000"+
		"N\u044a\u0001\u0000\u0000\u0000P\u044d\u0001\u0000\u0000\u0000R\u0456"+
		"\u0001\u0000\u0000\u0000T\u045e\u0001\u0000\u0000\u0000V\u0465\u0001\u0000"+
		"\u0000\u0000X\u047c\u0001\u0000\u0000\u0000Z\u047e\u0001\u0000\u0000\u0000"+
		"\\\u0489\u0001\u0000\u0000\u0000^\u048b\u0001\u0000\u0000\u0000`\u0499"+
		"\u0001\u0000\u0000\u0000b\u04a3\u0001\u0000\u0000\u0000d\u04ad\u0001\u0000"+
		"\u0000\u0000f\u04b7\u0001\u0000\u0000\u0000h\u04c8\u0001\u0000\u0000\u0000"+
		"j\u04cf\u0001\u0000\u0000\u0000l\u04d9\u0001\u0000\u0000\u0000n\u04db"+
		"\u0001\u0000\u0000\u0000p\u04e2\u0001\u0000\u0000\u0000r\u0508\u0001\u0000"+
		"\u0000\u0000t\u0524\u0001\u0000\u0000\u0000v\u054f\u0001\u0000\u0000\u0000"+
		"x\u0553\u0001\u0000\u0000\u0000z\u0560\u0001\u0000\u0000\u0000|\u0592"+
		"\u0001\u0000\u0000\u0000~\u05ae\u0001\u0000\u0000\u0000\u0080\u05d7\u0001"+
		"\u0000\u0000\u0000\u0082\u0626\u0001\u0000\u0000\u0000\u0084\u0628\u0001"+
		"\u0000\u0000\u0000\u0086\u062c\u0001\u0000\u0000\u0000\u0088\u0631\u0001"+
		"\u0000\u0000\u0000\u008a\u0635\u0001\u0000\u0000\u0000\u008c\u063e\u0001"+
		"\u0000\u0000\u0000\u008e\u0643\u0001\u0000\u0000\u0000\u0090\u064f\u0001"+
		"\u0000\u0000\u0000\u0092\u0651\u0001\u0000\u0000\u0000\u0094\u0682\u0001"+
		"\u0000\u0000\u0000\u0096\u06a0\u0001\u0000\u0000\u0000\u0098\u06c3\u0001"+
		"\u0000\u0000\u0000\u009a\u06cf\u0001\u0000\u0000\u0000\u009c\u06d6\u0001"+
		"\u0000\u0000\u0000\u009e\u06fd\u0001\u0000\u0000\u0000\u00a0\u070e\u0001"+
		"\u0000\u0000\u0000\u00a2\u075b\u0001\u0000\u0000\u0000\u00a4\u075f\u0001"+
		"\u0000\u0000\u0000\u00a6\u0790\u0001\u0000\u0000\u0000\u00a8\u07b1\u0001"+
		"\u0000\u0000\u0000\u00aa\u07b3\u0001\u0000\u0000\u0000\u00ac\u07b5\u0001"+
		"\u0000\u0000\u0000\u00ae\u07c2\u0001\u0000\u0000\u0000\u00b0\u07de\u0001"+
		"\u0000\u0000\u0000\u00b2\u07e0\u0001\u0000\u0000\u0000\u00b4\u07e8\u0001"+
		"\u0000\u0000\u0000\u00b6\u0830\u0001\u0000\u0000\u0000\u00b8\u0838\u0001"+
		"\u0000\u0000\u0000\u00ba\u0849\u0001\u0000\u0000\u0000\u00bc\u084b\u0001"+
		"\u0000\u0000\u0000\u00be\u0876\u0001\u0000\u0000\u0000\u00c0\u0893\u0001"+
		"\u0000\u0000\u0000\u00c2\u0895\u0001\u0000\u0000\u0000\u00c4\u089e\u0001"+
		"\u0000\u0000\u0000\u00c6\u08a5\u0001\u0000\u0000\u0000\u00c8\u08b7\u0001"+
		"\u0000\u0000\u0000\u00ca\u08d0\u0001\u0000\u0000\u0000\u00cc\u08d2\u0001"+
		"\u0000\u0000\u0000\u00ce\u08d9\u0001\u0000\u0000\u0000\u00d0\u08dd\u0001"+
		"\u0000\u0000\u0000\u00d2\u08df\u0001\u0000\u0000\u0000\u00d4\u0918\u0001"+
		"\u0000\u0000\u0000\u00d6\u091a\u0001\u0000\u0000\u0000\u00d8\u0920\u0001"+
		"\u0000\u0000\u0000\u00da\u093d\u0001\u0000\u0000\u0000\u00dc\u093f\u0001"+
		"\u0000\u0000\u0000\u00de\u094d\u0001\u0000\u0000\u0000\u00e0\u098d\u0001"+
		"\u0000\u0000\u0000\u00e2\u098f\u0001\u0000\u0000\u0000\u00e4\u099d\u0001"+
		"\u0000\u0000\u0000\u00e6\u099f\u0001\u0000\u0000\u0000\u00e8\u09a2\u0001"+
		"\u0000\u0000\u0000\u00ea\u09a6\u0001\u0000\u0000\u0000\u00ec\u09b5\u0001"+
		"\u0000\u0000\u0000\u00ee\u09ba\u0001\u0000\u0000\u0000\u00f0\u09d8\u0001"+
		"\u0000\u0000\u0000\u00f2\u09da\u0001\u0000\u0000\u0000\u00f4\u09e3\u0001"+
		"\u0000\u0000\u0000\u00f6\u0a92\u0001\u0000\u0000\u0000\u00f8\u0a94\u0001"+
		"\u0000\u0000\u0000\u00fa\u0a99\u0001\u0000\u0000\u0000\u00fc\u0a9f\u0001"+
		"\u0000\u0000\u0000\u00fe\u0aac\u0001\u0000\u0000\u0000\u0100\u0ab9\u0001"+
		"\u0000\u0000\u0000\u0102\u0ae5\u0001\u0000\u0000\u0000\u0104\u0ae7\u0001"+
		"\u0000\u0000\u0000\u0106\u0af4\u0001\u0000\u0000\u0000\u0108\u0af6\u0001"+
		"\u0000\u0000\u0000\u010a\u0af8\u0001\u0000\u0000\u0000\u010c\u0b01\u0001"+
		"\u0000\u0000\u0000\u010e\u0b09\u0001\u0000\u0000\u0000\u0110\u0b0d\u0001"+
		"\u0000\u0000\u0000\u0112\u0b11\u0001\u0000\u0000\u0000\u0114\u0b2c\u0001"+
		"\u0000\u0000\u0000\u0116\u0b57\u0001\u0000\u0000\u0000\u0118\u0b59\u0001"+
		"\u0000\u0000\u0000\u011a\u0b5b\u0001\u0000\u0000\u0000\u011c\u0b6a\u0001"+
		"\u0000\u0000\u0000\u011e\u0b73\u0001\u0000\u0000\u0000\u0120\u0b77\u0001"+
		"\u0000\u0000\u0000\u0122\u0b7f\u0001\u0000\u0000\u0000\u0124\u0b85\u0001"+
		"\u0000\u0000\u0000\u0126\u0ba9\u0001\u0000\u0000\u0000\u0128\u0bab\u0001"+
		"\u0000\u0000\u0000\u012a\u0bb8\u0001\u0000\u0000\u0000\u012c\u0bba\u0001"+
		"\u0000\u0000\u0000\u012e\u0bcf\u0001\u0000\u0000\u0000\u0130\u0c0d\u0001"+
		"\u0000\u0000\u0000\u0132\u0c1b\u0001\u0000\u0000\u0000\u0134\u0c22\u0001"+
		"\u0000\u0000\u0000\u0136\u0c30\u0001\u0000\u0000\u0000\u0138\u0c36\u0001"+
		"\u0000\u0000\u0000\u013a\u0c3b\u0001\u0000\u0000\u0000\u013c\u0c3f\u0001"+
		"\u0000\u0000\u0000\u013e\u0c49\u0001\u0000\u0000\u0000\u0140\u0c4b\u0001"+
		"\u0000\u0000\u0000\u0142\u0c4d\u0001\u0000\u0000\u0000\u0144\u0c50\u0001"+
		"\u0000\u0000\u0000\u0146\u0c59\u0001\u0000\u0000\u0000\u0148\u0c5d\u0001"+
		"\u0000\u0000\u0000\u014a\u0c6e\u0001\u0000\u0000\u0000\u014c\u0c70\u0001"+
		"\u0000\u0000\u0000\u014e\u0c75\u0001\u0000\u0000\u0000\u0150\u0c77\u0001"+
		"\u0000\u0000\u0000\u0152\u0c88\u0001\u0000\u0000\u0000\u0154\u0c8a\u0001"+
		"\u0000\u0000\u0000\u0156\u0c8c\u0001\u0000\u0000\u0000\u0158\u0c96\u0001"+
		"\u0000\u0000\u0000\u015a\u0cc6\u0001\u0000\u0000\u0000\u015c\u0ce1\u0001"+
		"\u0000\u0000\u0000\u015e\u0cf9\u0001\u0000\u0000\u0000\u0160\u0d19\u0001"+
		"\u0000\u0000\u0000\u0162\u0d37\u0001\u0000\u0000\u0000\u0164\u0d4e\u0001"+
		"\u0000\u0000\u0000\u0166\u0d5c\u0001\u0000\u0000\u0000\u0168\u0d5e\u0001"+
		"\u0000\u0000\u0000\u016a\u0d69\u0001\u0000\u0000\u0000\u016c\u0d8f\u0001"+
		"\u0000\u0000\u0000\u016e\u0170\u0003\u0002\u0001\u0000\u016f\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001"+
		"\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005"+
		"\u0000\u0000\u0001\u0175\u0001\u0001\u0000\u0000\u0000\u0176\u0178\u0003"+
		"\u0004\u0002\u0000\u0177\u0179\u0003\u0084B\u0000\u0178\u0177\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u0003\u0001\u0000"+
		"\u0000\u0000\u017a\u017c\u0003\u0006\u0003\u0000\u017b\u017d\u0005\u01cb"+
		"\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017a\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0005\u0001\u0000"+
		"\u0000\u0000\u0182\u0187\u0003\b\u0004\u0000\u0183\u0187\u0003\n\u0005"+
		"\u0000\u0184\u0187\u0003\f\u0006\u0000\u0185\u0187\u0003\u000e\u0007\u0000"+
		"\u0186\u0182\u0001\u0000\u0000\u0000\u0186\u0183\u0001\u0000\u0000\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u0007\u0001\u0000\u0000\u0000\u0188\u018d\u0003\u0010\b\u0000\u0189"+
		"\u018d\u0003\u0014\n\u0000\u018a\u018d\u0003\u0018\f\u0000\u018b\u018d"+
		"\u0003\u001a\r\u0000\u018c\u0188\u0001\u0000\u0000\u0000\u018c\u0189\u0001"+
		"\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018b\u0001"+
		"\u0000\u0000\u0000\u018d\t\u0001\u0000\u0000\u0000\u018e\u019f\u0003$"+
		"\u0012\u0000\u018f\u019f\u0003&\u0013\u0000\u0190\u019f\u0003\u015a\u00ad"+
		"\u0000\u0191\u019f\u0003\u0158\u00ac\u0000\u0192\u019f\u0003(\u0014\u0000"+
		"\u0193\u019f\u0003*\u0015\u0000\u0194\u019f\u0003h4\u0000\u0195\u019f"+
		"\u0003,\u0016\u0000\u0196\u019f\u00030\u0018\u0000\u0197\u019f\u00032"+
		"\u0019\u0000\u0198\u019f\u0003^/\u0000\u0199\u019f\u0003`0\u0000\u019a"+
		"\u019f\u0003b1\u0000\u019b\u019f\u0003d2\u0000\u019c\u019f\u0003j5\u0000"+
		"\u019d\u019f\u0003f3\u0000\u019e\u018e\u0001\u0000\u0000\u0000\u019e\u018f"+
		"\u0001\u0000\u0000\u0000\u019e\u0190\u0001\u0000\u0000\u0000\u019e\u0191"+
		"\u0001\u0000\u0000\u0000\u019e\u0192\u0001\u0000\u0000\u0000\u019e\u0193"+
		"\u0001\u0000\u0000\u0000\u019e\u0194\u0001\u0000\u0000\u0000\u019e\u0195"+
		"\u0001\u0000\u0000\u0000\u019e\u0196\u0001\u0000\u0000\u0000\u019e\u0197"+
		"\u0001\u0000\u0000\u0000\u019e\u0198\u0001\u0000\u0000\u0000\u019e\u0199"+
		"\u0001\u0000\u0000\u0000\u019e\u019a\u0001\u0000\u0000\u0000\u019e\u019b"+
		"\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019f\u000b\u0001\u0000\u0000\u0000\u01a0\u01a2"+
		"\u0005\u000b\u0000\u0000\u01a1\u01a3\u0005\u01cb\u0000\u0000\u01a2\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a6\u0003\u0004\u0002\u0000\u01a5\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a9\u0005<\u0000\u0000\u01a8\u01aa\u0005"+
		"\u01cb\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001"+
		"\u0000\u0000\u0000\u01aa\u021e\u0001\u0000\u0000\u0000\u01ab\u01ad\u0005"+
		"\r\u0000\u0000\u01ac\u01ae\u0005\u01cb\u0000\u0000\u01ad\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u021e\u0001\u0000"+
		"\u0000\u0000\u01af\u01b1\u0005#\u0000\u0000\u01b0\u01b2\u0005\u01cb\u0000"+
		"\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u021e\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005P\u0000\u0000"+
		"\u01b4\u01b6\u0003\u014e\u00a7\u0000\u01b5\u01b7\u0005\u01cb\u0000\u0000"+
		"\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7\u021e\u0001\u0000\u0000\u0000\u01b8\u01b9\u0003\u014e\u00a7\u0000"+
		"\u01b9\u01bb\u0005\u01cc\u0000\u0000\u01ba\u01bc\u0005\u01cb\u0000\u0000"+
		"\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u021e\u0001\u0000\u0000\u0000\u01bd\u01be\u0005X\u0000\u0000\u01be"+
		"\u01bf\u0003\u00b4Z\u0000\u01bf\u01c2\u0003\u0006\u0003\u0000\u01c0\u01c1"+
		"\u0005;\u0000\u0000\u01c1\u01c3\u0003\u0006\u0003\u0000\u01c2\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c6\u0005\u01cb\u0000\u0000\u01c5\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u021e\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c9\u0005\u0092\u0000\u0000\u01c8\u01ca\u0003"+
		"\u00a6S\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb\u01cd\u0005\u01cb"+
		"\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cd\u021e\u0001\u0000\u0000\u0000\u01ce\u01d4\u0005\u0192"+
		"\u0000\u0000\u01cf\u01d0\u0007\u0000\u0000\u0000\u01d0\u01d1\u0005\u01ca"+
		"\u0000\u0000\u01d1\u01d2\u0007\u0001\u0000\u0000\u01d2\u01d3\u0005\u01ca"+
		"\u0000\u0000\u01d3\u01d5\u0007\u0000\u0000\u0000\u01d4\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d8\u0005\u01cb\u0000\u0000\u01d7\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u021e\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0005\u000b\u0000\u0000\u01da\u01dc\u0005\u0199"+
		"\u0000\u0000\u01db\u01dd\u0005\u01cb\u0000\u0000\u01dc\u01db\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000"+
		"\u0000\u0000\u01de\u01e0\u0003\u0004\u0002\u0000\u01df\u01de\u0001\u0000"+
		"\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0005<\u0000\u0000\u01e2\u01e4\u0005\u0199\u0000"+
		"\u0000\u01e3\u01e5\u0005\u01cb\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0005\u000b\u0000\u0000\u01e7\u01e9\u0005\u00e3\u0000"+
		"\u0000\u01e8\u01ea\u0005\u01cb\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ed\u0003\u0004\u0002\u0000\u01ec\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0005<\u0000\u0000\u01ef\u01f1\u0005\u00e3\u0000\u0000"+
		"\u01f0\u01f2\u0005\u01cb\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u021e\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0005\u00c3\u0000\u0000\u01f4\u01f5\u0007\u0002\u0000\u0000"+
		"\u01f5\u01f7\u0003\u00a6S\u0000\u01f6\u01f8\u0005\u01cb\u0000\u0000\u01f7"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8"+
		"\u021e\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005\u00c6\u0000\u0000\u01fa"+
		"\u0204\u0003\u00b4Z\u0000\u01fb\u0205\u0003\u0006\u0003\u0000\u01fc\u01fe"+
		"\u0005\r\u0000\u0000\u01fd\u01ff\u0005\u01cb\u0000\u0000\u01fe\u01fd\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0205\u0001"+
		"\u0000\u0000\u0000\u0200\u0202\u0005#\u0000\u0000\u0201\u0203\u0005\u01cb"+
		"\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000"+
		"\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u01fb\u0001\u0000"+
		"\u0000\u0000\u0204\u01fc\u0001\u0000\u0000\u0000\u0204\u0200\u0001\u0000"+
		"\u0000\u0000\u0205\u021e\u0001\u0000\u0000\u0000\u0206\u0207\u0005\u0086"+
		"\u0000\u0000\u0207\u0209\u0003\u00a6S\u0000\u0208\u020a\u0005\u01cb\u0000"+
		"\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020a\u021e\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u008a\u0000"+
		"\u0000\u020c\u020d\u0005\u01c8\u0000\u0000\u020d\u020e\u0007\u0003\u0000"+
		"\u0000\u020e\u020f\u0005\u01ca\u0000\u0000\u020f\u0210\u0003\u00a4R\u0000"+
		"\u0210\u0211\u0005\u01ca\u0000\u0000\u0211\u0216\u0003\u00a4R\u0000\u0212"+
		"\u0213\u0005\u01ca\u0000\u0000\u0213\u0215\u0003\u00a4R\u0000\u0214\u0212"+
		"\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214"+
		"\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0219"+
		"\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021b"+
		"\u0005\u01c9\u0000\u0000\u021a\u021c\u0005\u01cb\u0000\u0000\u021b\u021a"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021e"+
		"\u0001\u0000\u0000\u0000\u021d\u01a0\u0001\u0000\u0000\u0000\u021d\u01ab"+
		"\u0001\u0000\u0000\u0000\u021d\u01af\u0001\u0000\u0000\u0000\u021d\u01b3"+
		"\u0001\u0000\u0000\u0000\u021d\u01b8\u0001\u0000\u0000\u0000\u021d\u01bd"+
		"\u0001\u0000\u0000\u0000\u021d\u01c7\u0001\u0000\u0000\u0000\u021d\u01ce"+
		"\u0001\u0000\u0000\u0000\u021d\u01d9\u0001\u0000\u0000\u0000\u021d\u01f3"+
		"\u0001\u0000\u0000\u0000\u021d\u01f9\u0001\u0000\u0000\u0000\u021d\u0206"+
		"\u0001\u0000\u0000\u0000\u021d\u020b\u0001\u0000\u0000\u0000\u021e\r\u0001"+
		"\u0000\u0000\u0000\u021f\u0227\u0003r9\u0000\u0220\u0227\u0003t:\u0000"+
		"\u0221\u0227\u0003v;\u0000\u0222\u0227\u0003|>\u0000\u0223\u0227\u0003"+
		"\u0080@\u0000\u0224\u0227\u0003\u0082A\u0000\u0225\u0227\u0003\u0086C"+
		"\u0000\u0226\u021f\u0001\u0000\u0000\u0000\u0226\u0220\u0001\u0000\u0000"+
		"\u0000\u0226\u0221\u0001\u0000\u0000\u0000\u0226\u0222\u0001\u0000\u0000"+
		"\u0000\u0226\u0223\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000"+
		"\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227\u000f\u0001\u0000\u0000"+
		"\u0000\u0228\u022a\u0003\u00acV\u0000\u0229\u0228\u0001\u0000\u0000\u0000"+
		"\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000"+
		"\u022b\u022d\u00052\u0000\u0000\u022c\u022e\u0003\u00c4b\u0000\u022d\u022c"+
		"\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0230"+
		"\u0001\u0000\u0000\u0000\u022f\u0231\u0005M\u0000\u0000\u0230\u022f\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001"+
		"\u0000\u0000\u0000\u0232\u0234\u0003\u0012\t\u0000\u0233\u0235\u0003\u00fe"+
		"\u007f\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000"+
		"\u0000\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236\u0238\u0003\u001e"+
		"\u000f\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000"+
		"\u0000\u0000\u0238\u023b\u0001\u0000\u0000\u0000\u0239\u023a\u0005M\u0000"+
		"\u0000\u023a\u023c\u0003\u00dcn\u0000\u023b\u0239\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023e\u0001\u0000\u0000\u0000"+
		"\u023d\u023f\u0003\u001c\u000e\u0000\u023e\u023d\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000"+
		"\u0240\u0242\u0003\u00cae\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0241"+
		"\u0242\u0001\u0000\u0000\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243"+
		"\u0245\u0003\u00d2i\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0001\u0000\u0000\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u0248"+
		"\u0005\u01cb\u0000\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0001\u0000\u0000\u0000\u0248\u0011\u0001\u0000\u0000\u0000\u0249\u024b"+
		"\u0003\u014e\u00a7\u0000\u024a\u024c\u0003\u00fc~\u0000\u024b\u024a\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u0251\u0001"+
		"\u0000\u0000\u0000\u024d\u0251\u0003\u0138\u009c\u0000\u024e\u0251\u0003"+
		"l6\u0000\u024f\u0251\u0005\u01b0\u0000\u0000\u0250\u0249\u0001\u0000\u0000"+
		"\u0000\u0250\u024d\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000"+
		"\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0251\u0013\u0001\u0000\u0000"+
		"\u0000\u0252\u0254\u0003\u00acV\u0000\u0253\u0252\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000"+
		"\u0255\u0257\u0005\\\u0000\u0000\u0256\u0258\u0003\u00c4b\u0000\u0257"+
		"\u0256\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"\u025a\u0001\u0000\u0000\u0000\u0259\u025b\u0005^\u0000\u0000\u025a\u0259"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025e"+
		"\u0001\u0000\u0000\u0000\u025c\u025f\u0003\u0138\u009c\u0000\u025d\u025f"+
		"\u0003l6\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025d\u0001\u0000"+
		"\u0000\u0000\u025f\u0261\u0001\u0000\u0000\u0000\u0260\u0262\u0003\u00fe"+
		"\u007f\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000"+
		"\u0000\u0000\u0262\u0267\u0001\u0000\u0000\u0000\u0263\u0264\u0005\u01c8"+
		"\u0000\u0000\u0264\u0265\u0003\u013c\u009e\u0000\u0265\u0266\u0005\u01c9"+
		"\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0263\u0001\u0000"+
		"\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u026a\u0001\u0000"+
		"\u0000\u0000\u0269\u026b\u0003\u001e\u000f\u0000\u026a\u0269\u0001\u0000"+
		"\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000"+
		"\u0000\u0000\u026c\u026e\u0003\u0016\u000b\u0000\u026d\u026f\u0003\u00ca"+
		"e\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000"+
		"\u0000\u026f\u0271\u0001\u0000\u0000\u0000\u0270\u0272\u0003\u00d2i\u0000"+
		"\u0271\u0270\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000"+
		"\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0275\u0005\u01cb\u0000\u0000"+
		"\u0274\u0273\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000"+
		"\u0275\u0015\u0001\u0000\u0000\u0000\u0276\u027c\u0003\u010a\u0085\u0000"+
		"\u0277\u027c\u0003\u00f4z\u0000\u0278\u027c\u0003v;\u0000\u0279\u027a"+
		"\u00051\u0000\u0000\u027a\u027c\u0005\u00bf\u0000\u0000\u027b\u0276\u0001"+
		"\u0000\u0000\u0000\u027b\u0277\u0001\u0000\u0000\u0000\u027b\u0278\u0001"+
		"\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c\u0017\u0001"+
		"\u0000\u0000\u0000\u027d\u027f\u0003\u00acV\u0000\u027e\u027d\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000"+
		"\u0000\u0000\u0280\u0282\u0003\u00b8\\\u0000\u0281\u0283\u0003\u00c6c"+
		"\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000"+
		"\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0286\u0003\u00cae\u0000"+
		"\u0285\u0284\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000"+
		"\u0286\u0288\u0001\u0000\u0000\u0000\u0287\u0289\u0003\u00d2i\u0000\u0288"+
		"\u0287\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289"+
		"\u028b\u0001\u0000\u0000\u0000\u028a\u028c\u0005\u01cb\u0000\u0000\u028b"+
		"\u028a\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c"+
		"\u0019\u0001\u0000\u0000\u0000\u028d\u028f\u0003\u00acV\u0000\u028e\u028d"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290"+
		"\u0001\u0000\u0000\u0000\u0290\u0292\u0005\u00bb\u0000\u0000\u0291\u0293"+
		"\u0003\u00c4b\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001"+
		"\u0000\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0297\u0003"+
		"\u0138\u009c\u0000\u0295\u0297\u0003l6\u0000\u0296\u0294\u0001\u0000\u0000"+
		"\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0297\u0299\u0001\u0000\u0000"+
		"\u0000\u0298\u029a\u0003\u00fc~\u0000\u0299\u0298\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000"+
		"\u029b\u029c\u0005\u00a3\u0000\u0000\u029c\u02a1\u0003\u00b0X\u0000\u029d"+
		"\u029e\u0005\u01ca\u0000\u0000\u029e\u02a0\u0003\u00b0X\u0000\u029f\u029d"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1\u029f"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a6"+
		"\u0003\u001e\u000f\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000\u0000\u0000\u02a7\u02a8"+
		"\u0005M\u0000\u0000\u02a8\u02aa\u0003\u00dcn\u0000\u02a9\u02a7\u0001\u0000"+
		"\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ad\u0003\u001c\u000e\u0000\u02ac\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02af\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b0\u0003\u00cae\u0000\u02af\u02ae\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b3\u0003\u00d2i\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b6\u0005\u01cb\u0000\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u001b\u0001\u0000\u0000\u0000"+
		"\u02b7\u02c2\u0005\u00c5\u0000\u0000\u02b8\u02c3\u0003\u00b2Y\u0000\u02b9"+
		"\u02ba\u0005\'\u0000\u0000\u02ba\u02c0\u0005r\u0000\u0000\u02bb\u02bd"+
		"\u0005\u011a\u0000\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02c1"+
		"\u0003\u013e\u009f\u0000\u02bf\u02c1\u0005\u01b0\u0000\u0000\u02c0\u02bc"+
		"\u0001\u0000\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c2\u02b8\u0001\u0000\u0000\u0000\u02c2\u02b9"+
		"\u0001\u0000\u0000\u0000\u02c3\u001d\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0005\u0158\u0000\u0000\u02c5\u02ca\u0003 \u0010\u0000\u02c6\u02c7\u0005"+
		"\u01ca\u0000\u0000\u02c7\u02c9\u0003 \u0010\u0000\u02c8\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000"+
		"\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02d8\u0001\u0000"+
		"\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02d0\u0005^\u0000"+
		"\u0000\u02ce\u02d1\u0005\u01b0\u0000\u0000\u02cf\u02d1\u0003\u0132\u0099"+
		"\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d6\u0001\u0000\u0000\u0000\u02d2\u02d3\u0005\u01c8\u0000"+
		"\u0000\u02d3\u02d4\u0003\u013c\u009e\u0000\u02d4\u02d5\u0005\u01c9\u0000"+
		"\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d9\u0001\u0000\u0000"+
		"\u0000\u02d8\u02cd\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000"+
		"\u0000\u02d9\u001f\u0001\u0000\u0000\u0000\u02da\u02dd\u0003\"\u0011\u0000"+
		"\u02db\u02dd\u0003\u00a6S\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc"+
		"\u02db\u0001\u0000\u0000\u0000\u02dd\u02e2\u0001\u0000\u0000\u0000\u02de"+
		"\u02e0\u0005\u0007\u0000\u0000\u02df\u02de\u0001\u0000\u0000\u0000\u02df"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e3\u0003\u0106\u0083\u0000\u02e2\u02df\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e3!\u0001\u0000\u0000\u0000\u02e4\u02e8"+
		"\u0005\u0101\u0000\u0000\u02e5\u02e8\u0005\u0129\u0000\u0000\u02e6\u02e8"+
		"\u0003\u0132\u0099\u0000\u02e7\u02e4\u0001\u0000\u0000\u0000\u02e7\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e8\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ec\u0005\u01c3\u0000\u0000\u02ea\u02ed"+
		"\u0005\u01cd\u0000\u0000\u02eb\u02ed\u0003\u014e\u00a7\u0000\u02ec\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ed\u02f0"+
		"\u0001\u0000\u0000\u0000\u02ee\u02f0\u0005\u01aa\u0000\u0000\u02ef\u02e7"+
		"\u0001\u0000\u0000\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000\u02f0#\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0005%\u0000\u0000\u02f2\u02f3\u0005-\u0000"+
		"\u0000\u02f3\u02f7\u0003\u014e\u00a7\u0000\u02f4\u02f5\u0005 \u0000\u0000"+
		"\u02f5\u02f6\u0005\u01b7\u0000\u0000\u02f6\u02f8\u0007\u0004\u0000\u0000"+
		"\u02f7\u02f4\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000"+
		"\u02f8\u0305\u0001\u0000\u0000\u0000\u02f9\u02fb\u0005u\u0000\u0000\u02fa"+
		"\u02fc\u0005\u0085\u0000\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd"+
		"\u0302\u0003\u012a\u0095\u0000\u02fe\u02ff\u0005\u01ca\u0000\u0000\u02ff"+
		"\u0301\u0003\u012a\u0095\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0301"+
		"\u0304\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302"+
		"\u0303\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000\u0000\u0304"+
		"\u0302\u0001\u0000\u0000\u0000\u0305\u02f9\u0001\u0000\u0000\u0000\u0305"+
		"\u0306\u0001\u0000\u0000\u0000\u0306\u0311\u0001\u0000\u0000\u0000\u0307"+
		"\u0308\u0005g\u0000\u0000\u0308\u0309\u0005u\u0000\u0000\u0309\u030e\u0003"+
		"\u012a\u0095\u0000\u030a\u030b\u0005\u01ca\u0000\u0000\u030b\u030d\u0003"+
		"\u012a\u0095\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030d\u0310\u0001"+
		"\u0000\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030f\u0001"+
		"\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e\u0001"+
		"\u0000\u0000\u0000\u0311\u0307\u0001\u0000\u0000\u0000\u0311\u0312\u0001"+
		"\u0000\u0000\u0000\u0312\u0315\u0001\u0000\u0000\u0000\u0313\u0314\u0005"+
		"\u001b\u0000\u0000\u0314\u0316\u0003\u014e\u00a7\u0000\u0315\u0313\u0001"+
		"\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0320\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0005\u00c7\u0000\u0000\u0318\u031d\u0003"+
		"\u0126\u0093\u0000\u0319\u031a\u0005\u01ca\u0000\u0000\u031a\u031c\u0003"+
		"\u0126\u0093\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031c\u031f\u0001"+
		"\u0000\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031d\u031e\u0001"+
		"\u0000\u0000\u0000\u031e\u0321\u0001\u0000\u0000\u0000\u031f\u031d\u0001"+
		"\u0000\u0000\u0000\u0320\u0317\u0001\u0000\u0000\u0000\u0320\u0321\u0001"+
		"\u0000\u0000\u0000\u0321%\u0001\u0000\u0000\u0000\u0322\u0324\u0005%\u0000"+
		"\u0000\u0323\u0325\u0005\u00b9\u0000\u0000\u0324\u0323\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0327\u0001\u0000\u0000"+
		"\u0000\u0326\u0328\u0003\u0142\u00a1\u0000\u0327\u0326\u0001\u0000\u0000"+
		"\u0000\u0327\u0328\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000"+
		"\u0000\u0329\u032a\u0005Z\u0000\u0000\u032a\u032b\u0003\u014e\u00a7\u0000"+
		"\u032b\u032c\u0005u\u0000\u0000\u032c\u032d\u0003\u00eew\u0000\u032d\u032e"+
		"\u0005\u01c8\u0000\u0000\u032e\u0330\u0003\u013c\u009e\u0000\u032f\u0331"+
		"\u0007\u0005\u0000\u0000\u0330\u032f\u0001\u0000\u0000\u0000\u0330\u0331"+
		"\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0334"+
		"\u0005\u01c9\u0000\u0000\u0333\u0335\u0003\u0098L\u0000\u0334\u0333\u0001"+
		"\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0338\u0001"+
		"\u0000\u0000\u0000\u0336\u0337\u0005u\u0000\u0000\u0337\u0339\u0003\u014e"+
		"\u00a7\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000"+
		"\u0000\u0000\u0339\u033b\u0001\u0000\u0000\u0000\u033a\u033c\u0005\u01cb"+
		"\u0000\u0000\u033b\u033a\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000"+
		"\u0000\u0000\u033c\'\u0001\u0000\u0000\u0000\u033d\u033e\u0005%\u0000"+
		"\u0000\u033e\u033f\u0005\u00a7\u0000\u0000\u033f\u0340\u0003\u014e\u00a7"+
		"\u0000\u0340\u0341\u0005u\u0000\u0000\u0341\u0342\u0003\u00eew\u0000\u0342"+
		"\u0343\u0005\u01c8\u0000\u0000\u0343\u0344\u0003\u013c\u009e\u0000\u0344"+
		"\u0357\u0005\u01c9\u0000\u0000\u0345\u034b\u0005\u00c7\u0000\u0000\u0346"+
		"\u034c\u0005\u0118\u0000\u0000\u0347\u0348\u0005\u0178\u0000\u0000\u0348"+
		"\u0349\u0005\u01b1\u0000\u0000\u0349\u034c\u0007\u0006\u0000\u0000\u034a"+
		"\u034c\u0005\u0188\u0000\u0000\u034b\u0346\u0001\u0000\u0000\u0000\u034b"+
		"\u0347\u0001\u0000\u0000\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034c"+
		"\u034f\u0001\u0000\u0000\u0000\u034d\u034e\u0005\u01ca\u0000\u0000\u034e"+
		"\u0350\u0005\u014c\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u034f"+
		"\u0350\u0001\u0000\u0000\u0000\u0350\u0355\u0001\u0000\u0000\u0000\u0351"+
		"\u0352\u0005\u01ca\u0000\u0000\u0352\u0353\u0005\u0125\u0000\u0000\u0353"+
		"\u0354\u0005\u01b7\u0000\u0000\u0354\u0356\u0003\u0140\u00a0\u0000\u0355"+
		"\u0351\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356"+
		"\u0358\u0001\u0000\u0000\u0000\u0357\u0345\u0001\u0000\u0000\u0000\u0357"+
		"\u0358\u0001\u0000\u0000\u0000\u0358\u035a\u0001\u0000\u0000\u0000\u0359"+
		"\u035b\u0005\u01cb\u0000\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035a"+
		"\u035b\u0001\u0000\u0000\u0000\u035b)\u0001\u0000\u0000\u0000\u035c\u035d"+
		"\u0005%\u0000\u0000\u035d\u035e\u0005\u00aa\u0000\u0000\u035e\u035f\u0003"+
		"\u0132\u0099\u0000\u035f\u0360\u0005\u01c8\u0000\u0000\u0360\u0362\u0003"+
		"\u008eG\u0000\u0361\u0363\u0005\u01ca\u0000\u0000\u0362\u0361\u0001\u0000"+
		"\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000"+
		"\u0000\u0000\u0364\u0368\u0005\u01c9\u0000\u0000\u0365\u0366\u0005u\u0000"+
		"\u0000\u0366\u0369\u0003\u014e\u00a7\u0000\u0367\u0369\u00051\u0000\u0000"+
		"\u0368\u0365\u0001\u0000\u0000\u0000\u0368\u0367\u0001\u0000\u0000\u0000"+
		"\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u036d\u0001\u0000\u0000\u0000"+
		"\u036a\u036b\u0005\u0191\u0000\u0000\u036b\u036e\u0003\u014e\u00a7\u0000"+
		"\u036c\u036e\u00051\u0000\u0000\u036d\u036a\u0001\u0000\u0000\u0000\u036d"+
		"\u036c\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e"+
		"\u0370\u0001\u0000\u0000\u0000\u036f\u0371\u0005\u01cb\u0000\u0000\u0370"+
		"\u036f\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371"+
		"+\u0001\u0000\u0000\u0000\u0372\u0373\u0005%\u0000\u0000\u0373\u0374\u0005"+
		"\u00c2\u0000\u0000\u0374\u0379\u0003\u0134\u009a\u0000\u0375\u0376\u0005"+
		"\u01c8\u0000\u0000\u0376\u0377\u0003\u013c\u009e\u0000\u0377\u0378\u0005"+
		"\u01c9\u0000\u0000\u0378\u037a\u0001\u0000\u0000\u0000\u0379\u0375\u0001"+
		"\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u0384\u0001"+
		"\u0000\u0000\u0000\u037b\u037c\u0005\u00c7\u0000\u0000\u037c\u0381\u0003"+
		".\u0017\u0000\u037d\u037e\u0005\u01ca\u0000\u0000\u037e\u0380\u0003.\u0017"+
		"\u0000\u037f\u037d\u0001\u0000\u0000\u0000\u0380\u0383\u0001\u0000\u0000"+
		"\u0000\u0381\u037f\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000"+
		"\u0000\u0382\u0385\u0001\u0000\u0000\u0000\u0383\u0381\u0001\u0000\u0000"+
		"\u0000\u0384\u037b\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000"+
		"\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0387\u0005\u0007\u0000"+
		"\u0000\u0387\u038b\u0003\u0018\f\u0000\u0388\u0389\u0005\u00c7\u0000\u0000"+
		"\u0389\u038a\u0005\u0016\u0000\u0000\u038a\u038c\u0005{\u0000\u0000\u038b"+
		"\u0388\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c"+
		"\u038e\u0001\u0000\u0000\u0000\u038d\u038f\u0005\u01cb\u0000\u0000\u038e"+
		"\u038d\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000\u038f"+
		"-\u0001\u0000\u0000\u0000\u0390\u0391\u0007\u0007\u0000\u0000\u0391/\u0001"+
		"\u0000\u0000\u0000\u0392\u0393\u0005\u0004\u0000\u0000\u0393\u0394\u0005"+
		"\u00aa\u0000\u0000\u0394\u03b3\u0003\u0132\u0099\u0000\u0395\u0396\u0005"+
		"\u00a3\u0000\u0000\u0396\u0397\u0005\u01c8\u0000\u0000\u0397\u0398\u0005"+
		"\u0136\u0000\u0000\u0398\u0399\u0005\u01b7\u0000\u0000\u0399\u039a\u0007"+
		"\b\u0000\u0000\u039a\u03b4\u0005\u01c9\u0000\u0000\u039b\u039c\u0005\u0002"+
		"\u0000\u0000\u039c\u03b4\u0003\u0090H\u0000\u039d\u039e\u00059\u0000\u0000"+
		"\u039e\u039f\u0005\u001f\u0000\u0000\u039f\u03b4\u0003\u014e\u00a7\u0000"+
		"\u03a0\u03a1\u0005\u00c7\u0000\u0000\u03a1\u03a2\u0005\u0016\u0000\u0000"+
		"\u03a2\u03a3\u0005\u0002\u0000\u0000\u03a3\u03a4\u0005\u001f\u0000\u0000"+
		"\u03a4\u03a5\u0003\u014e\u00a7\u0000\u03a5\u03a6\u0005J\u0000\u0000\u03a6"+
		"\u03a7\u0005a\u0000\u0000\u03a7\u03a8\u0005\u01c8\u0000\u0000\u03a8\u03a9"+
		"\u0003\u013c\u009e\u0000\u03a9\u03aa\u0005\u01c9\u0000\u0000\u03aa\u03ab"+
		"\u0005\u008e\u0000\u0000\u03ab\u03ac\u0003\u0132\u0099\u0000\u03ac\u03ad"+
		"\u0005\u01c8\u0000\u0000\u03ad\u03ae\u0003\u013c\u009e\u0000\u03ae\u03af"+
		"\u0005\u01c9\u0000\u0000\u03af\u03b4\u0001\u0000\u0000\u0000\u03b0\u03b1"+
		"\u0005\u0016\u0000\u0000\u03b1\u03b2\u0005\u001f\u0000\u0000\u03b2\u03b4"+
		"\u0003\u014e\u00a7\u0000\u03b3\u0395\u0001\u0000\u0000\u0000\u03b3\u039b"+
		"\u0001\u0000\u0000\u0000\u03b3\u039d\u0001\u0000\u0000\u0000\u03b3\u03a0"+
		"\u0001\u0000\u0000\u0000\u03b3\u03b0\u0001\u0000\u0000\u0000\u03b4\u03b6"+
		"\u0001\u0000\u0000\u0000\u03b5\u03b7\u0005\u01cb\u0000\u0000\u03b6\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b71\u0001"+
		"\u0000\u0000\u0000\u03b8\u03b9\u0005\u0004\u0000\u0000\u03b9\u03bc\u0005"+
		"-\u0000\u0000\u03ba\u03bd\u0003\u014e\u00a7\u0000\u03bb\u03bd\u0005\'"+
		"\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bb\u0001\u0000"+
		"\u0000\u0000\u03bd\u03ca\u0001\u0000\u0000\u0000\u03be\u03bf\u0005\u0144"+
		"\u0000\u0000\u03bf\u03c0\u0005\u0146\u0000\u0000\u03c0\u03c1\u0005\u01b7"+
		"\u0000\u0000\u03c1\u03cb\u0003\u014e\u00a7\u0000\u03c2\u03c3\u0005\u001b"+
		"\u0000\u0000\u03c3\u03cb\u0003\u014e\u00a7\u0000\u03c4\u03c5\u0005\u00a3"+
		"\u0000\u0000\u03c5\u03c8\u00034\u001a\u0000\u03c6\u03c7\u0005\u00c7\u0000"+
		"\u0000\u03c7\u03c9\u0003\\.\u0000\u03c8\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cb\u0001\u0000\u0000\u0000"+
		"\u03ca\u03be\u0001\u0000\u0000\u0000\u03ca\u03c2\u0001\u0000\u0000\u0000"+
		"\u03ca\u03c4\u0001\u0000\u0000\u0000\u03cb\u03cd\u0001\u0000\u0000\u0000"+
		"\u03cc\u03ce\u0005\u01cb\u0000\u0000\u03cd\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce3\u0001\u0000\u0000\u0000\u03cf"+
		"\u03e6\u00036\u001b\u0000\u03d0\u03e6\u00038\u001c\u0000\u03d1\u03e6\u0003"+
		"<\u001e\u0000\u03d2\u03e6\u0003>\u001f\u0000\u03d3\u03e6\u0003@ \u0000"+
		"\u03d4\u03e6\u0003B!\u0000\u03d5\u03e6\u0003D\"\u0000\u03d6\u03e6\u0003"+
		"F#\u0000\u03d7\u03e6\u0003H$\u0000\u03d8\u03e6\u0003J%\u0000\u03d9\u03e6"+
		"\u0003L&\u0000\u03da\u03db\u0005\u0111\u0000\u0000\u03db\u03e6\u0003\u0128"+
		"\u0094\u0000\u03dc\u03e6\u0005\u0001\u0000\u0000\u03dd\u03e6\u0003N\'"+
		"\u0000\u03de\u03e6\u0003P(\u0000\u03df\u03e6\u0003R)\u0000\u03e0\u03e6"+
		"\u0003T*\u0000\u03e1\u03e6\u0003V+\u0000\u03e2\u03e6\u0003X,\u0000\u03e3"+
		"\u03e6\u0003Z-\u0000\u03e4\u03e6\u0003\\.\u0000\u03e5\u03cf\u0001\u0000"+
		"\u0000\u0000\u03e5\u03d0\u0001\u0000\u0000\u0000\u03e5\u03d1\u0001\u0000"+
		"\u0000\u0000\u03e5\u03d2\u0001\u0000\u0000\u0000\u03e5\u03d3\u0001\u0000"+
		"\u0000\u0000\u03e5\u03d4\u0001\u0000\u0000\u0000\u03e5\u03d5\u0001\u0000"+
		"\u0000\u0000\u03e5\u03d6\u0001\u0000\u0000\u0000\u03e5\u03d7\u0001\u0000"+
		"\u0000\u0000\u03e5\u03d8\u0001\u0000\u0000\u0000\u03e5\u03d9\u0001\u0000"+
		"\u0000\u0000\u03e5\u03da\u0001\u0000\u0000\u0000\u03e5\u03dc\u0001\u0000"+
		"\u0000\u0000\u03e5\u03dd\u0001\u0000\u0000\u0000\u03e5\u03de\u0001\u0000"+
		"\u0000\u0000\u03e5\u03df\u0001\u0000\u0000\u0000\u03e5\u03e0\u0001\u0000"+
		"\u0000\u0000\u03e5\u03e1\u0001\u0000\u0000\u0000\u03e5\u03e2\u0001\u0000"+
		"\u0000\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e65\u0001\u0000\u0000\u0000\u03e7\u03e8\u0005\u00d7\u0000"+
		"\u0000\u03e8\u03f9\u0003\u0140\u00a0\u0000\u03e9\u03ea\u0005\u00d8\u0000"+
		"\u0000\u03ea\u03f9\u0005s\u0000\u0000\u03eb\u03f0\u0005u\u0000\u0000\u03ec"+
		"\u03ed\u0005\u0125\u0000\u0000\u03ed\u03ee\u0005\u01b7\u0000\u0000\u03ee"+
		"\u03f1\u0005u\u0000\u0000\u03ef\u03f1\u0005s\u0000\u0000\u03f0\u03ec\u0001"+
		"\u0000\u0000\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f9\u0001"+
		"\u0000\u0000\u0000\u03f2\u03f3\u0005\u00d9\u0000\u0000\u03f3\u03f9\u0003"+
		"\u0140\u00a0\u0000\u03f4\u03f5\u0005\u00da\u0000\u0000\u03f5\u03f9\u0003"+
		"\u0140\u00a0\u0000\u03f6\u03f7\u0005\u00db\u0000\u0000\u03f7\u03f9\u0007"+
		"\t\u0000\u0000\u03f8\u03e7\u0001\u0000\u0000\u0000\u03f8\u03e9\u0001\u0000"+
		"\u0000\u0000\u03f8\u03eb\u0001\u0000\u0000\u0000\u03f8\u03f2\u0001\u0000"+
		"\u0000\u0000\u03f8\u03f4\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000"+
		"\u0000\u0000\u03f97\u0001\u0000\u0000\u0000\u03fa\u03fb\u0005\u00e5\u0000"+
		"\u0000\u03fb\u040b\u0005\u01b7\u0000\u0000\u03fc\u040c\u0005s\u0000\u0000"+
		"\u03fd\u0408\u0005u\u0000\u0000\u03fe\u0403\u0003:\u001d\u0000\u03ff\u0400"+
		"\u0005\u01ca\u0000\u0000\u0400\u0402\u0003:\u001d\u0000\u0401\u03ff\u0001"+
		"\u0000\u0000\u0000\u0402\u0405\u0001\u0000\u0000\u0000\u0403\u0401\u0001"+
		"\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0407\u0001"+
		"\u0000\u0000\u0000\u0405\u0403\u0001\u0000\u0000\u0000\u0406\u03fe\u0001"+
		"\u0000\u0000\u0000\u0407\u040a\u0001\u0000\u0000\u0000\u0408\u0406\u0001"+
		"\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u040c\u0001"+
		"\u0000\u0000\u0000\u040a\u0408\u0001\u0000\u0000\u0000\u040b\u03fc\u0001"+
		"\u0000\u0000\u0000\u040b\u03fd\u0001\u0000\u0000\u0000\u040c9\u0001\u0000"+
		"\u0000\u0000\u040d\u040e\u0005\u00d6\u0000\u0000\u040e\u040f\u0005\u01b7"+
		"\u0000\u0000\u040f\u0414\u0003\u0140\u00a0\u0000\u0410\u0411\u0005\u00e4"+
		"\u0000\u0000\u0411\u0412\u0005\u01b7\u0000\u0000\u0412\u0414\u0007\n\u0000"+
		"\u0000\u0413\u040d\u0001\u0000\u0000\u0000\u0413\u0410\u0001\u0000\u0000"+
		"\u0000\u0414;\u0001\u0000\u0000\u0000\u0415\u0416\u0005 \u0000\u0000\u0416"+
		"\u0417\u0005\u01b7\u0000\u0000\u0417\u0418\u0007\u0004\u0000\u0000\u0418"+
		"=\u0001\u0000\u0000\u0000\u0419\u041a\u0005\u00f1\u0000\u0000\u041a\u041e"+
		"\u0003\u0140\u00a0\u0000\u041b\u041c\u0005\u00f2\u0000\u0000\u041c\u041e"+
		"\u0007\u000b\u0000\u0000\u041d\u0419\u0001\u0000\u0000\u0000\u041d\u041b"+
		"\u0001\u0000\u0000\u0000\u041e?\u0001\u0000\u0000\u0000\u041f\u0420\u0005"+
		"\u00fa\u0000\u0000\u0420\u0421\u0003\u0140\u00a0\u0000\u0421A\u0001\u0000"+
		"\u0000\u0000\u0422\u0423\u0005\u010a\u0000\u0000\u0423\u0424\u0003\u0140"+
		"\u00a0\u0000\u0424C\u0001\u0000\u0000\u0000\u0425\u0426\u0007\f\u0000"+
		"\u0000\u0426E\u0001\u0000\u0000\u0000\u0427\u0428\u0007\r\u0000\u0000"+
		"\u0428G\u0001\u0000\u0000\u0000\u0429\u042a\u0007\u000e\u0000\u0000\u042a"+
		"I\u0001\u0000\u0000\u0000\u042b\u042c\u0005\u0100\u0000\u0000\u042c\u042d"+
		"\u0005\u01b7\u0000\u0000\u042d\u042e\u0007\u000f\u0000\u0000\u042eK\u0001"+
		"\u0000\u0000\u0000\u042f\u0430\u0005\u00fc\u0000\u0000\u0430\u0449\u0003"+
		"\u0140\u00a0\u0000\u0431\u0432\u0005\u0198\u0000\u0000\u0432\u0449\u0003"+
		"\u0140\u00a0\u0000\u0433\u0434\u0005\u00fe\u0000\u0000\u0434\u0437\u0005"+
		"\u01b7\u0000\u0000\u0435\u0438\u0003\u014e\u00a7\u0000\u0436\u0438\u0005"+
		"\u01b3\u0000\u0000\u0437\u0435\u0001\u0000\u0000\u0000\u0437\u0436\u0001"+
		"\u0000\u0000\u0000\u0438\u0449\u0001\u0000\u0000\u0000\u0439\u043a\u0005"+
		"\u00fd\u0000\u0000\u043a\u043d\u0005\u01b7\u0000\u0000\u043b\u043e\u0003"+
		"\u014e\u00a7\u0000\u043c\u043e\u0005\u01b3\u0000\u0000\u043d\u043b\u0001"+
		"\u0000\u0000\u0000\u043d\u043c\u0001\u0000\u0000\u0000\u043e\u0449\u0001"+
		"\u0000\u0000\u0000\u043f\u0440\u0005\u0147\u0000\u0000\u0440\u0441\u0005"+
		"\u01b7\u0000\u0000\u0441\u0449\u0007\t\u0000\u0000\u0442\u0443\u0005\u0197"+
		"\u0000\u0000\u0443\u0444\u0005\u01b7\u0000\u0000\u0444\u0449\u0007\t\u0000"+
		"\u0000\u0445\u0446\u0005\u019a\u0000\u0000\u0446\u0447\u0005\u01b7\u0000"+
		"\u0000\u0447\u0449\u0005\u01b1\u0000\u0000\u0448\u042f\u0001\u0000\u0000"+
		"\u0000\u0448\u0431\u0001\u0000\u0000\u0000\u0448\u0433\u0001\u0000\u0000"+
		"\u0000\u0448\u0439\u0001\u0000\u0000\u0000\u0448\u043f\u0001\u0000\u0000"+
		"\u0000\u0448\u0442\u0001\u0000\u0000\u0000\u0448\u0445\u0001\u0000\u0000"+
		"\u0000\u0449M\u0001\u0000\u0000\u0000\u044a\u044b\u0005\u0143\u0000\u0000"+
		"\u044b\u044c\u0007\t\u0000\u0000\u044cO\u0001\u0000\u0000\u0000\u044d"+
		"\u044e\u0005\u015b\u0000\u0000\u044e\u044f\u0007\u0010\u0000\u0000\u044f"+
		"Q\u0001\u0000\u0000\u0000\u0450\u0451\u0005\u016b\u0000\u0000\u0451\u0457"+
		"\u0007\u0011\u0000\u0000\u0452\u0453\u0005\u0196\u0000\u0000\u0453\u0457"+
		"\u0003\u0140\u00a0\u0000\u0454\u0455\u0005\u015a\u0000\u0000\u0455\u0457"+
		"\u0007\u0012\u0000\u0000\u0456\u0450\u0001\u0000\u0000\u0000\u0456\u0452"+
		"\u0001\u0000\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0457S\u0001"+
		"\u0000\u0000\u0000\u0458\u045f\u0005\u0109\u0000\u0000\u0459\u045f\u0005"+
		"\u0106\u0000\u0000\u045a\u045f\u0005\u0148\u0000\u0000\u045b\u045f\u0005"+
		"\u010b\u0000\u0000\u045c\u045d\u0005\u0120\u0000\u0000\u045d\u045f\u0003"+
		"\u0140\u00a0\u0000\u045e\u0458\u0001\u0000\u0000\u0000\u045e\u0459\u0001"+
		"\u0000\u0000\u0000\u045e\u045a\u0001\u0000\u0000\u0000\u045e\u045b\u0001"+
		"\u0000\u0000\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045fU\u0001\u0000"+
		"\u0000\u0000\u0460\u0461\u0005\u00cd\u0000\u0000\u0461\u0466\u0003\u0140"+
		"\u00a0\u0000\u0462\u0463\u0005\u0167\u0000\u0000\u0463\u0466\u0007\t\u0000"+
		"\u0000\u0464\u0466\u0007\t\u0000\u0000\u0465\u0460\u0001\u0000\u0000\u0000"+
		"\u0465\u0462\u0001\u0000\u0000\u0000\u0465\u0464\u0001\u0000\u0000\u0000"+
		"\u0466W\u0001\u0000\u0000\u0000\u0467\u0468\u0005\u00cf\u0000\u0000\u0468"+
		"\u047d\u0003\u0140\u00a0\u0000\u0469\u046a\u0005\u00ce\u0000\u0000\u046a"+
		"\u047d\u0003\u0140\u00a0\u0000\u046b\u046c\u0005\u00d0\u0000\u0000\u046c"+
		"\u047d\u0003\u0140\u00a0\u0000\u046d\u046e\u0005\u00d1\u0000\u0000\u046e"+
		"\u047d\u0003\u0140\u00a0\u0000\u046f\u0470\u0005\u00d3\u0000\u0000\u0470"+
		"\u047d\u0003\u0140\u00a0\u0000\u0471\u0472\u0005\u00e9\u0000\u0000\u0472"+
		"\u0473\u0005\u01b7\u0000\u0000\u0473\u047d\u0005\u01b1\u0000\u0000\u0474"+
		"\u0475\u0005\u00eb\u0000\u0000\u0475\u047d\u0003\u0140\u00a0\u0000\u0476"+
		"\u0477\u0005\u0150\u0000\u0000\u0477\u047d\u0003\u0140\u00a0\u0000\u0478"+
		"\u0479\u0005\u0163\u0000\u0000\u0479\u047d\u0003\u0140\u00a0\u0000\u047a"+
		"\u047b\u0005\u016c\u0000\u0000\u047b\u047d\u0003\u0140\u00a0\u0000\u047c"+
		"\u0467\u0001\u0000\u0000\u0000\u047c\u0469\u0001\u0000\u0000\u0000\u047c"+
		"\u046b\u0001\u0000\u0000\u0000\u047c\u046d\u0001\u0000\u0000\u0000\u047c"+
		"\u046f\u0001\u0000\u0000\u0000\u047c\u0471\u0001\u0000\u0000\u0000\u047c"+
		"\u0474\u0001\u0000\u0000\u0000\u047c\u0476\u0001\u0000\u0000\u0000\u047c"+
		"\u0478\u0001\u0000\u0000\u0000\u047c\u047a\u0001\u0000\u0000\u0000\u047d"+
		"Y\u0001\u0000\u0000\u0000\u047e\u047f\u0005\u018f\u0000\u0000\u047f\u0480"+
		"\u0005\u01b7\u0000\u0000\u0480\u0481\u0005\u01b1\u0000\u0000\u0481\u0482"+
		"\u0007\u0013\u0000\u0000\u0482[\u0001\u0000\u0000\u0000\u0483\u0484\u0005"+
		"\u0097\u0000\u0000\u0484\u0485\u0005\u00cb\u0000\u0000\u0485\u048a\u0005"+
		"\u01b1\u0000\u0000\u0486\u0487\u0005\u0097\u0000\u0000\u0487\u048a\u0005"+
		"\u0123\u0000\u0000\u0488\u048a\u0005\u014d\u0000\u0000\u0489\u0483\u0001"+
		"\u0000\u0000\u0000\u0489\u0486\u0001\u0000\u0000\u0000\u0489\u0488\u0001"+
		"\u0000\u0000\u0000\u048a]\u0001\u0000\u0000\u0000\u048b\u048c\u00059\u0000"+
		"\u0000\u048c\u048f\u0005Z\u0000\u0000\u048d\u048e\u0005X\u0000\u0000\u048e"+
		"\u0490\u0005A\u0000\u0000\u048f\u048d\u0001\u0000\u0000\u0000\u048f\u0490"+
		"\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000\u0000\u0000\u0491\u0494"+
		"\u0003\u014e\u00a7\u0000\u0492\u0493\u0005u\u0000\u0000\u0493\u0495\u0003"+
		"\u0132\u0099\u0000\u0494\u0492\u0001\u0000\u0000\u0000\u0494\u0495\u0001"+
		"\u0000\u0000\u0000\u0495\u0497\u0001\u0000\u0000\u0000\u0496\u0498\u0005"+
		"\u01cb\u0000\u0000\u0497\u0496\u0001\u0000\u0000\u0000\u0497\u0498\u0001"+
		"\u0000\u0000\u0000\u0498_\u0001\u0000\u0000\u0000\u0499\u049a\u00059\u0000"+
		"\u0000\u049a\u049d\u0005\u0088\u0000\u0000\u049b\u049c\u0005X\u0000\u0000"+
		"\u049c\u049e\u0005A\u0000\u0000\u049d\u049b\u0001\u0000\u0000\u0000\u049d"+
		"\u049e\u0001\u0000\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f"+
		"\u04a1\u0003\u0136\u009b\u0000\u04a0\u04a2\u0005\u01cb\u0000\u0000\u04a1"+
		"\u04a0\u0001\u0000\u0000\u0000\u04a1\u04a2\u0001\u0000\u0000\u0000\u04a2"+
		"a\u0001\u0000\u0000\u0000\u04a3\u04a4\u00059\u0000\u0000\u04a4\u04a8\u0005"+
		"\u00a7\u0000\u0000\u04a5\u04a6\u0003\u0132\u0099\u0000\u04a6\u04a7\u0005"+
		"\u01c3\u0000\u0000\u04a7\u04a9\u0001\u0000\u0000\u0000\u04a8\u04a5\u0001"+
		"\u0000\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000\u0000\u04a9\u04aa\u0001"+
		"\u0000\u0000\u0000\u04aa\u04ab\u0003\u014e\u00a7\u0000\u04ab\u04ac\u0005"+
		"\u01cb\u0000\u0000\u04acc\u0001\u0000\u0000\u0000\u04ad\u04ae\u00059\u0000"+
		"\u0000\u04ae\u04b1\u0005\u00aa\u0000\u0000\u04af\u04b0\u0005X\u0000\u0000"+
		"\u04b0\u04b2\u0005A\u0000\u0000\u04b1\u04af\u0001\u0000\u0000\u0000\u04b1"+
		"\u04b2\u0001\u0000\u0000\u0000\u04b2\u04b3\u0001\u0000\u0000\u0000\u04b3"+
		"\u04b5\u0003\u0132\u0099\u0000\u04b4\u04b6\u0005\u01cb\u0000\u0000\u04b5"+
		"\u04b4\u0001\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6"+
		"e\u0001\u0000\u0000\u0000\u04b7\u04b8\u00059\u0000\u0000\u04b8\u04bb\u0005"+
		"\u00c2\u0000\u0000\u04b9\u04ba\u0005X\u0000\u0000\u04ba\u04bc\u0005A\u0000"+
		"\u0000\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000"+
		"\u0000\u04bc\u04bd\u0001\u0000\u0000\u0000\u04bd\u04c2\u0003\u0134\u009a"+
		"\u0000\u04be\u04bf\u0005\u01ca\u0000\u0000\u04bf\u04c1\u0003\u0134\u009a"+
		"\u0000\u04c0\u04be\u0001\u0000\u0000\u0000\u04c1\u04c4\u0001\u0000\u0000"+
		"\u0000\u04c2\u04c0\u0001\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000\u0000"+
		"\u0000\u04c3\u04c6\u0001\u0000\u0000\u0000\u04c4\u04c2\u0001\u0000\u0000"+
		"\u0000\u04c5\u04c7\u0005\u01cb\u0000\u0000\u04c6\u04c5\u0001\u0000\u0000"+
		"\u0000\u04c6\u04c7\u0001\u0000\u0000\u0000\u04c7g\u0001\u0000\u0000\u0000"+
		"\u04c8\u04c9\u0005%\u0000\u0000\u04c9\u04ca\u0005\u019b\u0000\u0000\u04ca"+
		"\u04cb\u0003\u0134\u009a\u0000\u04cb\u04cc\u0005M\u0000\u0000\u04cc\u04cd"+
		"\u0003\u016c\u00b6\u0000\u04cd\u04ce\u0003\u0148\u00a4\u0000\u04cei\u0001"+
		"\u0000\u0000\u0000\u04cf\u04d0\u00059\u0000\u0000\u04d0\u04d3\u0005\u019b"+
		"\u0000\u0000\u04d1\u04d2\u0005X\u0000\u0000\u04d2\u04d4\u0005A\u0000\u0000"+
		"\u04d3\u04d1\u0001\u0000\u0000\u0000\u04d3\u04d4\u0001\u0000\u0000\u0000"+
		"\u04d4\u04d5\u0001\u0000\u0000\u0000\u04d5\u04d6\u0003\u0134\u009a\u0000"+
		"\u04d6k\u0001\u0000\u0000\u0000\u04d7\u04da\u0003n7\u0000\u04d8\u04da"+
		"\u0003p8\u0000\u04d9\u04d7\u0001\u0000\u0000\u0000\u04d9\u04d8\u0001\u0000"+
		"\u0000\u0000\u04dam\u0001\u0000\u0000\u0000\u04db\u04dc\u0005x\u0000\u0000"+
		"\u04dc\u04dd\u0005\u01c8\u0000\u0000\u04dd\u04de\u0003\u014e\u00a7\u0000"+
		"\u04de\u04df\u0005\u01ca\u0000\u0000\u04df\u04e0\u0005\u01b3\u0000\u0000"+
		"\u04e0\u04e1\u0005\u01c9\u0000\u0000\u04e1o\u0001\u0000\u0000\u0000\u04e2"+
		"\u04e3\u0005w\u0000\u0000\u04e3\u04e4\u0005\u01c8\u0000\u0000\u04e4\u04e5"+
		"\u0005\u01b3\u0000\u0000\u04e5\u04e6\u0005\u01ca\u0000\u0000\u04e6\u04e7"+
		"\u0005\u01b3\u0000\u0000\u04e7\u04e8\u0005\u01c9\u0000\u0000\u04e8\u04ea"+
		"\u0005\u01c3\u0000\u0000\u04e9\u04eb\u0003\u014e\u00a7\u0000\u04ea\u04e9"+
		"\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u04ec"+
		"\u0001\u0000\u0000\u0000\u04ec\u04ee\u0005\u01c3\u0000\u0000\u04ed\u04ef"+
		"\u0003\u014e\u00a7\u0000\u04ee\u04ed\u0001\u0000\u0000\u0000\u04ee\u04ef"+
		"\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001\u0000\u0000\u0000\u04f0\u04f1"+
		"\u0005\u01c3\u0000\u0000\u04f1\u04f2\u0003\u014e\u00a7\u0000\u04f2q\u0001"+
		"\u0000\u0000\u0000\u04f3\u04f4\u00050\u0000\u0000\u04f4\u04f6\u0005\u01b0"+
		"\u0000\u0000\u04f5\u04f7\u0005\u0007\u0000\u0000\u04f6\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u04f8\u0001\u0000"+
		"\u0000\u0000\u04f8\u04fa\u0003\u008cF\u0000\u04f9\u04fb\u0005\u01cb\u0000"+
		"\u0000\u04fa\u04f9\u0001\u0000\u0000\u0000\u04fa\u04fb\u0001\u0000\u0000"+
		"\u0000\u04fb\u0509\u0001\u0000\u0000\u0000\u04fc\u04fd\u00050\u0000\u0000"+
		"\u04fd\u0502\u0003\u008aE\u0000\u04fe\u04ff\u0005\u01ca\u0000\u0000\u04ff"+
		"\u0501\u0003\u008aE\u0000\u0500\u04fe\u0001\u0000\u0000\u0000\u0501\u0504"+
		"\u0001\u0000\u0000\u0000\u0502\u0500\u0001\u0000\u0000\u0000\u0502\u0503"+
		"\u0001\u0000\u0000\u0000\u0503\u0506\u0001\u0000\u0000\u0000\u0504\u0502"+
		"\u0001\u0000\u0000\u0000\u0505\u0507\u0005\u01cb\u0000\u0000\u0506\u0505"+
		"\u0001\u0000\u0000\u0000\u0506\u0507\u0001\u0000\u0000\u0000\u0507\u0509"+
		"\u0001\u0000\u0000\u0000\u0508\u04f3\u0001\u0000\u0000\u0000\u0508\u04fc"+
		"\u0001\u0000\u0000\u0000\u0509s\u0001\u0000\u0000\u0000\u050a\u050c\u0005"+
		"\u0018\u0000\u0000\u050b\u050d\u0005\u011a\u0000\u0000\u050c\u050b\u0001"+
		"\u0000\u0000\u0000\u050c\u050d\u0001\u0000\u0000\u0000\u050d\u050e\u0001"+
		"\u0000\u0000\u0000\u050e\u0510\u0003\u013e\u009f\u0000\u050f\u0511\u0005"+
		"\u01cb\u0000\u0000\u0510\u050f\u0001\u0000\u0000\u0000\u0510\u0511\u0001"+
		"\u0000\u0000\u0000\u0511\u0525\u0001\u0000\u0000\u0000\u0512\u0514\u0005"+
		"/\u0000\u0000\u0513\u0515\u0005\u011a\u0000\u0000\u0514\u0513\u0001\u0000"+
		"\u0000\u0000\u0514\u0515\u0001\u0000\u0000\u0000\u0515\u0516\u0001\u0000"+
		"\u0000\u0000\u0516\u0518\u0003\u013e\u009f\u0000\u0517\u0519\u0005\u01cb"+
		"\u0000\u0000\u0518\u0517\u0001\u0000\u0000\u0000\u0518\u0519\u0001\u0000"+
		"\u0000\u0000\u0519\u0525\u0001\u0000\u0000\u0000\u051a\u0525\u0003\u009c"+
		"N\u0000\u051b\u0525\u0003\u00a0P\u0000\u051c\u051e\u0005v\u0000\u0000"+
		"\u051d\u051f\u0005\u011a\u0000\u0000\u051e\u051d\u0001\u0000\u0000\u0000"+
		"\u051e\u051f\u0001\u0000\u0000\u0000\u051f\u0520\u0001\u0000\u0000\u0000"+
		"\u0520\u0522\u0003\u013e\u009f\u0000\u0521\u0523\u0005\u01cb\u0000\u0000"+
		"\u0522\u0521\u0001\u0000\u0000\u0000\u0522\u0523\u0001\u0000\u0000\u0000"+
		"\u0523\u0525\u0001\u0000\u0000\u0000\u0524\u050a\u0001\u0000\u0000\u0000"+
		"\u0524\u0512\u0001\u0000\u0000\u0000\u0524\u051a\u0001\u0000\u0000\u0000"+
		"\u0524\u051b\u0001\u0000\u0000\u0000\u0524\u051c\u0001\u0000\u0000\u0000"+
		"\u0525u\u0001\u0000\u0000\u0000\u0526\u0529\u0005@\u0000\u0000\u0527\u0528"+
		"\u0005\u01b0\u0000\u0000\u0528\u052a\u0005\u01b7\u0000\u0000\u0529\u0527"+
		"\u0001\u0000\u0000\u0000\u0529\u052a\u0001\u0000\u0000\u0000\u052a\u052b"+
		"\u0001\u0000\u0000\u0000\u052b\u0534\u0003\u0136\u009b\u0000\u052c\u0531"+
		"\u0003x<\u0000\u052d\u052e\u0005\u01ca\u0000\u0000\u052e\u0530\u0003x"+
		"<\u0000\u052f\u052d\u0001\u0000\u0000\u0000\u0530\u0533\u0001\u0000\u0000"+
		"\u0000\u0531\u052f\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000"+
		"\u0000\u0532\u0535\u0001\u0000\u0000\u0000\u0533\u0531\u0001\u0000\u0000"+
		"\u0000\u0534\u052c\u0001\u0000\u0000\u0000\u0534\u0535\u0001\u0000\u0000"+
		"\u0000\u0535\u0537\u0001\u0000\u0000\u0000\u0536\u0538\u0005\u01cb\u0000"+
		"\u0000\u0537\u0536\u0001\u0000\u0000\u0000\u0537\u0538\u0001\u0000\u0000"+
		"\u0000\u0538\u0550\u0001\u0000\u0000\u0000\u0539\u053a\u0005@\u0000\u0000"+
		"\u053a\u053b\u0005\u01c8\u0000\u0000\u053b\u0540\u0003z=\u0000\u053c\u053d"+
		"\u0005\u01d0\u0000\u0000\u053d\u053f\u0003z=\u0000\u053e\u053c\u0001\u0000"+
		"\u0000\u0000\u053f\u0542\u0001\u0000\u0000\u0000\u0540\u053e\u0001\u0000"+
		"\u0000\u0000\u0540\u0541\u0001\u0000\u0000\u0000\u0541\u0543\u0001\u0000"+
		"\u0000\u0000\u0542\u0540\u0001\u0000\u0000\u0000\u0543\u054a\u0005\u01c9"+
		"\u0000\u0000\u0544\u0546\u0005\u0007\u0000\u0000\u0545\u0544\u0001\u0000"+
		"\u0000\u0000\u0545\u0546\u0001\u0000\u0000\u0000\u0546\u0547\u0001\u0000"+
		"\u0000\u0000\u0547\u0548\u0007\u0014\u0000\u0000\u0548\u0549\u0005\u01b7"+
		"\u0000\u0000\u0549\u054b\u0005\u01b3\u0000\u0000\u054a\u0545\u0001\u0000"+
		"\u0000\u0000\u054a\u054b\u0001\u0000\u0000\u0000\u054b\u054d\u0001\u0000"+
		"\u0000\u0000\u054c\u054e\u0005\u01cb\u0000\u0000\u054d\u054c\u0001\u0000"+
		"\u0000\u0000\u054d\u054e\u0001\u0000\u0000\u0000\u054e\u0550\u0001\u0000"+
		"\u0000\u0000\u054f\u0526\u0001\u0000\u0000\u0000\u054f\u0539\u0001\u0000"+
		"\u0000\u0000\u0550w\u0001\u0000\u0000\u0000\u0551\u0552\u0005\u01b0\u0000"+
		"\u0000\u0552\u0554\u0005\u01b7\u0000\u0000\u0553\u0551\u0001\u0000\u0000"+
		"\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u055e\u0001\u0000\u0000"+
		"\u0000\u0555\u0558\u0003\u00a4R\u0000\u0556\u0558\u0003\u014e\u00a7\u0000"+
		"\u0557\u0555\u0001\u0000\u0000\u0000\u0557\u0556\u0001\u0000\u0000\u0000"+
		"\u0558\u055a\u0001\u0000\u0000\u0000\u0559\u055b\u0007\u0015\u0000\u0000"+
		"\u055a\u0559\u0001\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000"+
		"\u055b\u055f\u0001\u0000\u0000\u0000\u055c\u055f\u00051\u0000\u0000\u055d"+
		"\u055f\u0005o\u0000\u0000\u055e\u0557\u0001\u0000\u0000\u0000\u055e\u055c"+
		"\u0001\u0000\u0000\u0000\u055e\u055d\u0001\u0000\u0000\u0000\u055fy\u0001"+
		"\u0000\u0000\u0000\u0560\u0561\u0007\u0001\u0000\u0000\u0561{\u0001\u0000"+
		"\u0000\u0000\u0562\u0564\u0003\u0088D\u0000\u0563\u0565\u0005\u01cb\u0000"+
		"\u0000\u0564\u0563\u0001\u0000\u0000\u0000\u0564\u0565\u0001\u0000\u0000"+
		"\u0000\u0565\u0593\u0001\u0000\u0000\u0000\u0566\u0572\u0005Q\u0000\u0000"+
		"\u0567\u0569\u0005\u0003\u0000\u0000\u0568\u056a\u0005\u0162\u0000\u0000"+
		"\u0569\u0568\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000\u0000\u0000"+
		"\u056a\u0573\u0001\u0000\u0000\u0000\u056b\u0570\u0003~?\u0000\u056c\u056d"+
		"\u0005\u01c8\u0000\u0000\u056d\u056e\u0003\u013c\u009e\u0000\u056e\u056f"+
		"\u0005\u01c9\u0000\u0000\u056f\u0571\u0001\u0000\u0000\u0000\u0570\u056c"+
		"\u0001\u0000\u0000\u0000\u0570\u0571\u0001\u0000\u0000\u0000\u0571\u0573"+
		"\u0001\u0000\u0000\u0000\u0572\u0567\u0001\u0000\u0000\u0000\u0572\u056b"+
		"\u0001\u0000\u0000\u0000\u0573\u0576\u0001\u0000\u0000\u0000\u0574\u0575"+
		"\u0005u\u0000\u0000\u0575\u0577\u0003\u0132\u0099\u0000\u0576\u0574\u0001"+
		"\u0000\u0000\u0000\u0576\u0577\u0001\u0000\u0000\u0000\u0577\u0578\u0001"+
		"\u0000\u0000\u0000\u0578\u0579\u0005\u00ae\u0000\u0000\u0579\u057d\u0003"+
		"\u014e\u00a7\u0000\u057a\u057b\u0005\u00c7\u0000\u0000\u057b\u057c\u0005"+
		"Q\u0000\u0000\u057c\u057e\u0005{\u0000\u0000\u057d\u057a\u0001\u0000\u0000"+
		"\u0000\u057d\u057e\u0001\u0000\u0000\u0000\u057e\u0581\u0001\u0000\u0000"+
		"\u0000\u057f\u0580\u0005\u0007\u0000\u0000\u0580\u0582\u0003\u014e\u00a7"+
		"\u0000\u0581\u057f\u0001\u0000\u0000\u0000\u0581\u0582\u0001\u0000\u0000"+
		"\u0000\u0582\u0584\u0001\u0000\u0000\u0000\u0583\u0585\u0005\u01cb\u0000"+
		"\u0000\u0584\u0583\u0001\u0000\u0000\u0000\u0584\u0585\u0001\u0000\u0000"+
		"\u0000\u0585\u0593\u0001\u0000\u0000\u0000\u0586\u058d\u0005\u0094\u0000"+
		"\u0000\u0587\u0588\u0005\u01c8\u0000\u0000\u0588\u0589\u0005\u00c7\u0000"+
		"\u0000\u0589\u058a\u0005\u00ed\u0000\u0000\u058a\u058b\u0005\u01b7\u0000"+
		"\u0000\u058b\u058c\u0005\u01b0\u0000\u0000\u058c\u058e\u0005\u01c9\u0000"+
		"\u0000\u058d\u0587\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000\u0000"+
		"\u0000\u058e\u0590\u0001\u0000\u0000\u0000\u058f\u0591\u0005\u01cb\u0000"+
		"\u0000\u0590\u058f\u0001\u0000\u0000\u0000\u0590\u0591\u0001\u0000\u0000"+
		"\u0000\u0591\u0593\u0001\u0000\u0000\u0000\u0592\u0562\u0001\u0000\u0000"+
		"\u0000\u0592\u0566\u0001\u0000\u0000\u0000\u0592\u0586\u0001\u0000\u0000"+
		"\u0000\u0593}\u0001\u0000\u0000\u0000\u0594\u05af\u0005@\u0000\u0000\u0595"+
		"\u0596\u0005\u00c2\u0000\u0000\u0596\u05af\u0003\u014e\u00a7\u0000\u0597"+
		"\u0598\u0005\u018e\u0000\u0000\u0598\u05af\u0003\u014e\u00a7\u0000\u0599"+
		"\u059b\u0005\u00ec\u0000\u0000\u059a\u059c\u0003\u014e\u00a7\u0000\u059b"+
		"\u059a\u0001\u0000\u0000\u0000\u059b\u059c\u0001\u0000\u0000\u0000\u059c"+
		"\u05af\u0001\u0000\u0000\u0000\u059d\u059e\u0005%\u0000\u0000\u059e\u05af"+
		"\u0007\u0016\u0000\u0000\u059f\u05af\u0005\u0180\u0000\u0000\u05a0\u05af"+
		"\u0005\u0124\u0000\u0000\u05a1\u05af\u0005\u009e\u0000\u0000\u05a2\u05af"+
		"\u0005\u008e\u0000\u0000\u05a3\u05af\u0005\\\u0000\u0000\u05a4\u05ac\u0005"+
		"\u0004\u0000\u0000\u05a5\u05a7\u0005\u0006\u0000\u0000\u05a6\u05a5\u0001"+
		"\u0000\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000\u0000\u05a7\u05aa\u0001"+
		"\u0000\u0000\u0000\u05a8\u05ab\u0003\u014e\u00a7\u0000\u05a9\u05ab\u0005"+
		"-\u0000\u0000\u05aa\u05a8\u0001\u0000\u0000\u0000\u05aa\u05a9\u0001\u0000"+
		"\u0000\u0000\u05ab\u05ad\u0001\u0000\u0000\u0000\u05ac\u05a6\u0001\u0000"+
		"\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000\u0000\u05ad\u05af\u0001\u0000"+
		"\u0000\u0000\u05ae\u0594\u0001\u0000\u0000\u0000\u05ae\u0595\u0001\u0000"+
		"\u0000\u0000\u05ae\u0597\u0001\u0000\u0000\u0000\u05ae\u0599\u0001\u0000"+
		"\u0000\u0000\u05ae\u059d\u0001\u0000\u0000\u0000\u05ae\u059f\u0001\u0000"+
		"\u0000\u0000\u05ae\u05a0\u0001\u0000\u0000\u0000\u05ae\u05a1\u0001\u0000"+
		"\u0000\u0000\u05ae\u05a2\u0001\u0000\u0000\u0000\u05ae\u05a3\u0001\u0000"+
		"\u0000\u0000\u05ae\u05a4\u0001\u0000\u0000\u0000\u05af\u007f\u0001\u0000"+
		"\u0000\u0000\u05b0\u05b1\u0005\u00a3\u0000\u0000\u05b1\u05b4\u0005\u01b0"+
		"\u0000\u0000\u05b2\u05b3\u0005\u01c3\u0000\u0000\u05b3\u05b5\u0003\u014e"+
		"\u00a7\u0000\u05b4\u05b2\u0001\u0000\u0000\u0000\u05b4\u05b5\u0001\u0000"+
		"\u0000\u0000\u05b5\u05b6\u0001\u0000\u0000\u0000\u05b6\u05b7\u0005\u01b7"+
		"\u0000\u0000\u05b7\u05b9\u0003\u00a6S\u0000\u05b8\u05ba\u0005\u01cb\u0000"+
		"\u0000\u05b9\u05b8\u0001\u0000\u0000\u0000\u05b9\u05ba\u0001\u0000\u0000"+
		"\u0000\u05ba\u05d8\u0001\u0000\u0000\u0000\u05bb\u05bc\u0005\u00a3\u0000"+
		"\u0000\u05bc\u05bd\u0005\u01b0\u0000\u0000\u05bd\u05be\u0003\u0154\u00aa"+
		"\u0000\u05be\u05c0\u0003\u00a6S\u0000\u05bf\u05c1\u0005\u01cb\u0000\u0000"+
		"\u05c0\u05bf\u0001\u0000\u0000\u0000\u05c0\u05c1\u0001\u0000\u0000\u0000"+
		"\u05c1\u05d8\u0001\u0000\u0000\u0000\u05c2\u05c3\u0005\u00a3\u0000\u0000"+
		"\u05c3\u05c4\u0005\u01b0\u0000\u0000\u05c4\u05c5\u0005\u01b7\u0000\u0000"+
		"\u05c5\u05c6\u0005,\u0000\u0000\u05c6\u05d1\u0003\u009eO\u0000\u05c7\u05cf"+
		"\u0005H\u0000\u0000\u05c8\u05c9\u0005\u008b\u0000\u0000\u05c9\u05d0\u0005"+
		"\u0154\u0000\u0000\u05ca\u05cd\u0005\u00bb\u0000\u0000\u05cb\u05cc\u0005"+
		"r\u0000\u0000\u05cc\u05ce\u0003\u013c\u009e\u0000\u05cd\u05cb\u0001\u0000"+
		"\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05d0\u0001\u0000"+
		"\u0000\u0000\u05cf\u05c8\u0001\u0000\u0000\u0000\u05cf\u05ca\u0001\u0000"+
		"\u0000\u0000\u05d0\u05d2\u0001\u0000\u0000\u0000\u05d1\u05c7\u0001\u0000"+
		"\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d4\u0001\u0000"+
		"\u0000\u0000\u05d3\u05d5\u0005\u01cb\u0000\u0000\u05d4\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d4\u05d5\u0001\u0000\u0000\u0000\u05d5\u05d8\u0001\u0000"+
		"\u0000\u0000\u05d6\u05d8\u0003\u00a2Q\u0000\u05d7\u05b0\u0001\u0000\u0000"+
		"\u0000\u05d7\u05bb\u0001\u0000\u0000\u0000\u05d7\u05c2\u0001\u0000\u0000"+
		"\u0000\u05d7\u05d6\u0001\u0000\u0000\u0000\u05d8\u0081\u0001\u0000\u0000"+
		"\u0000\u05d9\u05da\u0005\u000b\u0000\u0000\u05da\u05db\u00057\u0000\u0000"+
		"\u05db\u05de\u0007\u0017\u0000\u0000\u05dc\u05df\u0003\u014e\u00a7\u0000"+
		"\u05dd\u05df\u0005\u01b0\u0000\u0000\u05de\u05dc\u0001\u0000\u0000\u0000"+
		"\u05de\u05dd\u0001\u0000\u0000\u0000\u05de\u05df\u0001\u0000\u0000\u0000"+
		"\u05df\u05e1\u0001\u0000\u0000\u0000\u05e0\u05e2\u0005\u01cb\u0000\u0000"+
		"\u05e1\u05e0\u0001\u0000\u0000\u0000\u05e1\u05e2\u0001\u0000\u0000\u0000"+
		"\u05e2\u0627\u0001\u0000\u0000\u0000\u05e3\u05e4\u0005\u000b\u0000\u0000"+
		"\u05e4\u05ee\u0007\u0017\u0000\u0000\u05e5\u05e8\u0003\u014e\u00a7\u0000"+
		"\u05e6\u05e8\u0005\u01b0\u0000\u0000\u05e7\u05e5\u0001\u0000\u0000\u0000"+
		"\u05e7\u05e6\u0001\u0000\u0000\u0000\u05e8\u05ec\u0001\u0000\u0000\u0000"+
		"\u05e9\u05ea\u0005\u00c7\u0000\u0000\u05ea\u05eb\u0005\u0139\u0000\u0000"+
		"\u05eb\u05ed\u0005\u01b3\u0000\u0000\u05ec\u05e9\u0001\u0000\u0000\u0000"+
		"\u05ec\u05ed\u0001\u0000\u0000\u0000\u05ed\u05ef\u0001\u0000\u0000\u0000"+
		"\u05ee\u05e7\u0001\u0000\u0000\u0000\u05ee\u05ef\u0001\u0000\u0000\u0000"+
		"\u05ef\u05f1\u0001\u0000\u0000\u0000\u05f0\u05f2\u0005\u01cb\u0000\u0000"+
		"\u05f1\u05f0\u0001\u0000\u0000\u0000\u05f1\u05f2\u0001\u0000\u0000\u0000"+
		"\u05f2\u0627\u0001\u0000\u0000\u0000\u05f3\u05f4\u0005\u001d\u0000\u0000"+
		"\u05f4\u0601\u0007\u0017\u0000\u0000\u05f5\u05f8\u0003\u014e\u00a7\u0000"+
		"\u05f6\u05f8\u0005\u01b0\u0000\u0000\u05f7\u05f5\u0001\u0000\u0000\u0000"+
		"\u05f7\u05f6\u0001\u0000\u0000\u0000\u05f8\u05ff\u0001\u0000\u0000\u0000"+
		"\u05f9\u05fa\u0005\u00c7\u0000\u0000\u05fa\u05fb\u0005\u01c8\u0000\u0000"+
		"\u05fb\u05fc\u0005\u0100\u0000\u0000\u05fc\u05fd\u0005\u01b7\u0000\u0000"+
		"\u05fd\u05fe\u0007\t\u0000\u0000\u05fe\u0600\u0005\u01c9\u0000\u0000\u05ff"+
		"\u05f9\u0001\u0000\u0000\u0000\u05ff\u0600\u0001\u0000\u0000\u0000\u0600"+
		"\u0602\u0001\u0000\u0000\u0000\u0601\u05f7\u0001\u0000\u0000\u0000\u0601"+
		"\u0602\u0001\u0000\u0000\u0000\u0602\u0604\u0001\u0000\u0000\u0000\u0603"+
		"\u0605\u0005\u01cb\u0000\u0000\u0604\u0603\u0001\u0000\u0000\u0000\u0604"+
		"\u0605\u0001\u0000\u0000\u0000\u0605\u0627\u0001\u0000\u0000\u0000\u0606"+
		"\u0608\u0005\u001d\u0000\u0000\u0607\u0609\u0005\u01a6\u0000\u0000\u0608"+
		"\u0607\u0001\u0000\u0000\u0000\u0608\u0609\u0001\u0000\u0000\u0000\u0609"+
		"\u060b\u0001\u0000\u0000\u0000\u060a\u060c\u0005\u01cb\u0000\u0000\u060b"+
		"\u060a\u0001\u0000\u0000\u0000\u060b\u060c\u0001\u0000\u0000\u0000\u060c"+
		"\u0627\u0001\u0000\u0000\u0000\u060d\u060e\u0005\u0097\u0000\u0000\u060e"+
		"\u0611\u0007\u0017\u0000\u0000\u060f\u0612\u0003\u014e\u00a7\u0000\u0610"+
		"\u0612\u0005\u01b0\u0000\u0000\u0611\u060f\u0001\u0000\u0000\u0000\u0611"+
		"\u0610\u0001\u0000\u0000\u0000\u0611\u0612\u0001\u0000\u0000\u0000\u0612"+
		"\u0614\u0001\u0000\u0000\u0000\u0613\u0615\u0005\u01cb\u0000\u0000\u0614"+
		"\u0613\u0001\u0000\u0000\u0000\u0614\u0615\u0001\u0000\u0000\u0000\u0615"+
		"\u0627\u0001\u0000\u0000\u0000\u0616\u0618\u0005\u0097\u0000\u0000\u0617"+
		"\u0619\u0005\u01a6\u0000\u0000\u0618\u0617\u0001\u0000\u0000\u0000\u0618"+
		"\u0619\u0001\u0000\u0000\u0000\u0619\u061b\u0001\u0000\u0000\u0000\u061a"+
		"\u061c\u0005\u01cb\u0000\u0000\u061b\u061a\u0001\u0000\u0000\u0000\u061b"+
		"\u061c\u0001\u0000\u0000\u0000\u061c\u0627\u0001\u0000\u0000\u0000\u061d"+
		"\u061e\u0005\u009b\u0000\u0000\u061e\u0621\u0007\u0017\u0000\u0000\u061f"+
		"\u0622\u0003\u014e\u00a7\u0000\u0620\u0622\u0005\u01b0\u0000\u0000\u0621"+
		"\u061f\u0001\u0000\u0000\u0000\u0621\u0620\u0001\u0000\u0000\u0000\u0621"+
		"\u0622\u0001\u0000\u0000\u0000\u0622\u0624\u0001\u0000\u0000\u0000\u0623"+
		"\u0625\u0005\u01cb\u0000\u0000\u0624\u0623\u0001\u0000\u0000\u0000\u0624"+
		"\u0625\u0001\u0000\u0000\u0000\u0625\u0627\u0001\u0000\u0000\u0000\u0626"+
		"\u05d9\u0001\u0000\u0000\u0000\u0626\u05e3\u0001\u0000\u0000\u0000\u0626"+
		"\u05f3\u0001\u0000\u0000\u0000\u0626\u0606\u0001\u0000\u0000\u0000\u0626"+
		"\u060d\u0001\u0000\u0000\u0000\u0626\u0616\u0001\u0000\u0000\u0000\u0626"+
		"\u061d\u0001\u0000\u0000\u0000\u0627\u0083\u0001\u0000\u0000\u0000\u0628"+
		"\u062a\u0005\u011b\u0000\u0000\u0629\u062b\u0005\u01b1\u0000\u0000\u062a"+
		"\u0629\u0001\u0000\u0000\u0000\u062a\u062b\u0001\u0000\u0000\u0000\u062b"+
		"\u0085\u0001\u0000\u0000\u0000\u062c\u062d\u0005\u00bd\u0000\u0000\u062d"+
		"\u062f\u0003\u014e\u00a7\u0000\u062e\u0630\u0005\u01cb\u0000\u0000\u062f"+
		"\u062e\u0001\u0000\u0000\u0000\u062f\u0630\u0001\u0000\u0000\u0000\u0630"+
		"\u0087\u0001\u0000\u0000\u0000\u0631\u0632\u0005@\u0000\u0000\u0632\u0633"+
		"\u0005\u0007\u0000\u0000\u0633\u0634\u0007\u0018\u0000\u0000\u0634\u0089"+
		"\u0001\u0000\u0000\u0000\u0635\u0637\u0005\u01b0\u0000\u0000\u0636\u0638"+
		"\u0005\u0007\u0000\u0000\u0637\u0636\u0001\u0000\u0000\u0000\u0637\u0638"+
		"\u0001\u0000\u0000\u0000\u0638\u0639\u0001\u0000\u0000\u0000\u0639\u063c"+
		"\u0003\u016c\u00b6\u0000\u063a\u063b\u0005\u01b7\u0000\u0000\u063b\u063d"+
		"\u0003\u00a6S\u0000\u063c\u063a\u0001\u0000\u0000\u0000\u063c\u063d\u0001"+
		"\u0000\u0000\u0000\u063d\u008b\u0001\u0000\u0000\u0000\u063e\u063f\u0005"+
		"\u00aa\u0000\u0000\u063f\u0640\u0005\u01c8\u0000\u0000\u0640\u0641\u0003"+
		"\u008eG\u0000\u0641\u0642\u0005\u01c9\u0000\u0000\u0642\u008d\u0001\u0000"+
		"\u0000\u0000\u0643\u064a\u0003\u0090H\u0000\u0644\u0646\u0005\u01ca\u0000"+
		"\u0000\u0645\u0644\u0001\u0000\u0000\u0000\u0645\u0646\u0001\u0000\u0000"+
		"\u0000\u0646\u0647\u0001\u0000\u0000\u0000\u0647\u0649\u0003\u0090H\u0000"+
		"\u0648\u0645\u0001\u0000\u0000\u0000\u0649\u064c\u0001\u0000\u0000\u0000"+
		"\u064a\u0648\u0001\u0000\u0000\u0000\u064a\u064b\u0001\u0000\u0000\u0000"+
		"\u064b\u008f\u0001\u0000\u0000\u0000\u064c\u064a\u0001\u0000\u0000\u0000"+
		"\u064d\u0650\u0003\u0092I\u0000\u064e\u0650\u0003\u0096K\u0000\u064f\u064d"+
		"\u0001\u0000\u0000\u0000\u064f\u064e\u0001\u0000\u0000\u0000\u0650\u0091"+
		"\u0001\u0000\u0000\u0000\u0651\u0655\u0003\u014e\u00a7\u0000\u0652\u0656"+
		"\u0003\u016c\u00b6\u0000\u0653\u0654\u0005\u0007\u0000\u0000\u0654\u0656"+
		"\u0003\u00a6S\u0000\u0655\u0652\u0001\u0000\u0000\u0000\u0655\u0653\u0001"+
		"\u0000\u0000\u0000\u0656\u0659\u0001\u0000\u0000\u0000\u0657\u0658\u0005"+
		"\u001b\u0000\u0000\u0658\u065a\u0003\u014e\u00a7\u0000\u0659\u0657\u0001"+
		"\u0000\u0000\u0000\u0659\u065a\u0001\u0000\u0000\u0000\u065a\u065c\u0001"+
		"\u0000\u0000\u0000\u065b\u065d\u0003\u0144\u00a2\u0000\u065c\u065b\u0001"+
		"\u0000\u0000\u0000\u065c\u065d\u0001\u0000\u0000\u0000\u065d\u0675\u0001"+
		"\u0000\u0000\u0000\u065e\u065f\u0005\u001f\u0000\u0000\u065f\u0661\u0003"+
		"\u014e\u00a7\u0000\u0660\u065e\u0001\u0000\u0000\u0000\u0660\u0661\u0001"+
		"\u0000\u0000\u0000\u0661\u0662\u0001\u0000\u0000\u0000\u0662\u0663\u0005"+
		"1\u0000\u0000\u0663\u0666\u0003\u00a8T\u0000\u0664\u0665\u0005\u00c7\u0000"+
		"\u0000\u0665\u0667\u0005\u00bf\u0000\u0000\u0666\u0664\u0001\u0000\u0000"+
		"\u0000\u0666\u0667\u0001\u0000\u0000\u0000\u0667\u0676\u0001\u0000\u0000"+
		"\u0000\u0668\u066e\u0005T\u0000\u0000\u0669\u066a\u0005\u01c8\u0000\u0000"+
		"\u066a\u066b\u0005\u01b1\u0000\u0000\u066b\u066c\u0005\u01ca\u0000\u0000"+
		"\u066c\u066d\u0005\u01b1\u0000\u0000\u066d\u066f\u0005\u01c9\u0000\u0000"+
		"\u066e\u0669\u0001\u0000\u0000\u0000\u066e\u066f\u0001\u0000\u0000\u0000"+
		"\u066f\u0673\u0001\u0000\u0000\u0000\u0670\u0671\u0005n\u0000\u0000\u0671"+
		"\u0672\u0005H\u0000\u0000\u0672\u0674\u0005\u008f\u0000\u0000\u0673\u0670"+
		"\u0001\u0000\u0000\u0000\u0673\u0674\u0001\u0000\u0000\u0000\u0674\u0676"+
		"\u0001\u0000\u0000\u0000\u0675\u0660\u0001\u0000\u0000\u0000\u0675\u0668"+
		"\u0001\u0000\u0000\u0000\u0675\u0676\u0001\u0000\u0000\u0000\u0676\u0678"+
		"\u0001\u0000\u0000\u0000\u0677\u0679\u0005\u0099\u0000\u0000\u0678\u0677"+
		"\u0001\u0000\u0000\u0000\u0678\u0679\u0001\u0000\u0000\u0000\u0679\u067d"+
		"\u0001\u0000\u0000\u0000\u067a\u067c\u0003\u0094J\u0000\u067b\u067a\u0001"+
		"\u0000\u0000\u0000\u067c\u067f\u0001\u0000\u0000\u0000\u067d\u067b\u0001"+
		"\u0000\u0000\u0000\u067d\u067e\u0001\u0000\u0000\u0000\u067e\u0093\u0001"+
		"\u0000\u0000\u0000\u067f\u067d\u0001\u0000\u0000\u0000\u0680\u0681\u0005"+
		"\u001f\u0000\u0000\u0681\u0683\u0003\u014e\u00a7\u0000\u0682\u0680\u0001"+
		"\u0000\u0000\u0000\u0682\u0683\u0001\u0000\u0000\u0000\u0683\u0685\u0001"+
		"\u0000\u0000\u0000\u0684\u0686\u0003\u0144\u00a2\u0000\u0685\u0684\u0001"+
		"\u0000\u0000\u0000\u0685\u0686\u0001\u0000\u0000\u0000\u0686\u069c\u0001"+
		"\u0000\u0000\u0000\u0687\u0688\u0005\u0085\u0000\u0000\u0688\u068b\u0005"+
		"a\u0000\u0000\u0689\u068b\u0005\u00b9\u0000\u0000\u068a\u0687\u0001\u0000"+
		"\u0000\u0000\u068a\u0689\u0001\u0000\u0000\u0000\u068b\u068d\u0001\u0000"+
		"\u0000\u0000\u068c\u068e\u0003\u0142\u00a1\u0000\u068d\u068c\u0001\u0000"+
		"\u0000\u0000\u068d\u068e\u0001\u0000\u0000\u0000\u068e\u0690\u0001\u0000"+
		"\u0000\u0000\u068f\u0691\u0003\u0098L\u0000\u0690\u068f\u0001\u0000\u0000"+
		"\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u069d\u0001\u0000\u0000"+
		"\u0000\u0692\u0696\u0005\u0016\u0000\u0000\u0693\u0694\u0005n\u0000\u0000"+
		"\u0694\u0695\u0005H\u0000\u0000\u0695\u0697\u0005\u008f\u0000\u0000\u0696"+
		"\u0693\u0001\u0000\u0000\u0000\u0696\u0697\u0001\u0000\u0000\u0000\u0697"+
		"\u0698\u0001\u0000\u0000\u0000\u0698\u0699\u0005\u01c8\u0000\u0000\u0699"+
		"\u069a\u0003\u00b4Z\u0000\u069a\u069b\u0005\u01c9\u0000\u0000\u069b\u069d"+
		"\u0001\u0000\u0000\u0000\u069c\u068a\u0001\u0000\u0000\u0000\u069c\u0692"+
		"\u0001\u0000\u0000\u0000\u069d\u0095\u0001\u0000\u0000\u0000\u069e\u069f"+
		"\u0005\u001f\u0000\u0000\u069f\u06a1\u0003\u014e\u00a7\u0000\u06a0\u069e"+
		"\u0001\u0000\u0000\u0000\u06a0\u06a1\u0001\u0000\u0000\u0000\u06a1\u06c1"+
		"\u0001\u0000\u0000\u0000\u06a2\u06a3\u0005\u0085\u0000\u0000\u06a3\u06a6"+
		"\u0005a\u0000\u0000\u06a4\u06a6\u0005\u00b9\u0000\u0000\u06a5\u06a2\u0001"+
		"\u0000\u0000\u0000\u06a5\u06a4\u0001\u0000\u0000\u0000\u06a6\u06a8\u0001"+
		"\u0000\u0000\u0000\u06a7\u06a9\u0003\u0142\u00a1\u0000\u06a8\u06a7\u0001"+
		"\u0000\u0000\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9\u06aa\u0001"+
		"\u0000\u0000\u0000\u06aa\u06ab\u0005\u01c8\u0000\u0000\u06ab\u06ad\u0003"+
		"\u013c\u009e\u0000\u06ac\u06ae\u0007\u0005\u0000\u0000\u06ad\u06ac\u0001"+
		"\u0000\u0000\u0000\u06ad\u06ae\u0001\u0000\u0000\u0000\u06ae\u06af\u0001"+
		"\u0000\u0000\u0000\u06af\u06b1\u0005\u01c9\u0000\u0000\u06b0\u06b2\u0003"+
		"\u0098L\u0000\u06b1\u06b0\u0001\u0000\u0000\u0000\u06b1\u06b2\u0001\u0000"+
		"\u0000\u0000\u06b2\u06b5\u0001\u0000\u0000\u0000\u06b3\u06b4\u0005u\u0000"+
		"\u0000\u06b4\u06b6\u0003\u014e\u00a7\u0000\u06b5\u06b3\u0001\u0000\u0000"+
		"\u0000\u06b5\u06b6\u0001\u0000\u0000\u0000\u06b6\u06c2\u0001\u0000\u0000"+
		"\u0000\u06b7\u06bb\u0005\u0016\u0000\u0000\u06b8\u06b9\u0005n\u0000\u0000"+
		"\u06b9\u06ba\u0005H\u0000\u0000\u06ba\u06bc\u0005\u008f\u0000\u0000\u06bb"+
		"\u06b8\u0001\u0000\u0000\u0000\u06bb\u06bc\u0001\u0000\u0000\u0000\u06bc"+
		"\u06bd\u0001\u0000\u0000\u0000\u06bd\u06be\u0005\u01c8\u0000\u0000\u06be"+
		"\u06bf\u0003\u00b4Z\u0000\u06bf\u06c0\u0005\u01c9\u0000\u0000\u06c0\u06c2"+
		"\u0001\u0000\u0000\u0000\u06c1\u06a5\u0001\u0000\u0000\u0000\u06c1\u06b7"+
		"\u0001\u0000\u0000\u0000\u06c2\u0097\u0001\u0000\u0000\u0000\u06c3\u06c4"+
		"\u0005\u00c7\u0000\u0000\u06c4\u06c5\u0005\u01c8\u0000\u0000\u06c5\u06ca"+
		"\u0003\u009aM\u0000\u06c6\u06c7\u0005\u01ca\u0000\u0000\u06c7\u06c9\u0003"+
		"\u009aM\u0000\u06c8\u06c6\u0001\u0000\u0000\u0000\u06c9\u06cc\u0001\u0000"+
		"\u0000\u0000\u06ca\u06c8\u0001\u0000\u0000\u0000\u06ca\u06cb\u0001\u0000"+
		"\u0000\u0000\u06cb\u06cd\u0001\u0000\u0000\u0000\u06cc\u06ca\u0001\u0000"+
		"\u0000\u0000\u06cd\u06ce\u0005\u01c9\u0000\u0000\u06ce\u0099\u0001\u0000"+
		"\u0000\u0000\u06cf\u06d0\u0003\u0150\u00a8\u0000\u06d0\u06d4\u0005\u01b7"+
		"\u0000\u0000\u06d1\u06d5\u0003\u0150\u00a8\u0000\u06d2\u06d5\u0003\u0140"+
		"\u00a0\u0000\u06d3\u06d5\u0005\u01b1\u0000\u0000\u06d4\u06d1\u0001\u0000"+
		"\u0000\u0000\u06d4\u06d2\u0001\u0000\u0000\u0000\u06d4\u06d3\u0001\u0000"+
		"\u0000\u0000\u06d5\u009b\u0001\u0000\u0000\u0000\u06d6\u06d7\u00050\u0000"+
		"\u0000\u06d7\u06f7\u0003\u013e\u009f\u0000\u06d8\u06e2\u0005,\u0000\u0000"+
		"\u06d9\u06e0\u0003\u009eO\u0000\u06da\u06db\u0005H\u0000\u0000\u06db\u06de"+
		"\u0005\u00bb\u0000\u0000\u06dc\u06dd\u0005r\u0000\u0000\u06dd\u06df\u0003"+
		"\u013c\u009e\u0000\u06de\u06dc\u0001\u0000\u0000\u0000\u06de\u06df\u0001"+
		"\u0000\u0000\u0000\u06df\u06e1\u0001\u0000\u0000\u0000\u06e0\u06da\u0001"+
		"\u0000\u0000\u0000\u06e0\u06e1\u0001\u0000\u0000\u0000\u06e1\u06e3\u0001"+
		"\u0000\u0000\u0000\u06e2\u06d9\u0001\u0000\u0000\u0000\u06e2\u06e3\u0001"+
		"\u0000\u0000\u0000\u06e3\u06f8\u0001\u0000\u0000\u0000\u06e4\u06e6\u0005"+
		"\u0128\u0000\u0000\u06e5\u06e4\u0001\u0000\u0000\u0000\u06e5\u06e6\u0001"+
		"\u0000\u0000\u0000\u06e6\u06e8\u0001\u0000\u0000\u0000\u06e7\u06e9\u0005"+
		"\u017a\u0000\u0000\u06e8\u06e7\u0001\u0000\u0000\u0000\u06e8\u06e9\u0001"+
		"\u0000\u0000\u0000\u06e9\u06ea\u0001\u0000\u0000\u0000\u06ea\u06eb\u0005"+
		",\u0000\u0000\u06eb\u06ec\u0005H\u0000\u0000\u06ec\u06f5\u0003\u0018\f"+
		"\u0000\u06ed\u06f3\u0005H\u0000\u0000\u06ee\u06ef\u0005\u008b\u0000\u0000"+
		"\u06ef\u06f4\u0005\u0154\u0000\u0000\u06f0\u06f4\u0005\u00bb\u0000\u0000"+
		"\u06f1\u06f2\u0005r\u0000\u0000\u06f2\u06f4\u0003\u013c\u009e\u0000\u06f3"+
		"\u06ee\u0001\u0000\u0000\u0000\u06f3\u06f0\u0001\u0000\u0000\u0000\u06f3"+
		"\u06f1\u0001\u0000\u0000\u0000\u06f4\u06f6\u0001\u0000\u0000\u0000\u06f5"+
		"\u06ed\u0001\u0000\u0000\u0000\u06f5\u06f6\u0001\u0000\u0000\u0000\u06f6"+
		"\u06f8\u0001\u0000\u0000\u0000\u06f7\u06d8\u0001\u0000\u0000\u0000\u06f7"+
		"\u06e5\u0001\u0000\u0000\u0000\u06f8\u06fa\u0001\u0000\u0000\u0000\u06f9"+
		"\u06fb\u0005\u01cb\u0000\u0000\u06fa\u06f9\u0001\u0000\u0000\u0000\u06fa"+
		"\u06fb\u0001\u0000\u0000\u0000\u06fb\u009d\u0001\u0000\u0000\u0000\u06fc"+
		"\u06fe\u0007\u000b\u0000\u0000\u06fd\u06fc\u0001\u0000\u0000\u0000\u06fd"+
		"\u06fe\u0001\u0000\u0000\u0000\u06fe\u0700\u0001\u0000\u0000\u0000\u06ff"+
		"\u0701\u0007\u0019\u0000\u0000\u0700\u06ff\u0001\u0000\u0000\u0000\u0700"+
		"\u0701\u0001\u0000\u0000\u0000\u0701\u0703\u0001\u0000\u0000\u0000\u0702"+
		"\u0704\u0007\u001a\u0000\u0000\u0703\u0702\u0001\u0000\u0000\u0000\u0703"+
		"\u0704\u0001\u0000\u0000\u0000\u0704\u0706\u0001\u0000\u0000\u0000\u0705"+
		"\u0707\u0007\u001b\u0000\u0000\u0706\u0705\u0001\u0000\u0000\u0000\u0706"+
		"\u0707\u0001\u0000\u0000\u0000\u0707\u0709\u0001\u0000\u0000\u0000\u0708"+
		"\u070a\u0005\u019c\u0000\u0000\u0709\u0708\u0001\u0000\u0000\u0000\u0709"+
		"\u070a\u0001\u0000\u0000\u0000\u070a\u070b\u0001\u0000\u0000\u0000\u070b"+
		"\u070c\u0005H\u0000\u0000\u070c\u070d\u0003\u0018\f\u0000\u070d\u009f"+
		"\u0001\u0000\u0000\u0000\u070e\u0718\u0005D\u0000\u0000\u070f\u0716\u0005"+
		"j\u0000\u0000\u0710\u0716\u0005\u0161\u0000\u0000\u0711\u0716\u0005\u0112"+
		"\u0000\u0000\u0712\u0716\u0005\u0131\u0000\u0000\u0713\u0714\u0007\u001c"+
		"\u0000\u0000\u0714\u0716\u0003\u00a6S\u0000\u0715\u070f\u0001\u0000\u0000"+
		"\u0000\u0715\u0710\u0001\u0000\u0000\u0000\u0715\u0711\u0001\u0000\u0000"+
		"\u0000\u0715\u0712\u0001\u0000\u0000\u0000\u0715\u0713\u0001\u0000\u0000"+
		"\u0000\u0715\u0716\u0001\u0000\u0000\u0000\u0716\u0717\u0001\u0000\u0000"+
		"\u0000\u0717\u0719\u0005M\u0000\u0000\u0718\u0715\u0001\u0000\u0000\u0000"+
		"\u0718\u0719\u0001\u0000\u0000\u0000\u0719\u071b\u0001\u0000\u0000\u0000"+
		"\u071a\u071c\u0005\u011a\u0000\u0000\u071b\u071a\u0001\u0000\u0000\u0000"+
		"\u071b\u071c\u0001\u0000\u0000\u0000\u071c\u071d\u0001\u0000\u0000\u0000"+
		"\u071d\u0727\u0003\u013e\u009f\u0000\u071e\u071f\u0005^\u0000\u0000\u071f"+
		"\u0724\u0005\u01b0\u0000\u0000\u0720\u0721\u0005\u01ca\u0000\u0000\u0721"+
		"\u0723\u0005\u01b0\u0000\u0000\u0722\u0720\u0001\u0000\u0000\u0000\u0723"+
		"\u0726\u0001\u0000\u0000\u0000\u0724\u0722\u0001\u0000\u0000\u0000\u0724"+
		"\u0725\u0001\u0000\u0000\u0000\u0725\u0728\u0001\u0000\u0000\u0000\u0726"+
		"\u0724\u0001\u0000\u0000\u0000\u0727\u071e\u0001\u0000\u0000\u0000\u0727"+
		"\u0728\u0001\u0000\u0000\u0000\u0728\u072a\u0001\u0000\u0000\u0000\u0729"+
		"\u072b\u0005\u01cb\u0000\u0000\u072a\u0729\u0001\u0000\u0000\u0000\u072a"+
		"\u072b\u0001\u0000\u0000\u0000\u072b\u00a1\u0001\u0000\u0000\u0000\u072c"+
		"\u072d\u0005\u00a3\u0000\u0000\u072d\u0731\u0003\u014e\u00a7\u0000\u072e"+
		"\u0732\u0003\u014e\u00a7\u0000\u072f\u0732\u0003\u00a4R\u0000\u0730\u0732"+
		"\u0003\u0140\u00a0\u0000\u0731\u072e\u0001\u0000\u0000\u0000\u0731\u072f"+
		"\u0001\u0000\u0000\u0000\u0731\u0730\u0001\u0000\u0000\u0000\u0732\u0734"+
		"\u0001\u0000\u0000\u0000\u0733\u0735\u0005\u01cb\u0000\u0000\u0734\u0733"+
		"\u0001\u0000\u0000\u0000\u0734\u0735\u0001\u0000\u0000\u0000\u0735\u075c"+
		"\u0001\u0000\u0000\u0000\u0736\u0737\u0005\u00a3\u0000\u0000\u0737\u0738"+
		"\u0005\u00b1\u0000\u0000\u0738\u0739\u0005\u012a\u0000\u0000\u0739\u0742"+
		"\u0005\u0134\u0000\u0000\u073a\u073b\u0005\u008b\u0000\u0000\u073b\u0743"+
		"\u0005\u019e\u0000\u0000\u073c\u073d\u0005\u008b\u0000\u0000\u073d\u0743"+
		"\u0005\u00e8\u0000\u0000\u073e\u073f\u0005\u016f\u0000\u0000\u073f\u0743"+
		"\u0005\u008b\u0000\u0000\u0740\u0743\u0005\u0185\u0000\u0000\u0741\u0743"+
		"\u0005\u017e\u0000\u0000\u0742\u073a\u0001\u0000\u0000\u0000\u0742\u073c"+
		"\u0001\u0000\u0000\u0000\u0742\u073e\u0001\u0000\u0000\u0000\u0742\u0740"+
		"\u0001\u0000\u0000\u0000\u0742\u0741\u0001\u0000\u0000\u0000\u0743\u0745"+
		"\u0001\u0000\u0000\u0000\u0744\u0746\u0005\u01cb\u0000\u0000\u0745\u0744"+
		"\u0001\u0000\u0000\u0000\u0745\u0746\u0001\u0000\u0000\u0000\u0746\u075c"+
		"\u0001\u0000\u0000\u0000\u0747\u0748\u0005\u00a3\u0000\u0000\u0748\u0749"+
		"\u0005V\u0000\u0000\u0749\u074a\u0003\u0132\u0099\u0000\u074a\u074c\u0003"+
		"\u0140\u00a0\u0000\u074b\u074d\u0005\u01cb\u0000\u0000\u074c\u074b\u0001"+
		"\u0000\u0000\u0000\u074c\u074d\u0001\u0000\u0000\u0000\u074d\u075c\u0001"+
		"\u0000\u0000\u0000\u074e\u074f\u0005\u00a3\u0000\u0000\u074f\u0750\u0005"+
		"\u00ce\u0000\u0000\u0750\u075c\u0003\u0140\u00a0\u0000\u0751\u0752\u0005"+
		"\u00a3\u0000\u0000\u0752\u0753\u0005\u0163\u0000\u0000\u0753\u075c\u0003"+
		"\u0140\u00a0\u0000\u0754\u0755\u0005\u00a3\u0000\u0000\u0755\u0756\u0005"+
		"\u00d0\u0000\u0000\u0756\u075c\u0003\u0140\u00a0\u0000\u0757\u0758\u0005"+
		"\u00a3\u0000\u0000\u0758\u0759\u0005\u00a7\u0000\u0000\u0759\u075a\u0007"+
		"\u001d\u0000\u0000\u075a\u075c\u0003\u0140\u00a0\u0000\u075b\u072c\u0001"+
		"\u0000\u0000\u0000\u075b\u0736\u0001\u0000\u0000\u0000\u075b\u0747\u0001"+
		"\u0000\u0000\u0000\u075b\u074e\u0001\u0000\u0000\u0000\u075b\u0751\u0001"+
		"\u0000\u0000\u0000\u075b\u0754\u0001\u0000\u0000\u0000\u075b\u0757\u0001"+
		"\u0000\u0000\u0000\u075c\u00a3\u0001\u0000\u0000\u0000\u075d\u0760\u0003"+
		"\u014a\u00a5\u0000\u075e\u0760\u0005\u01b0\u0000\u0000\u075f\u075d\u0001"+
		"\u0000\u0000\u0000\u075f\u075e\u0001\u0000\u0000\u0000\u0760\u00a5\u0001"+
		"\u0000\u0000\u0000\u0761\u0762\u0006S\uffff\uffff\u0000\u0762\u0791\u0005"+
		"1\u0000\u0000\u0763\u0791\u0005o\u0000\u0000\u0764\u0791\u0005\u01b0\u0000"+
		"\u0000\u0765\u0791\u0003\u014a\u00a5\u0000\u0766\u0791\u0003\u00f6{\u0000"+
		"\u0767\u0768\u0005\u0013\u0000\u0000\u0768\u076a\u0003\u00a6S\u0000\u0769"+
		"\u076b\u0003\u00f8|\u0000\u076a\u0769\u0001\u0000\u0000\u0000\u076b\u076c"+
		"\u0001\u0000\u0000\u0000\u076c\u076a\u0001\u0000\u0000\u0000\u076c\u076d"+
		"\u0001\u0000\u0000\u0000\u076d\u0770\u0001\u0000\u0000\u0000\u076e\u076f"+
		"\u0005;\u0000\u0000\u076f\u0771\u0003\u00a6S\u0000\u0770\u076e\u0001\u0000"+
		"\u0000\u0000\u0770\u0771\u0001\u0000\u0000\u0000\u0771\u0772\u0001\u0000"+
		"\u0000\u0000\u0772\u0773\u0005<\u0000\u0000\u0773\u0791\u0001\u0000\u0000"+
		"\u0000\u0774\u0776\u0005\u0013\u0000\u0000\u0775\u0777\u0003\u00fa}\u0000"+
		"\u0776\u0775\u0001\u0000\u0000\u0000\u0777\u0778\u0001\u0000\u0000\u0000"+
		"\u0778\u0776\u0001\u0000\u0000\u0000\u0778\u0779\u0001\u0000\u0000\u0000"+
		"\u0779\u077c\u0001\u0000\u0000\u0000\u077a\u077b\u0005;\u0000\u0000\u077b"+
		"\u077d\u0003\u00a6S\u0000\u077c\u077a\u0001\u0000\u0000\u0000\u077c\u077d"+
		"\u0001\u0000\u0000\u0000\u077d\u077e\u0001\u0000\u0000\u0000\u077e\u077f"+
		"\u0005<\u0000\u0000\u077f\u0791\u0001\u0000\u0000\u0000\u0780\u0791\u0003"+
		"\u013a\u009d\u0000\u0781\u0782\u0005\u01c8\u0000\u0000\u0782\u0783\u0003"+
		"\u00a6S\u0000\u0783\u0784\u0005\u01c9\u0000\u0000\u0784\u0791\u0001\u0000"+
		"\u0000\u0000\u0785\u0786\u0005\u01c8\u0000\u0000\u0786\u0787\u0003\u00aa"+
		"U\u0000\u0787\u0788\u0005\u01c9\u0000\u0000\u0788\u0791\u0001\u0000\u0000"+
		"\u0000\u0789\u078a\u0005\u01d2\u0000\u0000\u078a\u0791\u0003\u00a6S\b"+
		"\u078b\u078c\u0007\u001e\u0000\u0000\u078c\u0791\u0003\u00a6S\u0006\u078d"+
		"\u0791\u0003\u011a\u008d\u0000\u078e\u0791\u0003\u0168\u00b4\u0000\u078f"+
		"\u0791\u0003\u016a\u00b5\u0000\u0790\u0761\u0001\u0000\u0000\u0000\u0790"+
		"\u0763\u0001\u0000\u0000\u0000\u0790\u0764\u0001\u0000\u0000\u0000\u0790"+
		"\u0765\u0001\u0000\u0000\u0000\u0790\u0766\u0001\u0000\u0000\u0000\u0790"+
		"\u0767\u0001\u0000\u0000\u0000\u0790\u0774\u0001\u0000\u0000\u0000\u0790"+
		"\u0780\u0001\u0000\u0000\u0000\u0790\u0781\u0001\u0000\u0000\u0000\u0790"+
		"\u0785\u0001\u0000\u0000\u0000\u0790\u0789\u0001\u0000\u0000\u0000\u0790"+
		"\u078b\u0001\u0000\u0000\u0000\u0790\u078d\u0001\u0000\u0000\u0000\u0790"+
		"\u078e\u0001\u0000\u0000\u0000\u0790\u078f\u0001\u0000\u0000\u0000\u0791"+
		"\u07a6\u0001\u0000\u0000\u0000\u0792\u0793\n\u000e\u0000\u0000\u0793\u0794"+
		"\u0005\u00d4\u0000\u0000\u0794\u0795\u0005\u0194\u0000\u0000\u0795\u0796"+
		"\u0005\u01a9\u0000\u0000\u0796\u07a5\u0003\u00a6S\u000f\u0797\u0798\n"+
		"\u0007\u0000\u0000\u0798\u0799\u0007\u001f\u0000\u0000\u0799\u07a5\u0003"+
		"\u00a6S\b\u079a\u079b\n\u0005\u0000\u0000\u079b\u079c\u0007 \u0000\u0000"+
		"\u079c\u07a5\u0003\u00a6S\u0006\u079d\u079e\n\u0004\u0000\u0000\u079e"+
		"\u079f\u0003\u0152\u00a9\u0000\u079f\u07a0\u0003\u00a6S\u0005\u07a0\u07a5"+
		"\u0001\u0000\u0000\u0000\u07a1\u07a2\n\u000f\u0000\u0000\u07a2\u07a3\u0005"+
		"\u001b\u0000\u0000\u07a3\u07a5\u0003\u014e\u00a7\u0000\u07a4\u0792\u0001"+
		"\u0000\u0000\u0000\u07a4\u0797\u0001\u0000\u0000\u0000\u07a4\u079a\u0001"+
		"\u0000\u0000\u0000\u07a4\u079d\u0001\u0000\u0000\u0000\u07a4\u07a1\u0001"+
		"\u0000\u0000\u0000\u07a5\u07a8\u0001\u0000\u0000\u0000\u07a6\u07a4\u0001"+
		"\u0000\u0000\u0000\u07a6\u07a7\u0001\u0000\u0000\u0000\u07a7\u00a7\u0001"+
		"\u0000\u0000\u0000\u07a8\u07a6\u0001\u0000\u0000\u0000\u07a9\u07b2\u0005"+
		"o\u0000\u0000\u07aa\u07b2\u0003\u014a\u00a5\u0000\u07ab\u07b2\u0003\u00f6"+
		"{\u0000\u07ac\u07b2\u0005\u01b0\u0000\u0000\u07ad\u07ae\u0005\u01c8\u0000"+
		"\u0000\u07ae\u07af\u0003\u00a8T\u0000\u07af\u07b0\u0005\u01c9\u0000\u0000"+
		"\u07b0\u07b2\u0001\u0000\u0000\u0000\u07b1\u07a9\u0001\u0000\u0000\u0000"+
		"\u07b1\u07aa\u0001\u0000\u0000\u0000\u07b1\u07ab\u0001\u0000\u0000\u0000"+
		"\u07b1\u07ac\u0001\u0000\u0000\u0000\u07b1\u07ad\u0001\u0000\u0000\u0000"+
		"\u07b2\u00a9\u0001\u0000\u0000\u0000\u07b3\u07b4\u0003\u0018\f\u0000\u07b4"+
		"\u00ab\u0001\u0000\u0000\u0000\u07b5\u07b8\u0005\u00c7\u0000\u0000\u07b6"+
		"\u07b7\u0005\u01a8\u0000\u0000\u07b7\u07b9\u0005\u01ca\u0000\u0000\u07b8"+
		"\u07b6\u0001\u0000\u0000\u0000\u07b8\u07b9\u0001\u0000\u0000\u0000\u07b9"+
		"\u07ba\u0001\u0000\u0000\u0000\u07ba\u07bf\u0003\u00aeW\u0000\u07bb\u07bc"+
		"\u0005\u01ca\u0000\u0000\u07bc\u07be\u0003\u00aeW\u0000\u07bd\u07bb\u0001"+
		"\u0000\u0000\u0000\u07be\u07c1\u0001\u0000\u0000\u0000\u07bf\u07bd\u0001"+
		"\u0000\u0000\u0000\u07bf\u07c0\u0001\u0000\u0000\u0000\u07c0\u00ad\u0001"+
		"\u0000\u0000\u0000\u07c1\u07bf\u0001\u0000\u0000\u0000\u07c2\u07c7\u0003"+
		"\u014e\u00a7\u0000\u07c3\u07c4\u0005\u01c8\u0000\u0000\u07c4\u07c5\u0003"+
		"\u013c\u009e\u0000\u07c5\u07c6\u0005\u01c9\u0000\u0000\u07c6\u07c8\u0001"+
		"\u0000\u0000\u0000\u07c7\u07c3\u0001\u0000\u0000\u0000\u07c7\u07c8\u0001"+
		"\u0000\u0000\u0000\u07c8\u07c9\u0001\u0000\u0000\u0000\u07c9\u07ca\u0005"+
		"\u0007\u0000\u0000\u07ca\u07cb\u0005\u01c8\u0000\u0000\u07cb\u07cc\u0003"+
		"\u0018\f\u0000\u07cc\u07cd\u0005\u01c9\u0000\u0000\u07cd\u00af\u0001\u0000"+
		"\u0000\u0000\u07ce\u07d1\u0003\u013a\u009d\u0000\u07cf\u07d1\u0005\u01b0"+
		"\u0000\u0000\u07d0\u07ce\u0001\u0000\u0000\u0000\u07d0\u07cf\u0001\u0000"+
		"\u0000\u0000\u07d1\u07d4\u0001\u0000\u0000\u0000\u07d2\u07d5\u0005\u01b7"+
		"\u0000\u0000\u07d3\u07d5\u0003\u0154\u00aa\u0000\u07d4\u07d2\u0001\u0000"+
		"\u0000\u0000\u07d4\u07d3\u0001\u0000\u0000\u0000\u07d5\u07d6\u0001\u0000"+
		"\u0000\u0000\u07d6\u07df\u0003\u00a6S\u0000\u07d7\u07d8\u0003\u014e\u00a7"+
		"\u0000\u07d8\u07d9\u0005\u01c3\u0000\u0000\u07d9\u07da\u0003\u014e\u00a7"+
		"\u0000\u07da\u07db\u0005\u01c8\u0000\u0000\u07db\u07dc\u0003\u010c\u0086"+
		"\u0000\u07dc\u07dd\u0005\u01c9\u0000\u0000";
	private static final String _serializedATNSegment1 =
		"\u07dd\u07df\u0001\u0000\u0000\u0000\u07de\u07d0\u0001\u0000\u0000\u0000"+
		"\u07de\u07d7\u0001\u0000\u0000\u0000\u07df\u00b1\u0001\u0000\u0000\u0000"+
		"\u07e0\u07e5\u0003\u00b4Z\u0000\u07e1\u07e2\u0005\u01ca\u0000\u0000\u07e2"+
		"\u07e4\u0003\u00b4Z\u0000\u07e3\u07e1\u0001\u0000\u0000\u0000\u07e4\u07e7"+
		"\u0001\u0000\u0000\u0000\u07e5\u07e3\u0001\u0000\u0000\u0000\u07e5\u07e6"+
		"\u0001\u0000\u0000\u0000\u07e6\u00b3\u0001\u0000\u0000\u0000\u07e7\u07e5"+
		"\u0001\u0000\u0000\u0000\u07e8\u07e9\u0006Z\uffff\uffff\u0000\u07e9\u07ea"+
		"\u0003\u00b6[\u0000\u07ea\u07f3\u0001\u0000\u0000\u0000\u07eb\u07ec\n"+
		"\u0003\u0000\u0000\u07ec\u07ed\u0005\u0005\u0000\u0000\u07ed\u07f2\u0003"+
		"\u00b4Z\u0004\u07ee\u07ef\n\u0002\u0000\u0000\u07ef\u07f0\u0005|\u0000"+
		"\u0000\u07f0\u07f2\u0003\u00b4Z\u0003\u07f1\u07eb\u0001\u0000\u0000\u0000"+
		"\u07f1\u07ee\u0001\u0000\u0000\u0000\u07f2\u07f5\u0001\u0000\u0000\u0000"+
		"\u07f3\u07f1\u0001\u0000\u0000\u0000\u07f3\u07f4\u0001\u0000\u0000\u0000"+
		"\u07f4\u00b5\u0001\u0000\u0000\u0000\u07f5\u07f3\u0001\u0000\u0000\u0000"+
		"\u07f6\u07f7\u0005n\u0000\u0000\u07f7\u0831\u0003\u00b6[\u0000\u07f8\u07f9"+
		"\u0005A\u0000\u0000\u07f9\u07fa\u0005\u01c8\u0000\u0000\u07fa\u07fb\u0003"+
		"\u00aaU\u0000\u07fb\u07fc\u0005\u01c9\u0000\u0000\u07fc\u0831\u0001\u0000"+
		"\u0000\u0000\u07fd\u07fe\u0003\u00a6S\u0000\u07fe\u07ff\u0003\u0152\u00a9"+
		"\u0000\u07ff\u0800\u0003\u00a6S\u0000\u0800\u0831\u0001\u0000\u0000\u0000"+
		"\u0801\u0802\u0003\u00a6S\u0000\u0802\u0803\u0003\u0152\u00a9\u0000\u0803"+
		"\u0804\u0007!\u0000\u0000\u0804\u0805\u0005\u01c8\u0000\u0000\u0805\u0806"+
		"\u0003\u00aaU\u0000\u0806\u0807\u0005\u01c9\u0000\u0000\u0807\u0831\u0001"+
		"\u0000\u0000\u0000\u0808\u080a\u0003\u00a6S\u0000\u0809\u080b\u0005n\u0000"+
		"\u0000\u080a\u0809\u0001\u0000\u0000\u0000\u080a\u080b\u0001\u0000\u0000"+
		"\u0000\u080b\u080c\u0001\u0000\u0000\u0000\u080c\u080d\u0005\f\u0000\u0000"+
		"\u080d\u080e\u0003\u00a6S\u0000\u080e\u080f\u0005\u0005\u0000\u0000\u080f"+
		"\u0810\u0003\u00a6S\u0000\u0810\u0831\u0001\u0000\u0000\u0000\u0811\u0813"+
		"\u0003\u00a6S\u0000\u0812\u0814\u0005n\u0000\u0000\u0813\u0812\u0001\u0000"+
		"\u0000\u0000\u0813\u0814\u0001\u0000\u0000\u0000\u0814\u0815\u0001\u0000"+
		"\u0000\u0000\u0815\u0816\u0005Y\u0000\u0000\u0816\u0819\u0005\u01c8\u0000"+
		"\u0000\u0817\u081a\u0003\u00aaU\u0000\u0818\u081a\u0003\u010c\u0086\u0000"+
		"\u0819\u0817\u0001\u0000\u0000\u0000\u0819\u0818\u0001\u0000\u0000\u0000"+
		"\u081a\u081b\u0001\u0000\u0000\u0000\u081b\u081c\u0005\u01c9\u0000\u0000"+
		"\u081c\u0831\u0001\u0000\u0000\u0000\u081d\u081f\u0003\u00a6S\u0000\u081e"+
		"\u0820\u0005n\u0000\u0000\u081f\u081e\u0001\u0000\u0000\u0000\u081f\u0820"+
		"\u0001\u0000\u0000\u0000\u0820\u0821\u0001\u0000\u0000\u0000\u0821\u0822"+
		"\u0005d\u0000\u0000\u0822\u0825\u0003\u00a6S\u0000\u0823\u0824\u0005>"+
		"\u0000\u0000\u0824\u0826\u0003\u00a6S\u0000\u0825\u0823\u0001\u0000\u0000"+
		"\u0000\u0825\u0826\u0001\u0000\u0000\u0000\u0826\u0831\u0001\u0000\u0000"+
		"\u0000\u0827\u0828\u0003\u00a6S\u0000\u0828\u0829\u0005_\u0000\u0000\u0829"+
		"\u082a\u0003\u0144\u00a2\u0000\u082a\u0831\u0001\u0000\u0000\u0000\u082b"+
		"\u082c\u0005\u01c8\u0000\u0000\u082c\u082d\u0003\u00b4Z\u0000\u082d\u082e"+
		"\u0005\u01c9\u0000\u0000\u082e\u0831\u0001\u0000\u0000\u0000\u082f\u0831"+
		"\u0005\u01b1\u0000\u0000\u0830\u07f6\u0001\u0000\u0000\u0000\u0830\u07f8"+
		"\u0001\u0000\u0000\u0000\u0830\u07fd\u0001\u0000\u0000\u0000\u0830\u0801"+
		"\u0001\u0000\u0000\u0000\u0830\u0808\u0001\u0000\u0000\u0000\u0830\u0811"+
		"\u0001\u0000\u0000\u0000\u0830\u081d\u0001\u0000\u0000\u0000\u0830\u0827"+
		"\u0001\u0000\u0000\u0000\u0830\u082b\u0001\u0000\u0000\u0000\u0830\u082f"+
		"\u0001\u0000\u0000\u0000\u0831\u00b7\u0001\u0000\u0000\u0000\u0832\u0833"+
		"\u0006\\\uffff\uffff\u0000\u0833\u0834\u0005\u01c8\u0000\u0000\u0834\u0835"+
		"\u0003\u00b8\\\u0000\u0835\u0836\u0005\u01c9\u0000\u0000\u0836\u0839\u0001"+
		"\u0000\u0000\u0000\u0837\u0839\u0003\u00bc^\u0000\u0838\u0832\u0001\u0000"+
		"\u0000\u0000\u0838\u0837\u0001\u0000\u0000\u0000\u0839\u0840\u0001\u0000"+
		"\u0000\u0000\u083a\u083b\n\u0002\u0000\u0000\u083b\u083c\u0003\u00ba]"+
		"\u0000\u083c\u083d\u0003\u00b8\\\u0003\u083d\u083f\u0001\u0000\u0000\u0000"+
		"\u083e\u083a\u0001\u0000\u0000\u0000\u083f\u0842\u0001\u0000\u0000\u0000"+
		"\u0840\u083e\u0001\u0000\u0000\u0000\u0840\u0841\u0001\u0000\u0000\u0000"+
		"\u0841\u00b9\u0001\u0000\u0000\u0000\u0842\u0840\u0001\u0000\u0000\u0000"+
		"\u0843\u0845\u0005\u00b8\u0000\u0000\u0844\u0846\u0005\u0003\u0000\u0000"+
		"\u0845\u0844\u0001\u0000\u0000\u0000\u0845\u0846\u0001\u0000\u0000\u0000"+
		"\u0846\u084a\u0001\u0000\u0000\u0000\u0847\u084a\u0005?\u0000\u0000\u0848"+
		"\u084a\u0005]\u0000\u0000\u0849\u0843\u0001\u0000\u0000\u0000\u0849\u0847"+
		"\u0001\u0000\u0000\u0000\u0849\u0848\u0001\u0000\u0000\u0000\u084a\u00bb"+
		"\u0001\u0000\u0000\u0000\u084b\u084d\u0005\u009e\u0000\u0000\u084c\u084e"+
		"\u0007\"\u0000\u0000\u084d\u084c\u0001\u0000\u0000\u0000\u084d\u084e\u0001"+
		"\u0000\u0000\u0000\u084e\u0850\u0001\u0000\u0000\u0000\u084f\u0851\u0003"+
		"\u00c2a\u0000\u0850\u084f\u0001\u0000\u0000\u0000\u0850\u0851\u0001\u0000"+
		"\u0000\u0000\u0851\u0852\u0001\u0000\u0000\u0000\u0852\u0855\u0003\u00d8"+
		"l\u0000\u0853\u0854\u0005^\u0000\u0000\u0854\u0856\u0003\u0132\u0099\u0000"+
		"\u0855\u0853\u0001\u0000\u0000\u0000\u0855\u0856\u0001\u0000\u0000\u0000"+
		"\u0856\u0859\u0001\u0000\u0000\u0000\u0857\u0858\u0005M\u0000\u0000\u0858"+
		"\u085a\u0003\u00dcn\u0000\u0859\u0857\u0001\u0000\u0000\u0000\u0859\u085a"+
		"\u0001\u0000\u0000\u0000\u085a\u085d\u0001\u0000\u0000\u0000\u085b\u085c"+
		"\u0005\u00c5\u0000\u0000\u085c\u085e\u0003\u00b4Z\u0000\u085d\u085b\u0001"+
		"\u0000\u0000\u0000\u085d\u085e\u0001\u0000\u0000\u0000\u085e\u0869\u0001"+
		"\u0000\u0000\u0000\u085f\u0860\u0005R\u0000\u0000\u0860\u0861\u0005\u0010"+
		"\u0000\u0000\u0861\u0866\u0003\u00d0h\u0000\u0862\u0863\u0005\u01ca\u0000"+
		"\u0000\u0863\u0865\u0003\u00d0h\u0000\u0864\u0862\u0001\u0000\u0000\u0000"+
		"\u0865\u0868\u0001\u0000\u0000\u0000\u0866\u0864\u0001\u0000\u0000\u0000"+
		"\u0866\u0867\u0001\u0000\u0000\u0000\u0867\u086a\u0001\u0000\u0000\u0000"+
		"\u0868\u0866\u0001\u0000\u0000\u0000\u0869\u085f\u0001\u0000\u0000\u0000"+
		"\u0869\u086a\u0001\u0000\u0000\u0000\u086a\u086c\u0001\u0000\u0000\u0000"+
		"\u086b\u086d\u0003\u00be_\u0000\u086c\u086b\u0001\u0000\u0000\u0000\u086c"+
		"\u086d\u0001\u0000\u0000\u0000\u086d\u0870\u0001\u0000\u0000\u0000\u086e"+
		"\u086f\u0005\u00c7\u0000\u0000\u086f\u0871\u0007#\u0000\u0000\u0870\u086e"+
		"\u0001\u0000\u0000\u0000\u0870\u0871\u0001\u0000\u0000\u0000\u0871\u0874"+
		"\u0001\u0000\u0000\u0000\u0872\u0873\u0005S\u0000\u0000\u0873\u0875\u0003"+
		"\u00b4Z\u0000\u0874\u0872\u0001\u0000\u0000\u0000\u0874\u0875\u0001\u0000"+
		"\u0000\u0000\u0875\u00bd\u0001\u0000\u0000\u0000\u0876\u0877\u0005R\u0000"+
		"\u0000\u0877\u0878\u0005\u0010\u0000\u0000\u0878\u0879\u0005\u011c\u0000"+
		"\u0000\u0879\u087a\u0005\u017f\u0000\u0000\u087a\u087b\u0005\u01c8\u0000"+
		"\u0000\u087b\u0880\u0003\u00c0`\u0000\u087c\u087d\u0005\u01ca\u0000\u0000"+
		"\u087d\u087f\u0003\u00c0`\u0000\u087e\u087c\u0001\u0000\u0000\u0000\u087f"+
		"\u0882\u0001\u0000\u0000\u0000\u0880\u087e\u0001\u0000\u0000\u0000\u0880"+
		"\u0881\u0001\u0000\u0000\u0000\u0881\u0883\u0001\u0000\u0000\u0000\u0882"+
		"\u0880\u0001\u0000\u0000\u0000\u0883\u0884\u0005\u01c9\u0000\u0000\u0884"+
		"\u00bf\u0001\u0000\u0000\u0000\u0885\u0886\u0005\u01c8\u0000\u0000\u0886"+
		"\u0894\u0005\u01c9\u0000\u0000\u0887\u0894\u0003\u00d0h\u0000\u0888\u0889"+
		"\u0005\u01c8\u0000\u0000\u0889\u088e\u0003\u00d0h\u0000\u088a\u088b\u0005"+
		"\u01ca\u0000\u0000\u088b\u088d\u0003\u00d0h\u0000\u088c\u088a\u0001\u0000"+
		"\u0000\u0000\u088d\u0890\u0001\u0000\u0000\u0000\u088e\u088c\u0001\u0000"+
		"\u0000\u0000\u088e\u088f\u0001\u0000\u0000\u0000\u088f\u0891\u0001\u0000"+
		"\u0000\u0000\u0890\u088e\u0001\u0000\u0000\u0000\u0891\u0892\u0005\u01c9"+
		"\u0000\u0000\u0892\u0894\u0001\u0000\u0000\u0000\u0893\u0885\u0001\u0000"+
		"\u0000\u0000\u0893\u0887\u0001\u0000\u0000\u0000\u0893\u0888\u0001\u0000"+
		"\u0000\u0000\u0894\u00c1\u0001\u0000\u0000\u0000\u0895\u0896\u0005\u00af"+
		"\u0000\u0000\u0896\u0898\u0003\u00a6S\u0000\u0897\u0899\u0005\u0081\u0000"+
		"\u0000\u0898\u0897\u0001\u0000\u0000\u0000\u0898\u0899\u0001\u0000\u0000"+
		"\u0000\u0899\u089c\u0001\u0000\u0000\u0000\u089a\u089b\u0005\u00c7\u0000"+
		"\u0000\u089b\u089d\u0005\u0193\u0000\u0000\u089c\u089a\u0001\u0000\u0000"+
		"\u0000\u089c\u089d\u0001\u0000\u0000\u0000\u089d\u00c3\u0001\u0000\u0000"+
		"\u0000\u089e\u089f\u0005\u00af\u0000\u0000\u089f\u08a0\u0005\u01c8\u0000"+
		"\u0000\u08a0\u08a1\u0003\u00a6S\u0000\u08a1\u08a3\u0005\u01c9\u0000\u0000"+
		"\u08a2\u08a4\u0005\u0081\u0000\u0000\u08a3\u08a2\u0001\u0000\u0000\u0000"+
		"\u08a3\u08a4\u0001\u0000\u0000\u0000\u08a4\u00c5\u0001\u0000\u0000\u0000"+
		"\u08a5\u08a6\u0005}\u0000\u0000\u08a6\u08a7\u0005\u0010\u0000\u0000\u08a7"+
		"\u08ac\u0003\u00ceg\u0000\u08a8\u08a9\u0005\u01ca\u0000\u0000\u08a9\u08ab"+
		"\u0003\u00ceg\u0000\u08aa\u08a8\u0001\u0000\u0000\u0000\u08ab\u08ae\u0001"+
		"\u0000\u0000\u0000\u08ac\u08aa\u0001\u0000\u0000\u0000\u08ac\u08ad\u0001"+
		"\u0000\u0000\u0000\u08ad\u08b5\u0001\u0000\u0000\u0000\u08ae\u08ac\u0001"+
		"\u0000\u0000\u0000\u08af\u08b0\u0005\u0152\u0000\u0000\u08b0\u08b1\u0003"+
		"\u00a6S\u0000\u08b1\u08b3\u0007$\u0000\u0000\u08b2\u08b4\u0003\u00c8d"+
		"\u0000\u08b3\u08b2\u0001\u0000\u0000\u0000\u08b3\u08b4\u0001\u0000\u0000"+
		"\u0000\u08b4\u08b6\u0001\u0000\u0000\u0000\u08b5\u08af\u0001\u0000\u0000"+
		"\u0000\u08b5\u08b6\u0001\u0000\u0000\u0000\u08b6\u00c7\u0001\u0000\u0000"+
		"\u0000\u08b7\u08b8\u0005D\u0000\u0000\u08b8\u08b9\u0007%\u0000\u0000\u08b9"+
		"\u08ba\u0003\u00a6S\u0000\u08ba\u08bb\u0007$\u0000\u0000\u08bb\u08bc\u0005"+
		"\u0154\u0000\u0000\u08bc\u00c9\u0001\u0000\u0000\u0000\u08bd\u08be\u0005"+
		"H\u0000\u0000\u08be\u08d1\u0005\u000e\u0000\u0000\u08bf\u08c0\u0005H\u0000"+
		"\u0000\u08c0\u08c1\u0005\u01a7\u0000\u0000\u08c1\u08c3\u0005\u00d5\u0000"+
		"\u0000\u08c2\u08c4\u0003\u00ccf\u0000\u08c3\u08c2\u0001\u0000\u0000\u0000"+
		"\u08c3\u08c4\u0001\u0000\u0000\u0000\u08c4\u08d1\u0001\u0000\u0000\u0000"+
		"\u08c5\u08c6\u0005H\u0000\u0000\u08c6\u08c7\u0005\u01a7\u0000\u0000\u08c7"+
		"\u08cb\u0005\u015e\u0000\u0000\u08c8\u08c9\u0005\u01c8\u0000\u0000\u08c9"+
		"\u08ca\u0005\u01b3\u0000\u0000\u08ca\u08cc\u0005\u01c9\u0000\u0000\u08cb"+
		"\u08c8\u0001\u0000\u0000\u0000\u08cb\u08cc\u0001\u0000\u0000\u0000\u08cc"+
		"\u08ce\u0001\u0000\u0000\u0000\u08cd\u08cf\u0003\u00ccf\u0000\u08ce\u08cd"+
		"\u0001\u0000\u0000\u0000\u08ce\u08cf\u0001\u0000\u0000\u0000\u08cf\u08d1"+
		"\u0001\u0000\u0000\u0000\u08d0\u08bd\u0001\u0000\u0000\u0000\u08d0\u08bf"+
		"\u0001\u0000\u0000\u0000\u08d0\u08c5\u0001\u0000\u0000\u0000\u08d1\u00cb"+
		"\u0001\u0000\u0000\u0000\u08d2\u08d7\u0005\u01ca\u0000\u0000\u08d3\u08d4"+
		"\u0005\u01b4\u0000\u0000\u08d4\u08d8\u0005\u00dd\u0000\u0000\u08d5\u08d8"+
		"\u0005\u019b\u0000\u0000\u08d6\u08d8\u0005\u0173\u0000\u0000\u08d7\u08d3"+
		"\u0001\u0000\u0000\u0000\u08d7\u08d5\u0001\u0000\u0000\u0000\u08d7\u08d6"+
		"\u0001\u0000\u0000\u0000\u08d8\u00cd\u0001\u0000\u0000\u0000\u08d9\u08db"+
		"\u0003\u00a6S\u0000\u08da\u08dc\u0007\u0005\u0000\u0000\u08db\u08da\u0001"+
		"\u0000\u0000\u0000\u08db\u08dc\u0001\u0000\u0000\u0000\u08dc\u00cf\u0001"+
		"\u0000\u0000\u0000\u08dd\u08de\u0003\u00a6S\u0000\u08de\u00d1\u0001\u0000"+
		"\u0000\u0000\u08df\u08e0\u0005{\u0000\u0000\u08e0\u08e1\u0005\u01c8\u0000"+
		"\u0000\u08e1\u08e6\u0003\u00d4j\u0000\u08e2\u08e3\u0005\u01ca\u0000\u0000"+
		"\u08e3\u08e5\u0003\u00d4j\u0000\u08e4\u08e2\u0001\u0000\u0000\u0000\u08e5"+
		"\u08e8\u0001\u0000\u0000\u0000\u08e6\u08e4\u0001\u0000\u0000\u0000\u08e6"+
		"\u08e7\u0001\u0000\u0000\u0000\u08e7\u08e9\u0001\u0000\u0000\u0000\u08e8"+
		"\u08e6\u0001\u0000\u0000\u0000\u08e9\u08ea\u0005\u01c9\u0000\u0000\u08ea"+
		"\u00d3\u0001\u0000\u0000\u0000\u08eb\u08ec\u0005\u010d\u0000\u0000\u08ec"+
		"\u0919\u0005\u01b1\u0000\u0000\u08ed\u08ee\u0007&\u0000\u0000\u08ee\u0919"+
		"\u0005R\u0000\u0000\u08ef\u08f0\u0007\'\u0000\u0000\u08f0\u0919\u0005"+
		"\u00b8\u0000\u0000\u08f1\u08f2\u0007(\u0000\u0000\u08f2\u0919\u0005`\u0000"+
		"\u0000\u08f3\u08f4\u0005\u010c\u0000\u0000\u08f4\u0919\u0005\u01a4\u0000"+
		"\u0000\u08f5\u08f6\u0005\u0115\u0000\u0000\u08f6\u0919\u0005}\u0000\u0000"+
		"\u08f7\u0919\u0005\u0122\u0000\u0000\u08f8\u08f9\u0005\u012d\u0000\u0000"+
		"\u08f9\u0919\u0005\u0083\u0000\u0000\u08fa\u08fb\u0005\u012e\u0000\u0000"+
		"\u08fb\u0919\u0005\u0083\u0000\u0000\u08fc\u08fd\u0005\u013b\u0000\u0000"+
		"\u08fd\u0919\u0005\u01b1\u0000\u0000\u08fe\u08ff\u0005\u013c\u0000\u0000"+
		"\u08ff\u0919\u0005\u01b1\u0000\u0000\u0900\u0901\u0005\u0156\u0000\u0000"+
		"\u0901\u0902\u0005H\u0000\u0000\u0902\u0903\u0005\u01c8\u0000\u0000\u0903"+
		"\u0908\u0003\u00d6k\u0000\u0904\u0905\u0005\u01ca\u0000\u0000\u0905\u0907"+
		"\u0003\u00d6k\u0000\u0906\u0904\u0001\u0000\u0000\u0000\u0907\u090a\u0001"+
		"\u0000\u0000\u0000\u0908\u0906\u0001\u0000\u0000\u0000\u0908\u0909\u0001"+
		"\u0000\u0000\u0000\u0909\u090b\u0001\u0000\u0000\u0000\u090a\u0908\u0001"+
		"\u0000\u0000\u0000\u090b\u090c\u0005\u01c9\u0000\u0000\u090c\u0919\u0001"+
		"\u0000\u0000\u0000\u090d\u090e\u0005\u0156\u0000\u0000\u090e\u090f\u0005"+
		"H\u0000\u0000\u090f\u0919\u0005\u019f\u0000\u0000\u0910\u0911\u0005\u015b"+
		"\u0000\u0000\u0911\u0919\u0007\u0010\u0000\u0000\u0912\u0919\u0005\u016a"+
		"\u0000\u0000\u0913\u0914\u0005\u0171\u0000\u0000\u0914\u0919\u0005\u0083"+
		"\u0000\u0000\u0915\u0916\u0005\u00bd\u0000\u0000\u0916\u0917\u0005\u0083"+
		"\u0000\u0000\u0917\u0919\u0005\u01b3\u0000\u0000\u0918\u08eb\u0001\u0000"+
		"\u0000\u0000\u0918\u08ed\u0001\u0000\u0000\u0000\u0918\u08ef\u0001\u0000"+
		"\u0000\u0000\u0918\u08f1\u0001\u0000\u0000\u0000\u0918\u08f3\u0001\u0000"+
		"\u0000\u0000\u0918\u08f5\u0001\u0000\u0000\u0000\u0918\u08f7\u0001\u0000"+
		"\u0000\u0000\u0918\u08f8\u0001\u0000\u0000\u0000\u0918\u08fa\u0001\u0000"+
		"\u0000\u0000\u0918\u08fc\u0001\u0000\u0000\u0000\u0918\u08fe\u0001\u0000"+
		"\u0000\u0000\u0918\u0900\u0001\u0000\u0000\u0000\u0918\u090d\u0001\u0000"+
		"\u0000\u0000\u0918\u0910\u0001\u0000\u0000\u0000\u0918\u0912\u0001\u0000"+
		"\u0000\u0000\u0918\u0913\u0001\u0000\u0000\u0000\u0918\u0915\u0001\u0000"+
		"\u0000\u0000\u0919\u00d5\u0001\u0000\u0000\u0000\u091a\u091e\u0005\u01b0"+
		"\u0000\u0000\u091b\u091f\u0005\u019f\u0000\u0000\u091c\u091d\u0005\u01b7"+
		"\u0000\u0000\u091d\u091f\u0003\u014a\u00a5\u0000\u091e\u091b\u0001\u0000"+
		"\u0000\u0000\u091e\u091c\u0001\u0000\u0000\u0000\u091f\u00d7\u0001\u0000"+
		"\u0000\u0000\u0920\u0925\u0003\u00dam\u0000\u0921\u0922\u0005\u01ca\u0000"+
		"\u0000\u0922\u0924\u0003\u00dam\u0000\u0923\u0921\u0001\u0000\u0000\u0000"+
		"\u0924\u0927\u0001\u0000\u0000\u0000\u0925\u0923\u0001\u0000\u0000\u0000"+
		"\u0925\u0926\u0001\u0000\u0000\u0000\u0926\u00d9\u0001\u0000\u0000\u0000"+
		"\u0927\u0925\u0001\u0000\u0000\u0000\u0928\u0929\u0003\u0132\u0099\u0000"+
		"\u0929\u092a\u0005\u01c3\u0000\u0000\u092a\u092c\u0001\u0000\u0000\u0000"+
		"\u092b\u0928\u0001\u0000\u0000\u0000\u092b\u092c\u0001\u0000\u0000\u0000"+
		"\u092c\u0930\u0001\u0000\u0000\u0000\u092d\u0931\u0003\u0108\u0084\u0000"+
		"\u092e\u092f\u0005\u01c7\u0000\u0000\u092f\u0931\u0007)\u0000\u0000\u0930"+
		"\u092d\u0001\u0000\u0000\u0000\u0930\u092e\u0001\u0000\u0000\u0000\u0931"+
		"\u093e\u0001\u0000\u0000\u0000\u0932\u0933\u0003\u0106\u0083\u0000\u0933"+
		"\u0934\u0005\u01b7\u0000\u0000\u0934\u0935\u0003\u00a6S\u0000\u0935\u093e"+
		"\u0001\u0000\u0000\u0000\u0936\u093b\u0003\u00a6S\u0000\u0937\u0939\u0005"+
		"\u0007\u0000\u0000\u0938\u0937\u0001\u0000\u0000\u0000\u0938\u0939\u0001"+
		"\u0000\u0000\u0000\u0939\u093a\u0001\u0000\u0000\u0000\u093a\u093c\u0003"+
		"\u0106\u0083\u0000\u093b\u0938\u0001\u0000\u0000\u0000\u093b\u093c\u0001"+
		"\u0000\u0000\u0000\u093c\u093e\u0001\u0000\u0000\u0000\u093d\u092b\u0001"+
		"\u0000\u0000\u0000\u093d\u0932\u0001\u0000\u0000\u0000\u093d\u0936\u0001"+
		"\u0000\u0000\u0000\u093e\u00db\u0001\u0000\u0000\u0000\u093f\u0944\u0003"+
		"\u00deo\u0000\u0940\u0941\u0005\u01ca\u0000\u0000\u0941\u0943\u0003\u00de"+
		"o\u0000\u0942\u0940\u0001\u0000\u0000\u0000\u0943\u0946\u0001\u0000\u0000"+
		"\u0000\u0944\u0942\u0001\u0000\u0000\u0000\u0944\u0945\u0001\u0000\u0000"+
		"\u0000\u0945\u00dd\u0001\u0000\u0000\u0000\u0946\u0944\u0001\u0000\u0000"+
		"\u0000\u0947\u0948\u0006o\uffff\uffff\u0000\u0948\u0949\u0005\u01c8\u0000"+
		"\u0000\u0949\u094a\u0003\u00deo\u0000\u094a\u094b\u0005\u01c9\u0000\u0000"+
		"\u094b\u094e\u0001\u0000\u0000\u0000\u094c\u094e\u0003\u00e0p\u0000\u094d"+
		"\u0947\u0001\u0000\u0000\u0000\u094d\u094c\u0001\u0000\u0000\u0000\u094e"+
		"\u0960\u0001\u0000\u0000\u0000\u094f\u0950\n\u0003\u0000\u0000\u0950\u0951"+
		"\u0005&\u0000\u0000\u0951\u0952\u0005`\u0000\u0000\u0952\u095f\u0003\u00de"+
		"o\u0004\u0953\u0954\n\u0002\u0000\u0000\u0954\u0955\u0007*\u0000\u0000"+
		"\u0955\u0956\u0005\u00d2\u0000\u0000\u0956\u095f\u0003\u00deo\u0003\u0957"+
		"\u0958\n\u0004\u0000\u0000\u0958\u0959\u0003\u00ecv\u0000\u0959\u095a"+
		"\u0005`\u0000\u0000\u095a\u095b\u0003\u00deo\u0000\u095b\u095c\u0005u"+
		"\u0000\u0000\u095c\u095d\u0003\u00b4Z\u0000\u095d\u095f\u0001\u0000\u0000"+
		"\u0000\u095e\u094f\u0001\u0000\u0000\u0000\u095e\u0953\u0001\u0000\u0000"+
		"\u0000\u095e\u0957\u0001\u0000\u0000\u0000\u095f\u0962\u0001\u0000\u0000"+
		"\u0000\u0960\u095e\u0001\u0000\u0000\u0000\u0960\u0961\u0001\u0000\u0000"+
		"\u0000\u0961\u00df\u0001\u0000\u0000\u0000\u0962\u0960\u0001\u0000\u0000"+
		"\u0000\u0963\u0965\u0003\u0132\u0099\u0000\u0964\u0966\u0003\u00e2q\u0000"+
		"\u0965\u0964\u0001\u0000\u0000\u0000\u0965\u0966\u0001\u0000\u0000\u0000"+
		"\u0966\u0968\u0001\u0000\u0000\u0000\u0967\u0969\u0003\u00e8t\u0000\u0968"+
		"\u0967\u0001\u0000\u0000\u0000\u0968\u0969\u0001\u0000\u0000\u0000\u0969"+
		"\u096b\u0001\u0000\u0000\u0000\u096a\u096c\u0003\u00fc~\u0000\u096b\u096a"+
		"\u0001\u0000\u0000\u0000\u096b\u096c\u0001\u0000\u0000\u0000\u096c\u098e"+
		"\u0001\u0000\u0000\u0000\u096d\u096f\u0003\u00f0x\u0000\u096e\u0970\u0003"+
		"\u00e8t\u0000\u096f\u096e\u0001\u0000\u0000\u0000\u096f\u0970\u0001\u0000"+
		"\u0000\u0000\u0970\u098e\u0001\u0000\u0000\u0000\u0971\u0976\u0003\u00f4"+
		"z\u0000\u0972\u0974\u0003\u00e8t\u0000\u0973\u0975\u0003\u0104\u0082\u0000"+
		"\u0974\u0973\u0001\u0000\u0000\u0000\u0974\u0975\u0001\u0000\u0000\u0000"+
		"\u0975\u0977\u0001\u0000\u0000\u0000\u0976\u0972\u0001\u0000\u0000\u0000"+
		"\u0976\u0977\u0001\u0000\u0000\u0000\u0977\u098e\u0001\u0000\u0000\u0000"+
		"\u0978\u097a\u0003\u00eau\u0000\u0979\u097b\u0003\u00e8t\u0000\u097a\u0979"+
		"\u0001\u0000\u0000\u0000\u097a\u097b\u0001\u0000\u0000\u0000\u097b\u098e"+
		"\u0001\u0000\u0000\u0000\u097c\u097e\u0003\u00f6{\u0000\u097d\u097f\u0003"+
		"\u00e8t\u0000\u097e\u097d\u0001\u0000\u0000\u0000\u097e\u097f\u0001\u0000"+
		"\u0000\u0000\u097f\u098e\u0001\u0000\u0000\u0000\u0980\u0982\u0005\u01b0"+
		"\u0000\u0000\u0981\u0983\u0003\u00e8t\u0000\u0982\u0981\u0001\u0000\u0000"+
		"\u0000\u0982\u0983\u0001\u0000\u0000\u0000\u0983\u098e\u0001\u0000\u0000"+
		"\u0000\u0984\u0985\u0005\u01b0\u0000\u0000\u0985\u0986\u0005\u01c3\u0000"+
		"\u0000\u0986\u098b\u0003\u00f6{\u0000\u0987\u0989\u0003\u00e8t\u0000\u0988"+
		"\u098a\u0003\u0104\u0082\u0000\u0989\u0988\u0001\u0000\u0000\u0000\u0989"+
		"\u098a\u0001\u0000\u0000\u0000\u098a\u098c\u0001\u0000\u0000\u0000\u098b"+
		"\u0987\u0001\u0000\u0000\u0000\u098b\u098c\u0001\u0000\u0000\u0000\u098c"+
		"\u098e\u0001\u0000\u0000\u0000\u098d\u0963\u0001\u0000\u0000\u0000\u098d"+
		"\u096d\u0001\u0000\u0000\u0000\u098d\u0971\u0001\u0000\u0000\u0000\u098d"+
		"\u0978\u0001\u0000\u0000\u0000\u098d\u097c\u0001\u0000\u0000\u0000\u098d"+
		"\u0980\u0001\u0000\u0000\u0000\u098d\u0984\u0001\u0000\u0000\u0000\u098e"+
		"\u00e1\u0001\u0000\u0000\u0000\u098f\u0991\u0005\u00ab\u0000\u0000\u0990"+
		"\u0992\u0005\u00a8\u0000\u0000\u0991\u0990\u0001\u0000\u0000\u0000\u0991"+
		"\u0992\u0001\u0000\u0000\u0000\u0992\u0993\u0001\u0000\u0000\u0000\u0993"+
		"\u0994\u0005\u01c8\u0000\u0000\u0994\u0996\u0003\u00e4r\u0000\u0995\u0997"+
		"\u0007\u0006\u0000\u0000\u0996\u0995\u0001\u0000\u0000\u0000\u0996\u0997"+
		"\u0001\u0000\u0000\u0000\u0997\u0998\u0001\u0000\u0000\u0000\u0998\u099b"+
		"\u0005\u01c9\u0000\u0000\u0999\u099a\u0005\u016f\u0000\u0000\u099a\u099c"+
		"\u0003\u00e6s\u0000\u099b\u0999\u0001\u0000\u0000\u0000\u099b\u099c\u0001"+
		"\u0000\u0000\u0000\u099c\u00e3\u0001\u0000\u0000\u0000\u099d\u099e\u0005"+
		"\u01b1\u0000\u0000\u099e\u00e5\u0001\u0000\u0000\u0000\u099f\u09a0\u0005"+
		"\u01b1\u0000\u0000\u09a0\u00e7\u0001\u0000\u0000\u0000\u09a1\u09a3\u0005"+
		"\u0007\u0000\u0000\u09a2\u09a1\u0001\u0000\u0000\u0000\u09a2\u09a3\u0001"+
		"\u0000\u0000\u0000\u09a3\u09a4\u0001\u0000\u0000\u0000\u09a4\u09a5\u0003"+
		"\u014e\u00a7\u0000\u09a5\u00e9\u0001\u0000\u0000\u0000\u09a6\u09a7\u0005"+
		"\u0014\u0000\u0000\u09a7\u09a8\u0005\u01c8\u0000\u0000\u09a8\u09a9\u0005"+
		"\u0015\u0000\u0000\u09a9\u09aa\u0003\u0132\u0099\u0000\u09aa\u09ab\u0005"+
		"\u01ca\u0000\u0000\u09ab\u09ac\u0007+\u0000\u0000\u09ac\u09ad\u0005\u01c9"+
		"\u0000\u0000\u09ad\u00eb\u0001\u0000\u0000\u0000\u09ae\u09b0\u0005[\u0000"+
		"\u0000\u09af\u09ae\u0001\u0000\u0000\u0000\u09af\u09b0\u0001\u0000\u0000"+
		"\u0000\u09b0\u09b6\u0001\u0000\u0000\u0000\u09b1\u09b3\u0007,\u0000\u0000"+
		"\u09b2\u09b4\u0005~\u0000\u0000\u09b3\u09b2\u0001\u0000\u0000\u0000\u09b3"+
		"\u09b4\u0001\u0000\u0000\u0000\u09b4\u09b6\u0001\u0000\u0000\u0000\u09b5"+
		"\u09af\u0001\u0000\u0000\u0000\u09b5\u09b1\u0001\u0000\u0000\u0000\u09b6"+
		"\u09b8\u0001\u0000\u0000\u0000\u09b7\u09b9\u0007-\u0000\u0000\u09b8\u09b7"+
		"\u0001\u0000\u0000\u0000\u09b8\u09b9\u0001\u0000\u0000\u0000\u09b9\u00ed"+
		"\u0001\u0000\u0000\u0000\u09ba\u09bc\u0003\u0132\u0099\u0000\u09bb\u09bd"+
		"\u0003\u00fc~\u0000\u09bc\u09bb\u0001\u0000\u0000\u0000\u09bc\u09bd\u0001"+
		"\u0000\u0000\u0000\u09bd\u00ef\u0001\u0000\u0000\u0000\u09be\u09bf\u0005"+
		"y\u0000\u0000\u09bf\u09c0\u0005\u01c8\u0000\u0000\u09c0\u09c1\u0005\u01b3"+
		"\u0000\u0000\u09c1\u09c2\u0005\u01ca\u0000\u0000\u09c2\u09c3\u0005\u01b3"+
		"\u0000\u0000\u09c3\u09c4\u0005\u01ca\u0000\u0000\u09c4\u09c5\u0005\u01b3"+
		"\u0000\u0000\u09c5\u09d9\u0005\u01c9\u0000\u0000\u09c6\u09c7\u0005y\u0000"+
		"\u0000\u09c7\u09c8\u0005\u01c8\u0000\u0000\u09c8\u09c9\u0005\u000f\u0000"+
		"\u0000\u09c9\u09ca\u0005\u01b3\u0000\u0000\u09ca\u09d4\u0005\u01ca\u0000"+
		"\u0000\u09cb\u09d0\u0003\u00f2y\u0000\u09cc\u09cd\u0005\u01ca\u0000\u0000"+
		"\u09cd\u09cf\u0003\u00f2y\u0000\u09ce\u09cc\u0001\u0000\u0000\u0000\u09cf"+
		"\u09d2\u0001\u0000\u0000\u0000\u09d0\u09ce\u0001\u0000\u0000\u0000\u09d0"+
		"\u09d1\u0001\u0000\u0000\u0000\u09d1\u09d5\u0001\u0000\u0000\u0000\u09d2"+
		"\u09d0\u0001\u0000\u0000\u0000\u09d3\u09d5\u0003\u014e\u00a7\u0000\u09d4"+
		"\u09cb\u0001\u0000\u0000\u0000\u09d4\u09d3\u0001\u0000\u0000\u0000\u09d5"+
		"\u09d6\u0001\u0000\u0000\u0000\u09d6\u09d7\u0005\u01c9\u0000\u0000\u09d7"+
		"\u09d9\u0001\u0000\u0000\u0000\u09d8\u09be\u0001\u0000\u0000\u0000\u09d8"+
		"\u09c6\u0001\u0000\u0000\u0000\u09d9\u00f1\u0001\u0000\u0000\u0000\u09da"+
		"\u09db\u0003\u014e\u00a7\u0000\u09db\u09dc\u0005\u01b7\u0000\u0000\u09dc"+
		"\u09dd\u0007.\u0000\u0000\u09dd\u00f3\u0001\u0000\u0000\u0000\u09de\u09e4"+
		"\u0003\u00aaU\u0000\u09df\u09e0\u0005\u01c8\u0000\u0000\u09e0\u09e1\u0003"+
		"\u00aaU\u0000\u09e1\u09e2\u0005\u01c9\u0000\u0000\u09e2\u09e4\u0001\u0000"+
		"\u0000\u0000\u09e3\u09de\u0001\u0000\u0000\u0000\u09e3\u09df\u0001\u0000"+
		"\u0000\u0000\u09e4\u00f5\u0001\u0000\u0000\u0000\u09e5\u0a93\u0003\u0114"+
		"\u008a\u0000\u09e6\u0a93\u0003\u0116\u008b\u0000\u09e7\u09e8\u0003\u0146"+
		"\u00a3\u0000\u09e8\u09ea\u0005\u01c8\u0000\u0000\u09e9\u09eb\u0003\u010c"+
		"\u0086\u0000\u09ea\u09e9\u0001\u0000\u0000\u0000\u09ea\u09eb\u0001\u0000"+
		"\u0000\u0000\u09eb\u09ec\u0001\u0000\u0000\u0000\u09ec\u09ed\u0005\u01c9"+
		"\u0000\u0000\u09ed\u0a93\u0001\u0000\u0000\u0000\u09ee\u0a93\u0003\u0112"+
		"\u0089\u0000\u09ef\u09f0\u0005\u00df\u0000\u0000\u09f0\u09f1\u0005\u01c8"+
		"\u0000\u0000\u09f1\u09f2\u0005\u01cd\u0000\u0000\u09f2\u0a93\u0005\u01c9"+
		"\u0000\u0000\u09f3\u09f4\u0005\u00e2\u0000\u0000\u09f4\u09f5\u0005\u01c8"+
		"\u0000\u0000\u09f5\u09f6\u0003\u00a6S\u0000\u09f6\u09f7\u0005\u0007\u0000"+
		"\u0000\u09f7\u09f8\u0003\u016c\u00b6\u0000\u09f8\u09f9\u0005\u01c9\u0000"+
		"\u0000\u09f9\u0a93\u0001\u0000\u0000\u0000\u09fa\u09fb\u0005$\u0000\u0000"+
		"\u09fb\u09fc\u0005\u01c8\u0000\u0000\u09fc\u09fd\u0003\u016c\u00b6\u0000"+
		"\u09fd\u09fe\u0005\u01ca\u0000\u0000\u09fe\u0a01\u0003\u00a6S\u0000\u09ff"+
		"\u0a00\u0005\u01ca\u0000\u0000\u0a00\u0a02\u0003\u00a6S\u0000\u0a01\u09ff"+
		"\u0001\u0000\u0000\u0000\u0a01\u0a02\u0001\u0000\u0000\u0000\u0a02\u0a03"+
		"\u0001\u0000\u0000\u0000\u0a03\u0a04\u0005\u01c9\u0000\u0000\u0a04\u0a93"+
		"\u0001\u0000\u0000\u0000\u0a05\u0a06\u0005\u00e6\u0000\u0000\u0a06\u0a07"+
		"\u0005\u01c8\u0000\u0000\u0a07\u0a08\u0005\u01cd\u0000\u0000\u0a08\u0a93"+
		"\u0005\u01c9\u0000\u0000\u0a09\u0a0a\u0005\u001a\u0000\u0000\u0a0a\u0a0b"+
		"\u0005\u01c8\u0000\u0000\u0a0b\u0a0c\u0003\u010c\u0086\u0000\u0a0c\u0a0d"+
		"\u0005\u01c9\u0000\u0000\u0a0d\u0a93\u0001\u0000\u0000\u0000\u0a0e\u0a93"+
		"\u0005*\u0000\u0000\u0a0f\u0a93\u0005+\u0000\u0000\u0a10\u0a11\u0005\u00f4"+
		"\u0000\u0000\u0a11\u0a12\u0005\u01c8\u0000\u0000\u0a12\u0a13\u0005\u01b2"+
		"\u0000\u0000\u0a13\u0a14\u0005\u01ca\u0000\u0000\u0a14\u0a15\u0003\u00a6"+
		"S\u0000\u0a15\u0a16\u0005\u01ca\u0000\u0000\u0a16\u0a17\u0003\u00a6S\u0000"+
		"\u0a17\u0a18\u0005\u01c9\u0000\u0000\u0a18\u0a93\u0001\u0000\u0000\u0000"+
		"\u0a19\u0a1a\u0005\u00f5\u0000\u0000\u0a1a\u0a1b\u0005\u01c8\u0000\u0000"+
		"\u0a1b\u0a1c\u0005\u01b2\u0000\u0000\u0a1c\u0a1d\u0005\u01ca\u0000\u0000"+
		"\u0a1d\u0a1e\u0003\u00a6S\u0000\u0a1e\u0a1f\u0005\u01ca\u0000\u0000\u0a1f"+
		"\u0a20\u0003\u00a6S\u0000\u0a20\u0a21\u0005\u01c9\u0000\u0000\u0a21\u0a93"+
		"\u0001\u0000\u0000\u0000\u0a22\u0a23\u0005\u00f6\u0000\u0000\u0a23\u0a24"+
		"\u0005\u01c8\u0000\u0000\u0a24\u0a25\u0005\u01b2\u0000\u0000\u0a25\u0a26"+
		"\u0005\u01ca\u0000\u0000\u0a26\u0a27\u0003\u00a6S\u0000\u0a27\u0a28\u0005"+
		"\u01c9\u0000\u0000\u0a28\u0a93\u0001\u0000\u0000\u0000\u0a29\u0a2a\u0005"+
		"\u00f7\u0000\u0000\u0a2a\u0a2b\u0005\u01c8\u0000\u0000\u0a2b\u0a2c\u0005"+
		"\u01b2\u0000\u0000\u0a2c\u0a2d\u0005\u01ca\u0000\u0000\u0a2d\u0a2e\u0003"+
		"\u00a6S\u0000\u0a2e\u0a2f\u0005\u01c9\u0000\u0000\u0a2f\u0a93\u0001\u0000"+
		"\u0000\u0000\u0a30\u0a31\u0005\u00f9\u0000\u0000\u0a31\u0a32\u0005\u01c8"+
		"\u0000\u0000\u0a32\u0a33\u0003\u00a6S\u0000\u0a33\u0a34\u0005\u01ca\u0000"+
		"\u0000\u0a34\u0a35\u0003\u00a6S\u0000\u0a35\u0a36\u0005\u01ca\u0000\u0000"+
		"\u0a36\u0a37\u0003\u00a6S\u0000\u0a37\u0a38\u0005\u01ca\u0000\u0000\u0a38"+
		"\u0a39\u0003\u00a6S\u0000\u0a39\u0a3a\u0005\u01ca\u0000\u0000\u0a3a\u0a3b"+
		"\u0003\u00a6S\u0000\u0a3b\u0a3c\u0005\u01ca\u0000\u0000\u0a3c\u0a3d\u0003"+
		"\u00a6S\u0000\u0a3d\u0a3e\u0005\u01ca\u0000\u0000\u0a3e\u0a3f\u0003\u00a6"+
		"S\u0000\u0a3f\u0a40\u0005\u01ca\u0000\u0000\u0a40\u0a41\u0003\u00a6S\u0000"+
		"\u0a41\u0a42\u0005\u01ca\u0000\u0000\u0a42\u0a43\u0003\u00a6S\u0000\u0a43"+
		"\u0a44\u0005\u01ca\u0000\u0000\u0a44\u0a45\u0003\u00a6S\u0000\u0a45\u0a46"+
		"\u0005\u01c9\u0000\u0000\u0a46\u0a93\u0001\u0000\u0000\u0000\u0a47\u0a48"+
		"\u0005T\u0000\u0000\u0a48\u0a49\u0005\u01c8\u0000\u0000\u0a49\u0a4c\u0003"+
		"\u016c\u00b6\u0000\u0a4a\u0a4b\u0005\u01ca\u0000\u0000\u0a4b\u0a4d\u0005"+
		"\u01b1\u0000\u0000\u0a4c\u0a4a\u0001\u0000\u0000\u0000\u0a4c\u0a4d\u0001"+
		"\u0000\u0000\u0000\u0a4d\u0a50\u0001\u0000\u0000\u0000\u0a4e\u0a4f\u0005"+
		"\u01ca\u0000\u0000\u0a4f\u0a51\u0005\u01b1\u0000\u0000\u0a50\u0a4e\u0001"+
		"\u0000\u0000\u0000\u0a50\u0a51\u0001\u0000\u0000\u0000\u0a51\u0a52\u0001"+
		"\u0000\u0000\u0000\u0a52\u0a53\u0005\u01c9\u0000\u0000\u0a53\u0a93\u0001"+
		"\u0000\u0000\u0000\u0a54\u0a55\u0005W\u0000\u0000\u0a55\u0a56\u0005\u01c8"+
		"\u0000\u0000\u0a56\u0a57\u0003\u00b4Z\u0000\u0a57\u0a58\u0005\u01ca\u0000"+
		"\u0000\u0a58\u0a59\u0003\u00a6S\u0000\u0a59\u0a5a\u0005\u01ca\u0000\u0000"+
		"\u0a5a\u0a5b\u0003\u00a6S\u0000\u0a5b\u0a5c\u0005\u01c9\u0000\u0000\u0a5c"+
		"\u0a93\u0001\u0000\u0000\u0000\u0a5d\u0a93\u0005\u0142\u0000\u0000\u0a5e"+
		"\u0a5f\u0005p\u0000\u0000\u0a5f\u0a60\u0005\u01c8\u0000\u0000\u0a60\u0a61"+
		"\u0003\u00a6S\u0000\u0a61\u0a62\u0005\u01ca\u0000\u0000\u0a62\u0a63\u0003"+
		"\u00a6S\u0000\u0a63\u0a64\u0005\u01c9\u0000\u0000\u0a64\u0a93\u0001\u0000"+
		"\u0000\u0000\u0a65\u0a66\u0005\u015c\u0000\u0000\u0a66\u0a67\u0005\u01c8"+
		"\u0000\u0000\u0a67\u0a68\u0003\u00a6S\u0000\u0a68\u0a69\u0005\u0007\u0000"+
		"\u0000\u0a69\u0a6c\u0003\u016c\u00b6\u0000\u0a6a\u0a6b\u0005\u01a1\u0000"+
		"\u0000\u0a6b\u0a6d\u0003\u00a6S\u0000\u0a6c\u0a6a\u0001\u0000\u0000\u0000"+
		"\u0a6c\u0a6d\u0001\u0000\u0000\u0000\u0a6d\u0a6e\u0001\u0000\u0000\u0000"+
		"\u0a6e\u0a6f\u0005\u01c9\u0000\u0000\u0a6f\u0a93\u0001\u0000\u0000\u0000"+
		"\u0a70\u0a93\u0005\u00a2\u0000\u0000\u0a71\u0a72\u0005\u018c\u0000\u0000"+
		"\u0a72\u0a73\u0005\u01c8\u0000\u0000\u0a73\u0a74\u0003\u00a6S\u0000\u0a74"+
		"\u0a75\u0005\u01ca\u0000\u0000\u0a75\u0a76\u0003\u00a6S\u0000\u0a76\u0a77"+
		"\u0005\u01c9\u0000\u0000\u0a77\u0a93\u0001\u0000\u0000\u0000\u0a78\u0a93"+
		"\u0005\u00a9\u0000\u0000\u0a79\u0a7a\u0005\u00b5\u0000\u0000\u0a7a\u0a7b"+
		"\u0005\u01c8\u0000\u0000\u0a7b\u0a7c\u0003\u016c\u00b6\u0000\u0a7c\u0a7d"+
		"\u0005\u01ca\u0000\u0000\u0a7d\u0a7e\u0003\u00a6S\u0000\u0a7e\u0a7f\u0005"+
		"\u01c9\u0000\u0000\u0a7f\u0a93\u0001\u0000\u0000\u0000\u0a80\u0a81\u0005"+
		"\u00b4\u0000\u0000\u0a81\u0a82\u0005\u01c8\u0000\u0000\u0a82\u0a83\u0003"+
		"\u00a6S\u0000\u0a83\u0a84\u0005\u0007\u0000\u0000\u0a84\u0a85\u0003\u016c"+
		"\u00b6\u0000\u0a85\u0a86\u0005\u01c9\u0000\u0000\u0a86\u0a93\u0001\u0000"+
		"\u0000\u0000\u0a87\u0a88\u0005\u00b6\u0000\u0000\u0a88\u0a89\u0005\u01c8"+
		"\u0000\u0000\u0a89\u0a8a\u0003\u00a6S\u0000\u0a8a\u0a8b\u0005\u0007\u0000"+
		"\u0000\u0a8b\u0a8e\u0003\u016c\u00b6\u0000\u0a8c\u0a8d\u0005\u01a1\u0000"+
		"\u0000\u0a8d\u0a8f\u0003\u00a6S\u0000\u0a8e\u0a8c\u0001\u0000\u0000\u0000"+
		"\u0a8e\u0a8f\u0001\u0000\u0000\u0000\u0a8f\u0a90\u0001\u0000\u0000\u0000"+
		"\u0a90\u0a91\u0005\u01c9\u0000\u0000\u0a91\u0a93\u0001\u0000\u0000\u0000"+
		"\u0a92\u09e5\u0001\u0000\u0000\u0000\u0a92\u09e6\u0001\u0000\u0000\u0000"+
		"\u0a92\u09e7\u0001\u0000\u0000\u0000\u0a92\u09ee\u0001\u0000\u0000\u0000"+
		"\u0a92\u09ef\u0001\u0000\u0000\u0000\u0a92\u09f3\u0001\u0000\u0000\u0000"+
		"\u0a92\u09fa\u0001\u0000\u0000\u0000\u0a92\u0a05\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a09\u0001\u0000\u0000\u0000\u0a92\u0a0e\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a0f\u0001\u0000\u0000\u0000\u0a92\u0a10\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a19\u0001\u0000\u0000\u0000\u0a92\u0a22\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a29\u0001\u0000\u0000\u0000\u0a92\u0a30\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a47\u0001\u0000\u0000\u0000\u0a92\u0a54\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a5d\u0001\u0000\u0000\u0000\u0a92\u0a5e\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a65\u0001\u0000\u0000\u0000\u0a92\u0a70\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a71\u0001\u0000\u0000\u0000\u0a92\u0a78\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a79\u0001\u0000\u0000\u0000\u0a92\u0a80\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a87\u0001\u0000\u0000\u0000\u0a93\u00f7\u0001\u0000\u0000\u0000"+
		"\u0a94\u0a95\u0005\u00c4\u0000\u0000\u0a95\u0a96\u0003\u00a6S\u0000\u0a96"+
		"\u0a97\u0005\u00ad\u0000\u0000\u0a97\u0a98\u0003\u00a6S\u0000\u0a98\u00f9"+
		"\u0001\u0000\u0000\u0000\u0a99\u0a9a\u0005\u00c4\u0000\u0000\u0a9a\u0a9b"+
		"\u0003\u00b4Z\u0000\u0a9b\u0a9c\u0005\u00ad\u0000\u0000\u0a9c\u0a9d\u0003"+
		"\u00a6S\u0000\u0a9d\u00fb\u0001\u0000\u0000\u0000\u0a9e\u0aa0\u0005\u00c7"+
		"\u0000\u0000\u0a9f\u0a9e\u0001\u0000\u0000\u0000\u0a9f\u0aa0\u0001\u0000"+
		"\u0000\u0000\u0aa0\u0aa1\u0001\u0000\u0000\u0000\u0aa1\u0aa2\u0005\u01c8"+
		"\u0000\u0000\u0aa2\u0aa7\u0003\u0100\u0080\u0000\u0aa3\u0aa4\u0005\u01ca"+
		"\u0000\u0000\u0aa4\u0aa6\u0003\u0100\u0080\u0000\u0aa5\u0aa3\u0001\u0000"+
		"\u0000\u0000\u0aa6\u0aa9\u0001\u0000\u0000\u0000\u0aa7\u0aa5\u0001\u0000"+
		"\u0000\u0000\u0aa7\u0aa8\u0001\u0000\u0000\u0000\u0aa8\u0aaa\u0001\u0000"+
		"\u0000\u0000\u0aa9\u0aa7\u0001\u0000\u0000\u0000\u0aaa\u0aab\u0005\u01c9"+
		"\u0000\u0000\u0aab\u00fd\u0001\u0000\u0000\u0000\u0aac\u0aad\u0005\u00c7"+
		"\u0000\u0000\u0aad\u0aae\u0005\u01c8\u0000\u0000\u0aae\u0ab3\u0003\u0100"+
		"\u0080\u0000\u0aaf\u0ab0\u0005\u01ca\u0000\u0000\u0ab0\u0ab2\u0003\u0100"+
		"\u0080\u0000\u0ab1\u0aaf\u0001\u0000\u0000\u0000\u0ab2\u0ab5\u0001\u0000"+
		"\u0000\u0000\u0ab3\u0ab1\u0001\u0000\u0000\u0000\u0ab3\u0ab4\u0001\u0000"+
		"\u0000\u0000\u0ab4\u0ab6\u0001\u0000\u0000\u0000\u0ab5\u0ab3\u0001\u0000"+
		"\u0000\u0000\u0ab6\u0ab7\u0005\u01c9\u0000\u0000\u0ab7\u00ff\u0001\u0000"+
		"\u0000\u0000\u0ab8\u0aba\u0005\u014a\u0000\u0000\u0ab9\u0ab8\u0001\u0000"+
		"\u0000\u0000\u0ab9\u0aba\u0001\u0000\u0000\u0000\u0aba\u0ae1\u0001\u0000"+
		"\u0000\u0000\u0abb\u0abc\u0005Z\u0000\u0000\u0abc\u0abd\u0005\u01c8\u0000"+
		"\u0000\u0abd\u0ac2\u0003\u0102\u0081\u0000\u0abe\u0abf\u0005\u01ca\u0000"+
		"\u0000\u0abf\u0ac1\u0003\u0102\u0081\u0000\u0ac0\u0abe\u0001\u0000\u0000"+
		"\u0000\u0ac1\u0ac4\u0001\u0000\u0000\u0000\u0ac2\u0ac0\u0001\u0000\u0000"+
		"\u0000\u0ac2\u0ac3\u0001\u0000\u0000\u0000\u0ac3\u0ac5\u0001\u0000\u0000"+
		"\u0000\u0ac4\u0ac2\u0001\u0000\u0000\u0000\u0ac5\u0ac6\u0005\u01c9\u0000"+
		"\u0000\u0ac6\u0ae2\u0001\u0000\u0000\u0000\u0ac7\u0ac8\u0005Z\u0000\u0000"+
		"\u0ac8\u0ac9\u0005\u01b7\u0000\u0000\u0ac9\u0ae2\u0003\u0102\u0081\u0000"+
		"\u0aca\u0ad9\u0005I\u0000\u0000\u0acb\u0acc\u0005\u01c8\u0000\u0000\u0acc"+
		"\u0acd\u0003\u0102\u0081\u0000\u0acd\u0ace\u0005\u01c8\u0000\u0000\u0ace"+
		"\u0ad3\u0005\u01b2\u0000\u0000\u0acf\u0ad0\u0005\u01ca\u0000\u0000\u0ad0"+
		"\u0ad2\u0005\u01b2\u0000\u0000\u0ad1\u0acf\u0001\u0000\u0000\u0000\u0ad2"+
		"\u0ad5\u0001\u0000\u0000\u0000\u0ad3\u0ad1\u0001\u0000\u0000\u0000\u0ad3"+
		"\u0ad4\u0001\u0000\u0000\u0000\u0ad4\u0ad6\u0001\u0000\u0000\u0000\u0ad5"+
		"\u0ad3\u0001\u0000\u0000\u0000\u0ad6\u0ad7\u0005\u01c9\u0000\u0000\u0ad7"+
		"\u0ad8\u0005\u01c9\u0000\u0000\u0ad8\u0ada\u0001\u0000\u0000\u0000\u0ad9"+
		"\u0acb\u0001\u0000\u0000\u0000\u0ad9\u0ada\u0001\u0000\u0000\u0000\u0ada"+
		"\u0ae2\u0001\u0000\u0000\u0000\u0adb\u0ae2\u0005\u017e\u0000\u0000\u0adc"+
		"\u0ae2\u0005\u0185\u0000\u0000\u0add\u0ade\u0005\u0186\u0000\u0000\u0ade"+
		"\u0adf\u0005\u01b7\u0000\u0000\u0adf\u0ae2\u0005\u01b1\u0000\u0000\u0ae0"+
		"\u0ae2\u0005\u01b2\u0000\u0000\u0ae1\u0abb\u0001\u0000\u0000\u0000\u0ae1"+
		"\u0ac7\u0001\u0000\u0000\u0000\u0ae1\u0aca\u0001\u0000\u0000\u0000\u0ae1"+
		"\u0adb\u0001\u0000\u0000\u0000\u0ae1\u0adc\u0001\u0000\u0000\u0000\u0ae1"+
		"\u0add\u0001\u0000\u0000\u0000\u0ae1\u0ae0\u0001\u0000\u0000\u0000\u0ae1"+
		"\u0ae2\u0001\u0000\u0000\u0000\u0ae2\u0101\u0001\u0000\u0000\u0000\u0ae3"+
		"\u0ae6\u0003\u014e\u00a7\u0000\u0ae4\u0ae6\u0005\u01b1\u0000\u0000\u0ae5"+
		"\u0ae3\u0001\u0000\u0000\u0000\u0ae5\u0ae4\u0001\u0000\u0000\u0000\u0ae6"+
		"\u0103\u0001\u0000\u0000\u0000\u0ae7\u0ae8\u0005\u01c8\u0000\u0000\u0ae8"+
		"\u0aed\u0003\u0106\u0083\u0000\u0ae9\u0aea\u0005\u01ca\u0000\u0000\u0aea"+
		"\u0aec\u0003\u0106\u0083\u0000\u0aeb\u0ae9\u0001\u0000\u0000\u0000\u0aec"+
		"\u0aef\u0001\u0000\u0000\u0000\u0aed\u0aeb\u0001\u0000\u0000\u0000\u0aed"+
		"\u0aee\u0001\u0000\u0000\u0000\u0aee\u0af0\u0001\u0000\u0000\u0000\u0aef"+
		"\u0aed\u0001\u0000\u0000\u0000\u0af0\u0af1\u0005\u01c9\u0000\u0000\u0af1"+
		"\u0105\u0001\u0000\u0000\u0000\u0af2\u0af5\u0003\u014e\u00a7\u0000\u0af3"+
		"\u0af5\u0005\u01b3\u0000\u0000\u0af4\u0af2\u0001\u0000\u0000\u0000\u0af4"+
		"\u0af3\u0001\u0000\u0000\u0000\u0af5\u0107\u0001\u0000\u0000\u0000\u0af6"+
		"\u0af7\u0005\u01cd\u0000\u0000\u0af7\u0109\u0001\u0000\u0000\u0000\u0af8"+
		"\u0af9\u0005\u00bf\u0000\u0000\u0af9\u0afe\u0003\u010e\u0087\u0000\u0afa"+
		"\u0afb\u0005\u01ca\u0000\u0000\u0afb\u0afd\u0003\u010e\u0087\u0000\u0afc"+
		"\u0afa\u0001\u0000\u0000\u0000\u0afd\u0b00\u0001\u0000\u0000\u0000\u0afe"+
		"\u0afc\u0001\u0000\u0000\u0000\u0afe\u0aff\u0001\u0000\u0000\u0000\u0aff"+
		"\u010b\u0001\u0000\u0000\u0000\u0b00\u0afe\u0001\u0000\u0000\u0000\u0b01"+
		"\u0b06\u0003\u00a6S\u0000\u0b02\u0b03\u0005\u01ca\u0000\u0000\u0b03\u0b05"+
		"\u0003\u00a6S\u0000\u0b04\u0b02\u0001\u0000\u0000\u0000\u0b05\u0b08\u0001"+
		"\u0000\u0000\u0000\u0b06\u0b04\u0001\u0000\u0000\u0000\u0b06\u0b07\u0001"+
		"\u0000\u0000\u0000\u0b07\u010d\u0001\u0000\u0000\u0000\u0b08\u0b06\u0001"+
		"\u0000\u0000\u0000\u0b09\u0b0a\u0005\u01c8\u0000\u0000\u0b0a\u0b0b\u0003"+
		"\u010c\u0086\u0000\u0b0b\u0b0c\u0005\u01c9\u0000\u0000\u0b0c\u010f\u0001"+
		"\u0000\u0000\u0000\u0b0d\u0b0e\u0005j\u0000\u0000\u0b0e\u0b0f\u0005\u00c0"+
		"\u0000\u0000\u0b0f\u0b10\u0005H\u0000\u0000\u0b10\u0111\u0001\u0000\u0000"+
		"\u0000\u0b11\u0b12\u0003\u0110\u0088\u0000\u0b12\u0b13\u0003\u0136\u009b"+
		"\u0000\u0b13\u0b14\u0003\u011a\u008d\u0000\u0b14\u0113\u0001\u0000\u0000"+
		"\u0000\u0b15\u0b16\u0007/\u0000\u0000\u0b16\u0b17\u0005\u01c8\u0000\u0000"+
		"\u0b17\u0b18\u0005\u01c9\u0000\u0000\u0b18\u0b2d\u0003\u011a\u008d\u0000"+
		"\u0b19\u0b1a\u00070\u0000\u0000\u0b1a\u0b1b\u0005\u01c8\u0000\u0000\u0b1b"+
		"\u0b1c\u0003\u00a6S\u0000\u0b1c\u0b1d\u0005\u01c9\u0000\u0000\u0b1d\u0b1e"+
		"\u0003\u011a\u008d\u0000\u0b1e\u0b2d\u0001\u0000\u0000\u0000\u0b1f\u0b20"+
		"\u00071\u0000\u0000\u0b20\u0b21\u0005\u01c8\u0000\u0000\u0b21\u0b26\u0003"+
		"\u00a6S\u0000\u0b22\u0b23\u0005\u01ca\u0000\u0000\u0b23\u0b25\u0003\u00a6"+
		"S\u0000\u0b24\u0b22\u0001\u0000\u0000\u0000\u0b25\u0b28\u0001\u0000\u0000"+
		"\u0000\u0b26\u0b24\u0001\u0000\u0000\u0000\u0b26\u0b27\u0001\u0000\u0000"+
		"\u0000\u0b27\u0b29\u0001\u0000\u0000\u0000\u0b28\u0b26\u0001\u0000\u0000"+
		"\u0000\u0b29\u0b2a\u0005\u01c9\u0000\u0000\u0b2a\u0b2b\u0003\u011a\u008d"+
		"\u0000\u0b2b\u0b2d\u0001\u0000\u0000\u0000\u0b2c\u0b15\u0001\u0000\u0000"+
		"\u0000\u0b2c\u0b19\u0001\u0000\u0000\u0000\u0b2c\u0b1f\u0001\u0000\u0000"+
		"\u0000\u0b2d\u0115\u0001\u0000\u0000\u0000\u0b2e\u0b2f\u00072\u0000\u0000"+
		"\u0b2f\u0b31\u0005\u01c8\u0000\u0000\u0b30\u0b32\u0003\u0118\u008c\u0000"+
		"\u0b31\u0b30\u0001\u0000\u0000\u0000\u0b31\u0b32\u0001\u0000\u0000\u0000"+
		"\u0b32\u0b33\u0001\u0000\u0000\u0000\u0b33\u0b34\u0003\u00a6S\u0000\u0b34"+
		"\u0b36\u0005\u01c9\u0000\u0000\u0b35\u0b37\u0003\u011a\u008d\u0000\u0b36"+
		"\u0b35\u0001\u0000\u0000\u0000\u0b36\u0b37\u0001\u0000\u0000\u0000\u0b37"+
		"\u0b58\u0001\u0000\u0000\u0000\u0b38\u0b39\u00073\u0000\u0000\u0b39\u0b3f"+
		"\u0005\u01c8\u0000\u0000\u0b3a\u0b40\u0005\u01cd\u0000\u0000\u0b3b\u0b3d"+
		"\u0003\u0118\u008c\u0000\u0b3c\u0b3b\u0001\u0000\u0000\u0000\u0b3c\u0b3d"+
		"\u0001\u0000\u0000\u0000\u0b3d\u0b3e\u0001\u0000\u0000\u0000\u0b3e\u0b40"+
		"\u0003\u00a6S\u0000\u0b3f\u0b3a\u0001\u0000\u0000\u0000\u0b3f\u0b3c\u0001"+
		"\u0000\u0000\u0000\u0b40\u0b41\u0001\u0000\u0000\u0000\u0b41\u0b43\u0005"+
		"\u01c9\u0000\u0000\u0b42\u0b44\u0003\u011a\u008d\u0000\u0b43\u0b42\u0001"+
		"\u0000\u0000\u0000\u0b43\u0b44\u0001\u0000\u0000\u0000\u0b44\u0b58\u0001"+
		"\u0000\u0000\u0000\u0b45\u0b46\u0005\u00e7\u0000\u0000\u0b46\u0b48\u0005"+
		"\u01c8\u0000\u0000\u0b47\u0b49\u0003\u0118\u008c\u0000\u0b48\u0b47\u0001"+
		"\u0000\u0000\u0000\u0b48\u0b49\u0001\u0000\u0000\u0000\u0b49\u0b4a\u0001"+
		"\u0000\u0000\u0000\u0b4a\u0b4b\u0003\u00a6S\u0000\u0b4b\u0b4c\u0005\u01c9"+
		"\u0000\u0000\u0b4c\u0b58\u0001\u0000\u0000\u0000\u0b4d\u0b4e\u0005\u011c"+
		"\u0000\u0000\u0b4e\u0b4f\u0005\u01c8\u0000\u0000\u0b4f\u0b50\u0003\u00a6"+
		"S\u0000\u0b50\u0b51\u0005\u01c9\u0000\u0000\u0b51\u0b58\u0001\u0000\u0000"+
		"\u0000\u0b52\u0b53\u0005\u011d\u0000\u0000\u0b53\u0b54\u0005\u01c8\u0000"+
		"\u0000\u0b54\u0b55\u0003\u010c\u0086\u0000\u0b55\u0b56\u0005\u01c9\u0000"+
		"\u0000\u0b56\u0b58\u0001\u0000\u0000\u0000\u0b57\u0b2e\u0001\u0000\u0000"+
		"\u0000\u0b57\u0b38\u0001\u0000\u0000\u0000\u0b57\u0b45\u0001\u0000\u0000"+
		"\u0000\u0b57\u0b4d\u0001\u0000\u0000\u0000\u0b57\u0b52\u0001\u0000\u0000"+
		"\u0000\u0b58\u0117\u0001\u0000\u0000\u0000\u0b59\u0b5a\u0007\"\u0000\u0000"+
		"\u0b5a\u0119\u0001\u0000\u0000\u0000\u0b5b\u0b5c\u0005\u007f\u0000\u0000"+
		"\u0b5c\u0b60\u0005\u01c8\u0000\u0000\u0b5d\u0b5e\u0005\u015d\u0000\u0000"+
		"\u0b5e\u0b5f\u0005\u0010\u0000\u0000\u0b5f\u0b61\u0003\u010c\u0086\u0000"+
		"\u0b60\u0b5d\u0001\u0000\u0000\u0000\u0b60\u0b61\u0001\u0000\u0000\u0000"+
		"\u0b61\u0b63\u0001\u0000\u0000\u0000\u0b62\u0b64\u0003\u00c6c\u0000\u0b63"+
		"\u0b62\u0001\u0000\u0000\u0000\u0b63\u0b64\u0001\u0000\u0000\u0000\u0b64"+
		"\u0b66\u0001\u0000\u0000\u0000\u0b65\u0b67\u0003\u011c\u008e\u0000\u0b66"+
		"\u0b65\u0001\u0000\u0000\u0000\u0b66\u0b67\u0001\u0000\u0000\u0000\u0b67"+
		"\u0b68\u0001\u0000\u0000\u0000\u0b68\u0b69\u0005\u01c9\u0000\u0000\u0b69"+
		"\u011b\u0001\u0000\u0000\u0000\u0b6a\u0b6b\u00074\u0000\u0000\u0b6b\u0b6c"+
		"\u0003\u011e\u008f\u0000\u0b6c\u011d\u0001\u0000\u0000\u0000\u0b6d\u0b74"+
		"\u0003\u0122\u0091\u0000\u0b6e\u0b6f\u0005\f\u0000\u0000\u0b6f\u0b70\u0003"+
		"\u0120\u0090\u0000\u0b70\u0b71\u0005\u0005\u0000\u0000\u0b71\u0b72\u0003"+
		"\u0120\u0090\u0000\u0b72\u0b74\u0001\u0000\u0000\u0000\u0b73\u0b6d\u0001"+
		"\u0000\u0000\u0000\u0b73\u0b6e\u0001\u0000\u0000\u0000\u0b74\u011f\u0001"+
		"\u0000\u0000\u0000\u0b75\u0b78\u0003\u0122\u0091\u0000\u0b76\u0b78\u0003"+
		"\u0124\u0092\u0000\u0b77\u0b75\u0001\u0000\u0000\u0000\u0b77\u0b76\u0001"+
		"\u0000\u0000\u0000\u0b78\u0121\u0001\u0000\u0000\u0000\u0b79\u0b7a\u0005"+
		"\u019d\u0000\u0000\u0b7a\u0b80\u0005\u0160\u0000\u0000\u0b7b\u0b7c\u0005"+
		"\u01b1\u0000\u0000\u0b7c\u0b80\u0005\u0160\u0000\u0000\u0b7d\u0b7e\u0005"+
		"\'\u0000\u0000\u0b7e\u0b80\u0005\u0174\u0000\u0000\u0b7f\u0b79\u0001\u0000"+
		"\u0000\u0000\u0b7f\u0b7b\u0001\u0000\u0000\u0000\u0b7f\u0b7d\u0001\u0000"+
		"\u0000\u0000\u0b80\u0123\u0001\u0000\u0000\u0000\u0b81\u0b82\u0005\u019d"+
		"\u0000\u0000\u0b82\u0b86\u0005\u0114\u0000\u0000\u0b83\u0b84\u0005\u01b1"+
		"\u0000\u0000\u0b84\u0b86\u0005\u0114\u0000\u0000\u0b85\u0b81\u0001\u0000"+
		"\u0000\u0000\u0b85\u0b83\u0001\u0000\u0000\u0000\u0b86\u0125\u0001\u0000"+
		"\u0000\u0000\u0b87\u0b88\u0005\u0111\u0000\u0000\u0b88\u0b8d\u0003\u0128"+
		"\u0094\u0000\u0b89\u0b8a\u0005\u01ca\u0000\u0000\u0b8a\u0b8c\u0003\u0128"+
		"\u0094\u0000\u0b8b\u0b89\u0001\u0000\u0000\u0000\u0b8c\u0b8f\u0001\u0000"+
		"\u0000\u0000\u0b8d\u0b8b\u0001\u0000\u0000\u0000\u0b8d\u0b8e\u0001\u0000"+
		"\u0000\u0000\u0b8e\u0baa\u0001\u0000\u0000\u0000\u0b8f\u0b8d\u0001\u0000"+
		"\u0000\u0000\u0b90\u0b91\u0005\u00fe\u0000\u0000\u0b91\u0b94\u0005\u01b7"+
		"\u0000\u0000\u0b92\u0b95\u0003\u014e\u00a7\u0000\u0b93\u0b95\u0005\u01b3"+
		"\u0000\u0000\u0b94\u0b92\u0001\u0000\u0000\u0000\u0b94\u0b93\u0001\u0000"+
		"\u0000\u0000\u0b95\u0baa\u0001\u0000\u0000\u0000\u0b96\u0b97\u0005\u00fd"+
		"\u0000\u0000\u0b97\u0b9a\u0005\u01b7\u0000\u0000\u0b98\u0b9b\u0003\u014e"+
		"\u00a7\u0000\u0b99\u0b9b\u0005\u01b3\u0000\u0000\u0b9a\u0b98\u0001\u0000"+
		"\u0000\u0000\u0b9a\u0b99\u0001\u0000\u0000\u0000\u0b9b\u0baa\u0001\u0000"+
		"\u0000\u0000\u0b9c\u0b9d\u0005\u0147\u0000\u0000\u0b9d\u0b9e\u0005\u01b7"+
		"\u0000\u0000\u0b9e\u0baa\u0007\t\u0000\u0000\u0b9f\u0ba0\u0005\u0197\u0000"+
		"\u0000\u0ba0\u0ba1\u0005\u01b7\u0000\u0000\u0ba1\u0baa\u0007\t\u0000\u0000"+
		"\u0ba2\u0ba3\u0005\u019a\u0000\u0000\u0ba3\u0ba4\u0005\u01b7\u0000\u0000"+
		"\u0ba4\u0baa\u0005\u01b1\u0000\u0000\u0ba5\u0ba6\u0005\u00fc\u0000\u0000"+
		"\u0ba6\u0baa\u0007\t\u0000\u0000\u0ba7\u0ba8\u0005\u0198\u0000\u0000\u0ba8"+
		"\u0baa\u0007\t\u0000\u0000\u0ba9\u0b87\u0001\u0000\u0000\u0000\u0ba9\u0b90"+
		"\u0001\u0000\u0000\u0000\u0ba9\u0b96\u0001\u0000\u0000\u0000\u0ba9\u0b9c"+
		"\u0001\u0000\u0000\u0000\u0ba9\u0b9f\u0001\u0000\u0000\u0000\u0ba9\u0ba2"+
		"\u0001\u0000\u0000\u0000\u0ba9\u0ba5\u0001\u0000\u0000\u0000\u0ba9\u0ba7"+
		"\u0001\u0000\u0000\u0000\u0baa\u0127\u0001\u0000\u0000\u0000\u0bab\u0bb2"+
		"\u0005\u01c8\u0000\u0000\u0bac\u0bad\u0005\u014b\u0000\u0000\u0bad\u0bae"+
		"\u0005\u01b7\u0000\u0000\u0bae\u0bb3\u00075\u0000\u0000\u0baf\u0bb0\u0005"+
		"\u0103\u0000\u0000\u0bb0\u0bb1\u0005\u01b7\u0000\u0000\u0bb1\u0bb3\u0005"+
		"\u01b3\u0000\u0000\u0bb2\u0bac\u0001\u0000\u0000\u0000\u0bb2\u0baf\u0001"+
		"\u0000\u0000\u0000\u0bb3\u0bb4\u0001\u0000\u0000\u0000\u0bb4\u0bb5\u0005"+
		"\u01c9\u0000\u0000\u0bb5\u0129\u0001\u0000\u0000\u0000\u0bb6\u0bb9\u0003"+
		"\u012c\u0096\u0000\u0bb7\u0bb9\u0003\u012e\u0097\u0000\u0bb8\u0bb6\u0001"+
		"\u0000\u0000\u0000\u0bb8\u0bb7\u0001\u0000\u0000\u0000\u0bb9\u012b\u0001"+
		"\u0000\u0000\u0000\u0bba\u0bbb\u0005\u010f\u0000\u0000\u0bbb\u0bbe\u0003"+
		"\u014e\u00a7\u0000\u0bbc\u0bbd\u0005!\u0000\u0000\u0bbd\u0bbf\u0005\u0111"+
		"\u0000\u0000\u0bbe\u0bbc\u0001\u0000\u0000\u0000\u0bbe\u0bbf\u0001\u0000"+
		"\u0000\u0000\u0bbf\u0bc1\u0001\u0000\u0000\u0000\u0bc0\u0bc2\u00051\u0000"+
		"\u0000\u0bc1\u0bc0\u0001\u0000\u0000\u0000\u0bc1\u0bc2\u0001\u0000\u0000"+
		"\u0000\u0bc2\u0bc5\u0001\u0000\u0000\u0000\u0bc3\u0bc4\u0005!\u0000\u0000"+
		"\u0bc4\u0bc6\u0005\u013f\u0000\u0000\u0bc5\u0bc3\u0001\u0000\u0000\u0000"+
		"\u0bc5\u0bc6\u0001\u0000\u0000\u0000\u0bc6\u0bc7\u0001\u0000\u0000\u0000"+
		"\u0bc7\u0bcc\u0003\u012e\u0097\u0000\u0bc8\u0bc9\u0005\u01ca\u0000\u0000"+
		"\u0bc9\u0bcb\u0003\u012e\u0097\u0000\u0bca\u0bc8\u0001\u0000\u0000\u0000"+
		"\u0bcb\u0bce\u0001\u0000\u0000\u0000\u0bcc\u0bca\u0001\u0000\u0000\u0000"+
		"\u0bcc\u0bcd\u0001\u0000\u0000\u0000\u0bcd\u012d\u0001\u0000\u0000\u0000"+
		"\u0bce\u0bcc\u0001\u0000\u0000\u0000\u0bcf\u0bd0\u0005\u01c8\u0000\u0000"+
		"\u0bd0\u0bd1\u0005\u0146\u0000\u0000\u0bd1\u0bd4\u0005\u01b7\u0000\u0000"+
		"\u0bd2\u0bd5\u0003\u014e\u00a7\u0000\u0bd3\u0bd5\u0005\u01b3\u0000\u0000"+
		"\u0bd4\u0bd2\u0001\u0000\u0000\u0000\u0bd4\u0bd3\u0001\u0000\u0000\u0000"+
		"\u0bd5\u0bd7\u0001\u0000\u0000\u0000\u0bd6\u0bd8\u0005\u01ca\u0000\u0000"+
		"\u0bd7\u0bd6\u0001\u0000\u0000\u0000\u0bd7\u0bd8\u0001\u0000\u0000\u0000"+
		"\u0bd8\u0bd9\u0001\u0000\u0000\u0000\u0bd9\u0bda\u0005F\u0000\u0000\u0bda"+
		"\u0bdb\u0005\u01b7\u0000\u0000\u0bdb\u0bdd\u0005\u01b3\u0000\u0000\u0bdc"+
		"\u0bde\u0005\u01ca\u0000\u0000\u0bdd\u0bdc\u0001\u0000\u0000\u0000\u0bdd"+
		"\u0bde\u0001\u0000\u0000\u0000\u0bde\u0be5\u0001\u0000\u0000\u0000\u0bdf"+
		"\u0be0\u0005\u0183\u0000\u0000\u0be0\u0be1\u0005\u01b7\u0000\u0000\u0be1"+
		"\u0be3\u0003\u0156\u00ab\u0000\u0be2\u0be4\u0005\u01ca\u0000\u0000\u0be3"+
		"\u0be2\u0001\u0000\u0000\u0000\u0be3\u0be4\u0001\u0000\u0000\u0000\u0be4"+
		"\u0be6\u0001\u0000\u0000\u0000\u0be5\u0bdf\u0001\u0000\u0000\u0000\u0be5"+
		"\u0be6\u0001\u0000\u0000\u0000\u0be6\u0bf0\u0001\u0000\u0000\u0000\u0be7"+
		"\u0be8\u0005\u013d\u0000\u0000\u0be8\u0beb\u0005\u01b7\u0000\u0000\u0be9"+
		"\u0bec\u0003\u0156\u00ab\u0000\u0bea\u0bec\u0005\u01a0\u0000\u0000\u0beb"+
		"\u0be9\u0001\u0000\u0000\u0000\u0beb\u0bea\u0001\u0000\u0000\u0000\u0bec"+
		"\u0bee\u0001\u0000\u0000\u0000\u0bed\u0bef\u0005\u01ca\u0000\u0000\u0bee"+
		"\u0bed\u0001\u0000\u0000\u0000\u0bee\u0bef\u0001\u0000\u0000\u0000\u0bef"+
		"\u0bf1\u0001\u0000\u0000\u0000\u0bf0\u0be7\u0001\u0000\u0000\u0000\u0bf0"+
		"\u0bf1\u0001\u0000\u0000\u0000\u0bf1\u0bf8\u0001\u0000\u0000\u0000\u0bf2"+
		"\u0bf3\u0005\u0110\u0000\u0000\u0bf3\u0bf4\u0005\u01b7\u0000\u0000\u0bf4"+
		"\u0bf6\u0003\u0156\u00ab\u0000\u0bf5\u0bf7\u0005\u01ca\u0000\u0000\u0bf6"+
		"\u0bf5\u0001\u0000\u0000\u0000\u0bf6\u0bf7\u0001\u0000\u0000\u0000\u0bf7"+
		"\u0bf9\u0001\u0000\u0000\u0000\u0bf8\u0bf2\u0001\u0000\u0000\u0000\u0bf8"+
		"\u0bf9\u0001\u0000\u0000\u0000\u0bf9\u0bfa\u0001\u0000\u0000\u0000\u0bfa"+
		"\u0bfb\u0005\u01c9\u0000\u0000\u0bfb\u012f\u0001\u0000\u0000\u0000\u0bfc"+
		"\u0bfd\u0003\u014e\u00a7\u0000\u0bfd\u0bfe\u0005\u01c3\u0000\u0000\u0bfe"+
		"\u0bff\u0003\u014e\u00a7\u0000\u0bff\u0c00\u0005\u01c3\u0000\u0000\u0c00"+
		"\u0c01\u0003\u014e\u00a7\u0000\u0c01\u0c02\u0005\u01c3\u0000\u0000\u0c02"+
		"\u0c0e\u0001\u0000\u0000\u0000\u0c03\u0c04\u0003\u014e\u00a7\u0000\u0c04"+
		"\u0c06\u0005\u01c3\u0000\u0000\u0c05\u0c07\u0003\u014e\u00a7\u0000\u0c06"+
		"\u0c05\u0001\u0000\u0000\u0000\u0c06\u0c07\u0001\u0000\u0000\u0000\u0c07"+
		"\u0c08\u0001\u0000\u0000\u0000\u0c08\u0c09\u0005\u01c3\u0000\u0000\u0c09"+
		"\u0c0e\u0001\u0000\u0000\u0000\u0c0a\u0c0b\u0003\u014e\u00a7\u0000\u0c0b"+
		"\u0c0c\u0005\u01c3\u0000\u0000\u0c0c\u0c0e\u0001\u0000\u0000\u0000\u0c0d"+
		"\u0bfc\u0001\u0000\u0000\u0000\u0c0d\u0c03\u0001\u0000\u0000\u0000\u0c0d"+
		"\u0c0a\u0001\u0000\u0000\u0000\u0c0d\u0c0e\u0001\u0000\u0000\u0000\u0c0e"+
		"\u0c0f\u0001\u0000\u0000\u0000\u0c0f\u0c10\u0003\u014e\u00a7\u0000\u0c10"+
		"\u0131\u0001\u0000\u0000\u0000\u0c11\u0c12\u0003\u014e\u00a7\u0000\u0c12"+
		"\u0c14\u0005\u01c3\u0000\u0000\u0c13\u0c15\u0003\u014e\u00a7\u0000\u0c14"+
		"\u0c13\u0001\u0000\u0000\u0000\u0c14\u0c15\u0001\u0000\u0000\u0000\u0c15"+
		"\u0c16\u0001\u0000\u0000\u0000\u0c16\u0c17\u0005\u01c3\u0000\u0000\u0c17"+
		"\u0c1c\u0001\u0000\u0000\u0000\u0c18\u0c19\u0003\u014e\u00a7\u0000\u0c19"+
		"\u0c1a\u0005\u01c3\u0000\u0000\u0c1a\u0c1c\u0001\u0000\u0000\u0000\u0c1b"+
		"\u0c11\u0001\u0000\u0000\u0000\u0c1b\u0c18\u0001\u0000\u0000\u0000\u0c1b"+
		"\u0c1c\u0001\u0000\u0000\u0000\u0c1c\u0c1d\u0001\u0000\u0000\u0000\u0c1d"+
		"\u0c1e\u0003\u014e\u00a7\u0000\u0c1e\u0133\u0001\u0000\u0000\u0000\u0c1f"+
		"\u0c20\u0003\u014e\u00a7\u0000\u0c20\u0c21\u0005\u01c3\u0000\u0000\u0c21"+
		"\u0c23\u0001\u0000\u0000\u0000\u0c22\u0c1f\u0001\u0000\u0000\u0000\u0c22"+
		"\u0c23\u0001\u0000\u0000\u0000\u0c23\u0c24\u0001\u0000\u0000\u0000\u0c24"+
		"\u0c25\u0003\u014e\u00a7\u0000\u0c25\u0135\u0001\u0000\u0000\u0000\u0c26"+
		"\u0c27\u0003\u014e\u00a7\u0000\u0c27\u0c29\u0005\u01c3\u0000\u0000\u0c28"+
		"\u0c2a\u0003\u014e\u00a7\u0000\u0c29\u0c28\u0001\u0000\u0000\u0000\u0c29"+
		"\u0c2a\u0001\u0000\u0000\u0000\u0c2a\u0c2b\u0001\u0000\u0000\u0000\u0c2b"+
		"\u0c2c\u0005\u01c3\u0000\u0000\u0c2c\u0c31\u0001\u0000\u0000\u0000\u0c2d"+
		"\u0c2e\u0003\u014e\u00a7\u0000\u0c2e\u0c2f\u0005\u01c3\u0000\u0000\u0c2f"+
		"\u0c31\u0001\u0000\u0000\u0000\u0c30\u0c26\u0001\u0000\u0000\u0000\u0c30"+
		"\u0c2d\u0001\u0000\u0000\u0000\u0c30\u0c31\u0001\u0000\u0000\u0000\u0c31"+
		"\u0c32\u0001\u0000\u0000\u0000\u0c32\u0c33\u0003\u014e\u00a7\u0000\u0c33"+
		"\u0137\u0001\u0000\u0000\u0000\u0c34\u0c37\u0003\u0130\u0098\u0000\u0c35"+
		"\u0c37\u0005\u01b0\u0000\u0000\u0c36\u0c34\u0001\u0000\u0000\u0000\u0c36"+
		"\u0c35\u0001\u0000\u0000\u0000\u0c37\u0139\u0001\u0000\u0000\u0000\u0c38"+
		"\u0c39\u0003\u0132\u0099\u0000\u0c39\u0c3a\u0005\u01c3\u0000\u0000\u0c3a"+
		"\u0c3c\u0001\u0000\u0000\u0000\u0c3b\u0c38\u0001\u0000\u0000\u0000\u0c3b"+
		"\u0c3c\u0001\u0000\u0000\u0000\u0c3c\u0c3d\u0001\u0000\u0000\u0000\u0c3d"+
		"\u0c3e\u0003\u014e\u00a7\u0000\u0c3e\u013b\u0001\u0000\u0000\u0000\u0c3f"+
		"\u0c44\u0003\u014e\u00a7\u0000\u0c40\u0c41\u0005\u01ca\u0000\u0000\u0c41"+
		"\u0c43\u0003\u014e\u00a7\u0000\u0c42\u0c40\u0001\u0000\u0000\u0000\u0c43"+
		"\u0c46\u0001\u0000\u0000\u0000\u0c44\u0c42\u0001\u0000\u0000\u0000\u0c44"+
		"\u0c45\u0001\u0000\u0000\u0000\u0c45\u013d\u0001\u0000\u0000\u0000\u0c46"+
		"\u0c44\u0001\u0000\u0000\u0000\u0c47\u0c4a\u0003\u014e\u00a7\u0000\u0c48"+
		"\u0c4a\u0005\u01b0\u0000\u0000\u0c49\u0c47\u0001\u0000\u0000\u0000\u0c49"+
		"\u0c48\u0001\u0000\u0000\u0000\u0c4a\u013f\u0001\u0000\u0000\u0000\u0c4b"+
		"\u0c4c\u0007\t\u0000\u0000\u0c4c\u0141\u0001\u0000\u0000\u0000\u0c4d\u0c4e"+
		"\u00076\u0000\u0000\u0c4e\u0143\u0001\u0000\u0000\u0000\u0c4f\u0c51\u0005"+
		"n\u0000\u0000\u0c50\u0c4f\u0001\u0000\u0000\u0000\u0c50\u0c51\u0001\u0000"+
		"\u0000\u0000\u0c51\u0c52\u0001\u0000\u0000\u0000\u0c52\u0c53\u0005o\u0000"+
		"\u0000\u0c53\u0145\u0001\u0000\u0000\u0000\u0c54\u0c5a\u0003\u0136\u009b"+
		"\u0000\u0c55\u0c5a\u0005\u0096\u0000\u0000\u0c56\u0c5a\u0005c\u0000\u0000"+
		"\u0c57\u0c5a\u0005\u00df\u0000\u0000\u0c58\u0c5a\u0005\u00e6\u0000\u0000"+
		"\u0c59\u0c54\u0001\u0000\u0000\u0000\u0c59\u0c55\u0001\u0000\u0000\u0000"+
		"\u0c59\u0c56\u0001\u0000\u0000\u0000\u0c59\u0c57\u0001\u0000\u0000\u0000"+
		"\u0c59\u0c58\u0001\u0000\u0000\u0000\u0c5a\u0147\u0001\u0000\u0000\u0000"+
		"\u0c5b\u0c5e\u0005o\u0000\u0000\u0c5c\u0c5e\u0003\u014a\u00a5\u0000\u0c5d"+
		"\u0c5b\u0001\u0000\u0000\u0000\u0c5d\u0c5c\u0001\u0000\u0000\u0000\u0c5e"+
		"\u0149\u0001\u0000\u0000\u0000\u0c5f\u0c6f\u0005\u01b3\u0000\u0000\u0c60"+
		"\u0c6f\u0005\u01b4\u0000\u0000\u0c61\u0c63\u0003\u014c\u00a6\u0000\u0c62"+
		"\u0c61\u0001\u0000\u0000\u0000\u0c62\u0c63\u0001\u0000\u0000\u0000\u0c63"+
		"\u0c64\u0001\u0000\u0000\u0000\u0c64\u0c6f\u0005\u01b1\u0000\u0000\u0c65"+
		"\u0c67\u0003\u014c\u00a6\u0000\u0c66\u0c65\u0001\u0000\u0000\u0000\u0c66"+
		"\u0c67\u0001\u0000\u0000\u0000\u0c67\u0c68\u0001\u0000\u0000\u0000\u0c68"+
		"\u0c6f\u00077\u0000\u0000\u0c69\u0c6b\u0003\u014c\u00a6\u0000\u0c6a\u0c69"+
		"\u0001\u0000\u0000\u0000\u0c6a\u0c6b\u0001\u0000\u0000\u0000\u0c6b\u0c6c"+
		"\u0001\u0000\u0000\u0000\u0c6c\u0c6d\u0005\u01c7\u0000\u0000\u0c6d\u0c6f"+
		"\u00078\u0000\u0000\u0c6e\u0c5f\u0001\u0000\u0000\u0000\u0c6e\u0c60\u0001"+
		"\u0000\u0000\u0000\u0c6e\u0c62\u0001\u0000\u0000\u0000\u0c6e\u0c66\u0001"+
		"\u0000\u0000\u0000\u0c6e\u0c6a\u0001\u0000\u0000\u0000\u0c6f\u014b\u0001"+
		"\u0000\u0000\u0000\u0c70\u0c71\u0007\u001e\u0000\u0000\u0c71\u014d\u0001"+
		"\u0000\u0000\u0000\u0c72\u0c76\u0003\u0150\u00a8\u0000\u0c73\u0c76\u0005"+
		"\u01ae\u0000\u0000\u0c74\u0c76\u0005\u01af\u0000\u0000\u0c75\u0c72\u0001"+
		"\u0000\u0000\u0000\u0c75\u0c73\u0001\u0000\u0000\u0000\u0c75\u0c74\u0001"+
		"\u0000\u0000\u0000\u0c76\u014f\u0001\u0000\u0000\u0000\u0c77\u0c78\u0007"+
		"9\u0000\u0000\u0c78\u0151\u0001\u0000\u0000\u0000\u0c79\u0c89\u0005\u01b7"+
		"\u0000\u0000\u0c7a\u0c89\u0005\u01b8\u0000\u0000\u0c7b\u0c89\u0005\u01b9"+
		"\u0000\u0000\u0c7c\u0c7d\u0005\u01b9\u0000\u0000\u0c7d\u0c89\u0005\u01b7"+
		"\u0000\u0000\u0c7e\u0c7f\u0005\u01b8\u0000\u0000\u0c7f\u0c89\u0005\u01b7"+
		"\u0000\u0000\u0c80\u0c81\u0005\u01b9\u0000\u0000\u0c81\u0c89\u0005\u01b8"+
		"\u0000\u0000\u0c82\u0c83\u0005\u01ba\u0000\u0000\u0c83\u0c89\u0005\u01b7"+
		"\u0000\u0000\u0c84\u0c85\u0005\u01ba\u0000\u0000\u0c85\u0c89\u0005\u01b8"+
		"\u0000\u0000\u0c86\u0c87\u0005\u01ba\u0000\u0000\u0c87\u0c89\u0005\u01b9"+
		"\u0000\u0000\u0c88\u0c79\u0001\u0000\u0000\u0000\u0c88\u0c7a\u0001\u0000"+
		"\u0000\u0000\u0c88\u0c7b\u0001\u0000\u0000\u0000\u0c88\u0c7c\u0001\u0000"+
		"\u0000\u0000\u0c88\u0c7e\u0001\u0000\u0000\u0000\u0c88\u0c80\u0001\u0000"+
		"\u0000\u0000\u0c88\u0c82\u0001\u0000\u0000\u0000\u0c88\u0c84\u0001\u0000"+
		"\u0000\u0000\u0c88\u0c86\u0001\u0000\u0000\u0000\u0c89\u0153\u0001\u0000"+
		"\u0000\u0000\u0c8a\u0c8b\u0007:\u0000\u0000\u0c8b\u0155\u0001\u0000\u0000"+
		"\u0000\u0c8c\u0c8e\u0005\u01b1\u0000\u0000\u0c8d\u0c8f\u0007;\u0000\u0000"+
		"\u0c8e\u0c8d\u0001\u0000\u0000\u0000\u0c8e\u0c8f\u0001\u0000\u0000\u0000"+
		"\u0c8f\u0157\u0001\u0000\u0000\u0000\u0c90\u0c93\u0005%\u0000\u0000\u0c91"+
		"\u0c92\u0005|\u0000\u0000\u0c92\u0c94\u0005\u0004\u0000\u0000\u0c93\u0c91"+
		"\u0001\u0000\u0000\u0000\u0c93\u0c94\u0001\u0000\u0000\u0000\u0c94\u0c97"+
		"\u0001\u0000\u0000\u0000\u0c95\u0c97\u0005\u0004\u0000\u0000\u0c96\u0c90"+
		"\u0001\u0000\u0000\u0000\u0c96\u0c95\u0001\u0000\u0000\u0000\u0c97\u0c98"+
		"\u0001\u0000\u0000\u0000\u0c98\u0c99\u0007<\u0000\u0000\u0c99\u0c9c\u0003"+
		"\u0136\u009b\u0000\u0c9a\u0c9b\u0005\u01cb\u0000\u0000\u0c9b\u0c9d\u0005"+
		"\u01b1\u0000\u0000\u0c9c\u0c9a\u0001\u0000\u0000\u0000\u0c9c\u0c9d\u0001"+
		"\u0000\u0000\u0000\u0c9d\u0cac\u0001\u0000\u0000\u0000\u0c9e\u0ca0\u0005"+
		"\u01c8\u0000\u0000\u0c9f\u0c9e\u0001\u0000\u0000\u0000\u0c9f\u0ca0\u0001"+
		"\u0000\u0000\u0000\u0ca0\u0ca1\u0001\u0000\u0000\u0000\u0ca1\u0ca6\u0003"+
		"\u0162\u00b1\u0000\u0ca2\u0ca3\u0005\u01ca\u0000\u0000\u0ca3\u0ca5\u0003"+
		"\u0162\u00b1\u0000\u0ca4\u0ca2\u0001\u0000\u0000\u0000\u0ca5\u0ca8\u0001"+
		"\u0000\u0000\u0000\u0ca6\u0ca4\u0001\u0000\u0000\u0000\u0ca6\u0ca7\u0001"+
		"\u0000\u0000\u0000\u0ca7\u0caa\u0001\u0000\u0000\u0000\u0ca8\u0ca6\u0001"+
		"\u0000\u0000\u0000\u0ca9\u0cab\u0005\u01c9\u0000\u0000\u0caa\u0ca9\u0001"+
		"\u0000\u0000\u0000\u0caa\u0cab\u0001\u0000\u0000\u0000\u0cab\u0cad\u0001"+
		"\u0000\u0000\u0000\u0cac\u0c9f\u0001\u0000\u0000\u0000\u0cac\u0cad\u0001"+
		"\u0000\u0000\u0000\u0cad\u0cb7\u0001\u0000\u0000\u0000\u0cae\u0caf\u0005"+
		"\u00c7\u0000\u0000\u0caf\u0cb4\u0003\u0164\u00b2\u0000\u0cb0\u0cb1\u0005"+
		"\u01ca\u0000\u0000\u0cb1\u0cb3\u0003\u0164\u00b2\u0000\u0cb2\u0cb0\u0001"+
		"\u0000\u0000\u0000\u0cb3\u0cb6\u0001\u0000\u0000\u0000\u0cb4\u0cb2\u0001"+
		"\u0000\u0000\u0000\u0cb4\u0cb5\u0001\u0000\u0000\u0000\u0cb5\u0cb8\u0001"+
		"\u0000\u0000\u0000\u0cb6\u0cb4\u0001\u0000\u0000\u0000\u0cb7\u0cae\u0001"+
		"\u0000\u0000\u0000\u0cb7\u0cb8\u0001\u0000\u0000\u0000\u0cb8\u0cbb\u0001"+
		"\u0000\u0000\u0000\u0cb9\u0cba\u0005H\u0000\u0000\u0cba\u0cbc\u0005\u008f"+
		"\u0000\u0000\u0cbb\u0cb9\u0001\u0000\u0000\u0000\u0cbb\u0cbc\u0001\u0000"+
		"\u0000\u0000\u0cbc\u0cbd\u0001\u0000\u0000\u0000\u0cbd\u0cbe\u0005\u0007"+
		"\u0000\u0000\u0cbe\u0cbf\u0003\u0004\u0002\u0000\u0cbf\u0159\u0001\u0000"+
		"\u0000\u0000\u0cc0\u0cc3\u0005%\u0000\u0000\u0cc1\u0cc2\u0005|\u0000\u0000"+
		"\u0cc2\u0cc4\u0005\u0004\u0000\u0000\u0cc3\u0cc1\u0001\u0000\u0000\u0000"+
		"\u0cc3\u0cc4\u0001\u0000\u0000\u0000\u0cc4\u0cc7\u0001\u0000\u0000\u0000"+
		"\u0cc5\u0cc7\u0005\u0004\u0000\u0000\u0cc6\u0cc0\u0001\u0000\u0000\u0000"+
		"\u0cc6\u0cc5\u0001\u0000\u0000\u0000\u0cc7\u0cc8\u0001\u0000\u0000\u0000"+
		"\u0cc8\u0cc9\u0005O\u0000\u0000\u0cc9\u0cd7\u0003\u0136\u009b\u0000\u0cca"+
		"\u0ccb\u0005\u01c8\u0000\u0000\u0ccb\u0cd0\u0003\u0162\u00b1\u0000\u0ccc"+
		"\u0ccd\u0005\u01ca\u0000\u0000\u0ccd\u0ccf\u0003\u0162\u00b1\u0000\u0cce"+
		"\u0ccc\u0001\u0000\u0000\u0000\u0ccf\u0cd2\u0001\u0000\u0000\u0000\u0cd0"+
		"\u0cce\u0001\u0000\u0000\u0000\u0cd0\u0cd1\u0001\u0000\u0000\u0000\u0cd1"+
		"\u0cd3\u0001\u0000\u0000\u0000\u0cd2\u0cd0\u0001\u0000\u0000\u0000\u0cd3"+
		"\u0cd4\u0005\u01c9\u0000\u0000\u0cd4\u0cd8\u0001\u0000\u0000\u0000\u0cd5"+
		"\u0cd6\u0005\u01c8\u0000\u0000\u0cd6\u0cd8\u0005\u01c9\u0000\u0000\u0cd7"+
		"\u0cca\u0001\u0000\u0000\u0000\u0cd7\u0cd5\u0001\u0000\u0000\u0000\u0cd8"+
		"\u0cdc\u0001\u0000\u0000\u0000\u0cd9\u0cdd\u0003\u015c\u00ae\u0000\u0cda"+
		"\u0cdd\u0003\u015e\u00af\u0000\u0cdb\u0cdd\u0003\u0160\u00b0\u0000\u0cdc"+
		"\u0cd9\u0001\u0000\u0000\u0000\u0cdc\u0cda\u0001\u0000\u0000\u0000\u0cdc"+
		"\u0cdb\u0001\u0000\u0000\u0000\u0cdd\u0cdf\u0001\u0000\u0000\u0000\u0cde"+
		"\u0ce0\u0005\u01cb\u0000\u0000\u0cdf\u0cde\u0001\u0000\u0000\u0000\u0cdf"+
		"\u0ce0\u0001\u0000\u0000\u0000\u0ce0\u015b\u0001\u0000\u0000\u0000\u0ce1"+
		"\u0ce2\u0005\u0093\u0000\u0000\u0ce2\u0cec\u0005\u00aa\u0000\u0000\u0ce3"+
		"\u0ce4\u0005\u00c7\u0000\u0000\u0ce4\u0ce9\u0003\u0166\u00b3\u0000\u0ce5"+
		"\u0ce6\u0005\u01ca\u0000\u0000\u0ce6\u0ce8\u0003\u0166\u00b3\u0000\u0ce7"+
		"\u0ce5\u0001\u0000\u0000\u0000\u0ce8\u0ceb\u0001\u0000\u0000\u0000\u0ce9"+
		"\u0ce7\u0001\u0000\u0000\u0000\u0ce9\u0cea\u0001\u0000\u0000\u0000\u0cea"+
		"\u0ced\u0001\u0000\u0000\u0000\u0ceb\u0ce9\u0001\u0000\u0000\u0000\u0cec"+
		"\u0ce3\u0001\u0000\u0000\u0000\u0cec\u0ced\u0001\u0000\u0000\u0000\u0ced"+
		"\u0cef\u0001\u0000\u0000\u0000\u0cee\u0cf0\u0005\u0007\u0000\u0000\u0cef"+
		"\u0cee\u0001\u0000\u0000\u0000\u0cef\u0cf0\u0001\u0000\u0000\u0000\u0cf0"+
		"\u0cf1\u0001\u0000\u0000\u0000\u0cf1\u0cf7\u0005\u0092\u0000\u0000\u0cf2"+
		"\u0cf3\u0005\u01c8\u0000\u0000\u0cf3\u0cf4\u0003\u0018\f\u0000\u0cf4\u0cf5"+
		"\u0005\u01c9\u0000\u0000\u0cf5\u0cf8\u0001\u0000\u0000\u0000\u0cf6\u0cf8"+
		"\u0003\u0018\f\u0000\u0cf7\u0cf2\u0001\u0000\u0000\u0000\u0cf7\u0cf6\u0001"+
		"\u0000\u0000\u0000\u0cf8\u015d\u0001\u0000\u0000\u0000\u0cf9\u0cfa\u0005"+
		"\u0093\u0000\u0000\u0cfa\u0cfb\u0005\u01b0\u0000\u0000\u0cfb\u0d05\u0003"+
		"\u008cF\u0000\u0cfc\u0cfd\u0005\u00c7\u0000\u0000\u0cfd\u0d02\u0003\u0166"+
		"\u00b3\u0000\u0cfe\u0cff\u0005\u01ca\u0000\u0000\u0cff\u0d01\u0003\u0166"+
		"\u00b3\u0000\u0d00\u0cfe\u0001\u0000\u0000\u0000\u0d01\u0d04\u0001\u0000"+
		"\u0000\u0000\u0d02\u0d00\u0001\u0000\u0000\u0000\u0d02\u0d03\u0001\u0000"+
		"\u0000\u0000\u0d03\u0d06\u0001\u0000\u0000\u0000\u0d04\u0d02\u0001\u0000"+
		"\u0000\u0000\u0d05\u0cfc\u0001\u0000\u0000\u0000\u0d05\u0d06\u0001\u0000"+
		"\u0000\u0000\u0d06\u0d08\u0001\u0000\u0000\u0000\u0d07\u0d09\u0005\u0007"+
		"\u0000\u0000\u0d08\u0d07\u0001\u0000\u0000\u0000\u0d08\u0d09\u0001\u0000"+
		"\u0000\u0000\u0d09\u0d0a\u0001\u0000\u0000\u0000\u0d0a\u0d0e\u0005\u000b"+
		"\u0000\u0000\u0d0b\u0d0d\u0003\u0006\u0003\u0000\u0d0c\u0d0b\u0001\u0000"+
		"\u0000\u0000\u0d0d\u0d10\u0001\u0000\u0000\u0000\u0d0e\u0d0c\u0001\u0000"+
		"\u0000\u0000\u0d0e\u0d0f\u0001\u0000\u0000\u0000\u0d0f\u0d11\u0001\u0000"+
		"\u0000\u0000\u0d10\u0d0e\u0001\u0000\u0000\u0000\u0d11\u0d13\u0005\u0092"+
		"\u0000\u0000\u0d12\u0d14\u0005\u01cb\u0000\u0000\u0d13\u0d12\u0001\u0000"+
		"\u0000\u0000\u0d13\u0d14\u0001\u0000\u0000\u0000\u0d14\u0d15\u0001\u0000"+
		"\u0000\u0000\u0d15\u0d17\u0005<\u0000\u0000\u0d16\u0d18\u0005\u01cb\u0000"+
		"\u0000\u0d17\u0d16\u0001\u0000\u0000\u0000\u0d17\u0d18\u0001\u0000\u0000"+
		"\u0000\u0d18\u015f\u0001\u0000\u0000\u0000\u0d19\u0d1a\u0005\u0093\u0000"+
		"\u0000\u0d1a\u0d24\u0003\u016c\u00b6\u0000\u0d1b\u0d1c\u0005\u00c7\u0000"+
		"\u0000\u0d1c\u0d21\u0003\u0166\u00b3\u0000\u0d1d\u0d1e\u0005\u01ca\u0000"+
		"\u0000\u0d1e\u0d20\u0003\u0166\u00b3\u0000\u0d1f\u0d1d\u0001\u0000\u0000"+
		"\u0000\u0d20\u0d23\u0001\u0000\u0000\u0000\u0d21\u0d1f\u0001\u0000\u0000"+
		"\u0000\u0d21\u0d22\u0001\u0000\u0000\u0000\u0d22\u0d25\u0001\u0000\u0000"+
		"\u0000\u0d23\u0d21\u0001\u0000\u0000\u0000\u0d24\u0d1b\u0001\u0000\u0000"+
		"\u0000\u0d24\u0d25\u0001\u0000\u0000\u0000\u0d25\u0d27\u0001\u0000\u0000"+
		"\u0000\u0d26\u0d28\u0005\u0007\u0000\u0000\u0d27\u0d26\u0001\u0000\u0000"+
		"\u0000\u0d27\u0d28\u0001\u0000\u0000\u0000\u0d28\u0d29\u0001\u0000\u0000"+
		"\u0000\u0d29\u0d2d\u0005\u000b\u0000\u0000\u0d2a\u0d2c\u0003\u0006\u0003"+
		"\u0000\u0d2b\u0d2a\u0001\u0000\u0000\u0000\u0d2c\u0d2f\u0001\u0000\u0000"+
		"\u0000\u0d2d\u0d2b\u0001\u0000\u0000\u0000\u0d2d\u0d2e\u0001\u0000\u0000"+
		"\u0000\u0d2e\u0d30\u0001\u0000\u0000\u0000\u0d2f\u0d2d\u0001\u0000\u0000"+
		"\u0000\u0d30\u0d31\u0005\u0092\u0000\u0000\u0d31\u0d33\u0003\u00a6S\u0000"+
		"\u0d32\u0d34\u0005\u01cb\u0000\u0000\u0d33\u0d32\u0001\u0000\u0000\u0000"+
		"\u0d33\u0d34\u0001\u0000\u0000\u0000\u0d34\u0d35\u0001\u0000\u0000\u0000"+
		"\u0d35\u0d36\u0005<\u0000\u0000\u0d36\u0161\u0001\u0000\u0000\u0000\u0d37"+
		"\u0d3b\u0005\u01b0\u0000\u0000\u0d38\u0d39\u0003\u014e\u00a7\u0000\u0d39"+
		"\u0d3a\u0005\u01c3\u0000\u0000\u0d3a\u0d3c\u0001\u0000\u0000\u0000\u0d3b"+
		"\u0d38\u0001\u0000\u0000\u0000\u0d3b\u0d3c\u0001\u0000\u0000\u0000\u0d3c"+
		"\u0d3e\u0001\u0000\u0000\u0000\u0d3d\u0d3f\u0005\u0007\u0000\u0000\u0d3e"+
		"\u0d3d\u0001\u0000\u0000\u0000\u0d3e\u0d3f\u0001\u0000\u0000\u0000\u0d3f"+
		"\u0d40\u0001\u0000\u0000\u0000\u0d40\u0d42\u0003\u016c\u00b6\u0000\u0d41"+
		"\u0d43\u0005\u00c1\u0000\u0000\u0d42\u0d41\u0001\u0000\u0000\u0000\u0d42"+
		"\u0d43\u0001\u0000\u0000\u0000\u0d43\u0d46\u0001\u0000\u0000\u0000\u0d44"+
		"\u0d45\u0005\u01b7\u0000\u0000\u0d45\u0d47\u0003\u0148\u00a4\u0000\u0d46"+
		"\u0d44\u0001\u0000\u0000\u0000\u0d46\u0d47\u0001\u0000\u0000\u0000\u0d47"+
		"\u0d49\u0001\u0000\u0000\u0000\u0d48\u0d4a\u0007=\u0000\u0000\u0d49\u0d48"+
		"\u0001\u0000\u0000\u0000\u0d49\u0d4a\u0001\u0000\u0000\u0000\u0d4a\u0163"+
		"\u0001\u0000\u0000\u0000\u0d4b\u0d4f\u0005\u010a\u0000\u0000\u0d4c\u0d4f"+
		"\u0005\u016a\u0000\u0000\u0d4d\u0d4f\u0003\u0088D\u0000\u0d4e\u0d4b\u0001"+
		"\u0000\u0000\u0000\u0d4e\u0d4c\u0001\u0000\u0000\u0000\u0d4e\u0d4d\u0001"+
		"\u0000\u0000\u0000\u0d4f\u0165\u0001\u0000\u0000\u0000\u0d50\u0d5d\u0005"+
		"\u010a\u0000\u0000\u0d51\u0d5d\u0005\u0179\u0000\u0000\u0d52\u0d53\u0005"+
		"\u0093\u0000\u0000\u0d53\u0d54\u0005o\u0000\u0000\u0d54\u0d55\u0005u\u0000"+
		"\u0000\u0d55\u0d56\u0005o\u0000\u0000\u0d56\u0d5d\u0005\u0126\u0000\u0000"+
		"\u0d57\u0d58\u0005\u0011\u0000\u0000\u0d58\u0d59\u0005u\u0000\u0000\u0d59"+
		"\u0d5a\u0005o\u0000\u0000\u0d5a\u0d5d\u0005\u0126\u0000\u0000\u0d5b\u0d5d"+
		"\u0003\u0088D\u0000\u0d5c\u0d50\u0001\u0000\u0000\u0000\u0d5c\u0d51\u0001"+
		"\u0000\u0000\u0000\u0d5c\u0d52\u0001\u0000\u0000\u0000\u0d5c\u0d57\u0001"+
		"\u0000\u0000\u0000\u0d5c\u0d5b\u0001\u0000\u0000\u0000\u0d5d\u0167\u0001"+
		"\u0000\u0000\u0000\u0d5e\u0d5f\u0005\u015f\u0000\u0000\u0d5f\u0d60\u0005"+
		"\u01c8\u0000\u0000\u0d60\u0d61\u0003\u00a6S\u0000\u0d61\u0d62\u0005\u01c9"+
		"\u0000\u0000\u0d62\u0d63\u0005\u00c8\u0000\u0000\u0d63\u0d64\u0005R\u0000"+
		"\u0000\u0d64\u0d65\u0005\u01c8\u0000\u0000\u0d65\u0d66\u0003\u00c6c\u0000"+
		"\u0d66\u0d67\u0005\u01c9\u0000\u0000\u0d67\u0d68\u0003\u011a\u008d\u0000"+
		"\u0d68\u0169\u0001\u0000\u0000\u0000\u0d69\u0d6a\u0005\u018b\u0000\u0000"+
		"\u0d6a\u0d6b\u0005\u01c8\u0000\u0000\u0d6b\u0d6c\u0003\u00a6S\u0000\u0d6c"+
		"\u0d6d\u0005\u01ca\u0000\u0000\u0d6d\u0d6e\u0003\u00a6S\u0000\u0d6e\u0d6f"+
		"\u0005\u01c9\u0000\u0000\u0d6f\u0d70\u0005\u00c8\u0000\u0000\u0d70\u0d71"+
		"\u0005R\u0000\u0000\u0d71\u0d72\u0005\u01c8\u0000\u0000\u0d72\u0d73\u0003"+
		"\u00c6c\u0000\u0d73\u0d74\u0005\u01c9\u0000\u0000\u0d74\u016b\u0001\u0000"+
		"\u0000\u0000\u0d75\u0d77\u0003\u014e\u00a7\u0000\u0d76\u0d78\u0005T\u0000"+
		"\u0000\u0d77\u0d76\u0001\u0000\u0000\u0000\u0d77\u0d78\u0001\u0000\u0000"+
		"\u0000\u0d78\u0d80\u0001\u0000\u0000\u0000\u0d79\u0d7a\u0005\u01c8\u0000"+
		"\u0000\u0d7a\u0d7d\u0007>\u0000\u0000\u0d7b\u0d7c\u0005\u01ca\u0000\u0000"+
		"\u0d7c\u0d7e\u0005\u01b1\u0000\u0000\u0d7d\u0d7b\u0001\u0000\u0000\u0000"+
		"\u0d7d\u0d7e\u0001\u0000\u0000\u0000\u0d7e\u0d7f\u0001\u0000\u0000\u0000"+
		"\u0d7f\u0d81\u0005\u01c9\u0000\u0000\u0d80\u0d79\u0001\u0000\u0000\u0000"+
		"\u0d80\u0d81\u0001\u0000\u0000\u0000\u0d81\u0d90\u0001\u0000\u0000\u0000"+
		"\u0d82\u0d90\u0005\u00f3\u0000\u0000\u0d83\u0d84\u0005\u00f8\u0000\u0000"+
		"\u0d84\u0d85\u0005\u01c8\u0000\u0000\u0d85\u0d86\u0005\u01b1\u0000\u0000"+
		"\u0d86\u0d90\u0005\u01c9\u0000\u0000\u0d87\u0d89\u00058\u0000\u0000\u0d88"+
		"\u0d8a\u0005\u0084\u0000\u0000\u0d89\u0d88\u0001\u0000\u0000\u0000\u0d89"+
		"\u0d8a\u0001\u0000\u0000\u0000\u0d8a\u0d90\u0001\u0000\u0000\u0000\u0d8b"+
		"\u0d90\u0005\u0127\u0000\u0000\u0d8c\u0d90\u0005\u0195\u0000\u0000\u0d8d"+
		"\u0d90\u0005\u0184\u0000\u0000\u0d8e\u0d90\u0005\u00de\u0000\u0000\u0d8f"+
		"\u0d75\u0001\u0000\u0000\u0000\u0d8f\u0d82\u0001\u0000\u0000\u0000\u0d8f"+
		"\u0d83\u0001\u0000\u0000\u0000\u0d8f\u0d87\u0001\u0000\u0000\u0000\u0d8f"+
		"\u0d8b\u0001\u0000\u0000\u0000\u0d8f\u0d8c\u0001\u0000\u0000\u0000\u0d8f"+
		"\u0d8d\u0001\u0000\u0000\u0000\u0d8f\u0d8e\u0001\u0000\u0000\u0000\u0d90"+
		"\u016d\u0001\u0000\u0000\u0000\u01ed\u0171\u0178\u017c\u0180\u0186\u018c"+
		"\u019e\u01a2\u01a5\u01a9\u01ad\u01b1\u01b6\u01bb\u01c2\u01c5\u01c9\u01cc"+
		"\u01d4\u01d7\u01dc\u01df\u01e4\u01e9\u01ec\u01f1\u01f7\u01fe\u0202\u0204"+
		"\u0209\u0216\u021b\u021d\u0226\u0229\u022d\u0230\u0234\u0237\u023b\u023e"+
		"\u0241\u0244\u0247\u024b\u0250\u0253\u0257\u025a\u025e\u0261\u0267\u026a"+
		"\u026e\u0271\u0274\u027b\u027e\u0282\u0285\u0288\u028b\u028e\u0292\u0296"+
		"\u0299\u02a1\u02a5\u02a9\u02ac\u02af\u02b2\u02b5\u02bc\u02c0\u02c2\u02ca"+
		"\u02d0\u02d6\u02d8\u02dc\u02df\u02e2\u02e7\u02ec\u02ef\u02f7\u02fb\u0302"+
		"\u0305\u030e\u0311\u0315\u031d\u0320\u0324\u0327\u0330\u0334\u0338\u033b"+
		"\u034b\u034f\u0355\u0357\u035a\u0362\u0368\u036d\u0370\u0379\u0381\u0384"+
		"\u038b\u038e\u03b3\u03b6\u03bc\u03c8\u03ca\u03cd\u03e5\u03f0\u03f8\u0403"+
		"\u0408\u040b\u0413\u041d\u0437\u043d\u0448\u0456\u045e\u0465\u047c\u0489"+
		"\u048f\u0494\u0497\u049d\u04a1\u04a8\u04b1\u04b5\u04bb\u04c2\u04c6\u04d3"+
		"\u04d9\u04ea\u04ee\u04f6\u04fa\u0502\u0506\u0508\u050c\u0510\u0514\u0518"+
		"\u051e\u0522\u0524\u0529\u0531\u0534\u0537\u0540\u0545\u054a\u054d\u054f"+
		"\u0553\u0557\u055a\u055e\u0564\u0569\u0570\u0572\u0576\u057d\u0581\u0584"+
		"\u058d\u0590\u0592\u059b\u05a6\u05aa\u05ac\u05ae\u05b4\u05b9\u05c0\u05cd"+
		"\u05cf\u05d1\u05d4\u05d7\u05de\u05e1\u05e7\u05ec\u05ee\u05f1\u05f7\u05ff"+
		"\u0601\u0604\u0608\u060b\u0611\u0614\u0618\u061b\u0621\u0624\u0626\u062a"+
		"\u062f\u0637\u063c\u0645\u064a\u064f\u0655\u0659\u065c\u0660\u0666\u066e"+
		"\u0673\u0675\u0678\u067d\u0682\u0685\u068a\u068d\u0690\u0696\u069c\u06a0"+
		"\u06a5\u06a8\u06ad\u06b1\u06b5\u06bb\u06c1\u06ca\u06d4\u06de\u06e0\u06e2"+
		"\u06e5\u06e8\u06f3\u06f5\u06f7\u06fa\u06fd\u0700\u0703\u0706\u0709\u0715"+
		"\u0718\u071b\u0724\u0727\u072a\u0731\u0734\u0742\u0745\u074c\u075b\u075f"+
		"\u076c\u0770\u0778\u077c\u0790\u07a4\u07a6\u07b1\u07b8\u07bf\u07c7\u07d0"+
		"\u07d4\u07de\u07e5\u07f1\u07f3\u080a\u0813\u0819\u081f\u0825\u0830\u0838"+
		"\u0840\u0845\u0849\u084d\u0850\u0855\u0859\u085d\u0866\u0869\u086c\u0870"+
		"\u0874\u0880\u088e\u0893\u0898\u089c\u08a3\u08ac\u08b3\u08b5\u08c3\u08cb"+
		"\u08ce\u08d0\u08d7\u08db\u08e6\u0908\u0918\u091e\u0925\u092b\u0930\u0938"+
		"\u093b\u093d\u0944\u094d\u095e\u0960\u0965\u0968\u096b\u096f\u0974\u0976"+
		"\u097a\u097e\u0982\u0989\u098b\u098d\u0991\u0996\u099b\u09a2\u09af\u09b3"+
		"\u09b5\u09b8\u09bc\u09d0\u09d4\u09d8\u09e3\u09ea\u0a01\u0a4c\u0a50\u0a6c"+
		"\u0a8e\u0a92\u0a9f\u0aa7\u0ab3\u0ab9\u0ac2\u0ad3\u0ad9\u0ae1\u0ae5\u0aed"+
		"\u0af4\u0afe\u0b06\u0b26\u0b2c\u0b31\u0b36\u0b3c\u0b3f\u0b43\u0b48\u0b57"+
		"\u0b60\u0b63\u0b66\u0b73\u0b77\u0b7f\u0b85\u0b8d\u0b94\u0b9a\u0ba9\u0bb2"+
		"\u0bb8\u0bbe\u0bc1\u0bc5\u0bcc\u0bd4\u0bd7\u0bdd\u0be3\u0be5\u0beb\u0bee"+
		"\u0bf0\u0bf6\u0bf8\u0c06\u0c0d\u0c14\u0c1b\u0c22\u0c29\u0c30\u0c36\u0c3b"+
		"\u0c44\u0c49\u0c50\u0c59\u0c5d\u0c62\u0c66\u0c6a\u0c6e\u0c75\u0c88\u0c8e"+
		"\u0c93\u0c96\u0c9c\u0c9f\u0ca6\u0caa\u0cac\u0cb4\u0cb7\u0cbb\u0cc3\u0cc6"+
		"\u0cd0\u0cd7\u0cdc\u0cdf\u0ce9\u0cec\u0cef\u0cf7\u0d02\u0d05\u0d08\u0d0e"+
		"\u0d13\u0d17\u0d21\u0d24\u0d27\u0d2d\u0d33\u0d3b\u0d3e\u0d42\u0d46\u0d49"+
		"\u0d4e\u0d5c\u0d77\u0d7d\u0d80\u0d89\u0d8f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}