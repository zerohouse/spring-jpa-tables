package com.zerohouse.tables;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;

import static com.icon.infra.config.WebConfig.OBJECT_MAPPER;

@Converter
public class JsonConverter implements AttributeConverter<Object, String> {

    private final static ObjectMapper objectMapper = OBJECT_MAPPER;

    @Override
    public String convertToDatabaseColumn(Object meta) {
        try {
            if (meta == null)
                return null;
            return objectMapper.writeValueAsString(meta);
        } catch (JsonProcessingException ex) {
            return null;
        }
    }

    @Override
    public Object convertToEntityAttribute(String dbData) {
        try {
            if (dbData == null)
                return null;
            return objectMapper.readValue(dbData, Object.class);
        } catch (IOException ex) {
            return null;
        }
    }

}
