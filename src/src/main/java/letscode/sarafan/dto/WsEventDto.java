package letscode.sarafan.dto;

import com.fasterxml.jackson.annotation.JsonRawValue;
import letscode.sarafan.dto.enums.EventType;
import letscode.sarafan.dto.enums.ObjectType;
import lombok.Data;

@Data
//@JsonView(Views.Id.class)
public class WsEventDto {
    private ObjectType objectType;
    private EventType eventType;

    @JsonRawValue
    private String body;

    public WsEventDto(ObjectType objectType, EventType eventType, String body) {
        this.objectType = objectType;
        this.eventType = eventType;
        this.body = body;
    }
}