package br.com.dosanjosdeveloper.Academia.Registro.infra.jackson.ser;

import br.com.dosanjosdeveloper.Academia.Registro.infra.utils.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateSerializers extends StdSerializer<LocalDate> {

    private static final long serialVersionUID = -2718386750062666481L;

    public LocalDateSerializers(){
        super(LocalDate.class);
    }
    @Override
    public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, final SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(localDate.format(JavaTimeUtils.LOCAL_DATE_FORMATTER));
    }
}
