package br.com.dosanjosdeveloper.Academia.Registro.infra.jackson.deser;

import br.com.dosanjosdeveloper.Academia.Registro.infra.utils.JavaTimeUtils;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateDeserializers extends StdDeserializer<LocalDate> {

    private static final long serialVersionUID = -4589164298310392227L;
    public LocalDateDeserializers() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return LocalDate.parse(jsonParser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_FORMATTER);
    }
}
