package br.com.dosanjosdeveloper.Academia.Registro.infra.jackson;

import br.com.dosanjosdeveloper.Academia.Registro.infra.jackson.deser.LocalDateDeserializers;
import br.com.dosanjosdeveloper.Academia.Registro.infra.jackson.ser.LocalDateSerializers;
import br.com.dosanjosdeveloper.Academia.Registro.infra.jackson.ser.LocalDateTimeSerializers;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class ObjectMapperConfig implements Jackson2ObjectMapperBuilderCustomizer {
    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
        jacksonObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .serializerByType(LocalDate.class, new LocalDateSerializers())
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializers())
                .deserializerByType(LocalDate.class, new LocalDateDeserializers())
                .deserializerByType(LocalDateTime.class, new LocalDateDeserializers());
    }
}
