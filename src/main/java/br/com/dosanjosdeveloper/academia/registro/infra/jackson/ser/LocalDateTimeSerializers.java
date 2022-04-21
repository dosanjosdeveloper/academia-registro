package br.com.dosanjosdeveloper.Academia.Registro.infra.jackson.ser;

import br.com.dosanjosdeveloper.Academia.Registro.infra.utils.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDateTime;

public class LocalDateTimeSerializers extends StdSerializer<LocalDateTime> {

    private static final long serialVersiobUID =  -6347158617481757931L;

    public LocalDateTimeSerializers(){
        super(LocalDateTime.class);

    }

    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(localDateTime.format(JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER));
    }
}
