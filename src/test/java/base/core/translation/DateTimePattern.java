package base.core.translation;


import base.core.constants.Dir;
import base.core.enums.ELanguage;
import base.core.helpers.FReader;
import org.json.JSONObject;

public class DateTimePattern {

    private final JSONObject object;

    private ELanguage language;

    private String SearchFormPattern;
    private String bookingPattern;
    private String reservationPattern;


    public DateTimePattern(ELanguage language) {
        JSONObject data = FReader.readJSON(Dir.Resources.ADDITIONAL + "/patterns.json");
        object = data.getJSONObject(language.code);
    }

    public String searchForm() {
        return object.getString("form");
    }

    public String booking() {
        return object.getString("booking");
    }

    public String reservation() {
        return object.getString("reservation");
    }
}
