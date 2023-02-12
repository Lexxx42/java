/**
 * This module is for creating SQL query from JSON string.
 * And print it to console.
 */

package java_gb.hw2;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Parses data from JSON with json-simple.
 * <a href="https://github.com/fangyidong/json-simple">...</a>
 * With use of StringBuilder, creates SQL query as a string.
 * Prints SQL query to console.
 */
public class SQLquery {
    public static void main(String[] args) throws ParseException {
        String strSQL = "SELECT * FROM students WHERE ";
        String jsonInputString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String query = getSQLquery(strSQL, parser(jsonInputString));
        printToConsole(query);
    }

    /**
     * Prints SQL query to console.
     *
     * @param str - data for output.
     */
    public static void printToConsole(String str) {
        System.out.println("SQL query:");
        System.out.println(str);
    }

    /**
     * Combines initial part of SQL query with parsed part.
     *
     * @param initQuery   - initial part of SQL query.
     * @param parsedQuery - parsed part of SQL query.
     * @return SQL query string.
     */
    public static String getSQLquery(String initQuery, String parsedQuery) {
        return initQuery + parsedQuery;
    }

    /**
     * Parses data form JSON string.
     *
     * @param jsonString - JSON string for parsing.
     * @return parsed part of SQL query.
     */
    public static String parser(String jsonString) throws ParseException {
        StringBuilder stringBuilder = new StringBuilder();

        Object obj = new JSONParser().parse(jsonString);
        JSONObject jo = (JSONObject) obj;

        for (int i = 0; i < jo.keySet().toArray().length - 1; i++) {
            var item = jo.keySet().toArray()[i];
            String value = (String) jo.get(item);
            if (value.equals("null")) {
                continue;
            } else {
                stringBuilder.append(item).append('=').append('\'').append(value).append('\'');
            }
        }

        var lastItem = jo.keySet().toArray()[jo.keySet().toArray().length - 1];
        String lastValue = (String) jo.get(lastItem);

        if (!lastValue.equals("null")) {
            stringBuilder.append(" AND ").append(lastItem).append('=').append('\'').append(lastValue).append('\'');
        }
        stringBuilder.append(';');
        return stringBuilder.toString();
    }
}
