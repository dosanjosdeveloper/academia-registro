package br.com.dosanjosdeveloper.Academia.Registro.infra.jackson.deser;

import br.com.dosanjosdeveloper.Academia.Registro.infra.utils.JavaTimeUtils;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;

public class LocalDateTimeDeserializers extends StdDeserializer<LocalDateTime> {

    private static final long serialVersionUID = -7209271947629593913L;

    public LocalDateTimeDeserializers() {
        super(LocalDateTime.class);
    }

    @Override
    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
       return LocalDateTime.parse(jsonParser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER);
    }
}
