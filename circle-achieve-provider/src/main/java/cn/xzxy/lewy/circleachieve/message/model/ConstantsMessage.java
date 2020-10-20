package cn.xzxy.lewy.circleachieve.message.model;


/**
 * follow the regulation of 'there are more than one business type in the same title'
 *
 * example message:
 *
 *   {
 *      "topic":"circle-kafka",
 *      "title":"TITLE_FOR_EU",
 *      "value":{
 *          "businessType": "QUERY",
 *          "data":{"country":"Poland", "countryId": 9}
 *       }
 *    }
 *    {
 *      "topic":"circle-kafka",
 *      "title":"TITLE_FOR_EU",
 *      "value":{
 *          "businessType": "INSERT",
 *          "data":{"country":"Poland", "countryId": 9}
 *       }
 *    }
 *    {
 *       "topic":"circle-kafka",
 *       "title":"TITLE_FOR_AS",
 *       "value":{
 *       "businessType": "QUERY",
 *       "data":{"country":"Poland", "countryId": 9}
 *    }
 * }
 * so the message has three layers: topic >>> title >>> businessType
 *
 * @author lewy95
 */
public class ConstantsMessage {

    /** TOPIC */
    public static final String COUNTRY_TOPIC = "circle-kafka";

    /** TITLE one for query */
    public static final String TITLE_FOR_EU = "EU";

    /** TITLE two for insert */
    public static final String TITLE_FOR_AS = "AS";

    /** Business type for EU */
    public static final String BUSINESS_TYPE_QUERY = "QUERY";

    /** Business type for AS */
    public static final String BUSINESS_TYPE_INSERT = "INSERT";
}
