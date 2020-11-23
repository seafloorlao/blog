package run.halo.app.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "lovely", indexes = {@Index(name = "id", columnList = "create_time")})
@ToString
@EqualsAndHashCode(callSuper = true)
public class Lovely {

}
