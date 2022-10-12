package risi.cruds;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class biodata {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
private int idnum;
private String name;
private long contact;
}
