package io.datains.plugins.common.constants;


public class DorisConstants extends SQLConstants {

    public static final String KEYWORD_TABLE = DatasourceTypes.ds_doris.getKeywordPrefix() + "%s" + DatasourceTypes.ds_doris.getKeywordSuffix();

    public static final String KEYWORD_FIX = "%s." + DatasourceTypes.ds_doris.getKeywordPrefix() + "%s" + DatasourceTypes.ds_doris.getKeywordSuffix();

    public static final String UNIX_TIMESTAMP = "UNIX_TIMESTAMP(%s)";

    public static final String DATE_FORMAT = "DATE_FORMAT(%s,'%s')";

    public static final String FROM_UNIXTIME = "FROM_UNIXTIME(%s,'%s')";

    public static final String STR_TO_DATE = "STR_TO_DATE(%s,'%s')";

    public static final String CAST = "CAST(%s AS %s)";

    public static final String DEFAULT_DATE_FORMAT = "%Y-%m-%d %H:%i:%S";

    public static final String DEFAULT_INT_FORMAT = "BIGINT";

    public static final String DEFAULT_FLOAT_FORMAT = "DECIMAL(20,2)";

    public static final String WHERE_VALUE_NULL = "(NULL,'')";

    public static final String WHERE_VALUE_VALUE = "'%s'";

    public static final String WHERE_NUMBER_VALUE = "%s";

    public static final String AGG_COUNT = "COUNT(*)";

    public static final String AGG_FIELD = "%s(%s)";

    public static final String WHERE_BETWEEN = "'%s' AND '%s'";

    public static final String BRACKETS = "(%s)";

    public static final String ROUND = "ROUND(%s,%s)";

    public static final String VARCHAR = "VARCHAR";

    public static final String NAME = "ds_doris";


}