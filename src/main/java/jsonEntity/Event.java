package jsonEntity;

import jsonEntity.enums.Type;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Setter
@Getter
@ToString
public class Event {

    private long game;

    private Type type;

    private Payload payload;

    public Event(long game, Type type, Payload payload) {
        this.game = game;
        this.type = type;
        this.payload = payload;
    }

    public Event() {}
}