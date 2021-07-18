package one.digitalinnovation.personapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id generated automatically
    private Long id;

    @Enumerated(EnumType.STRING) //defined type of enum
    @Column(nullable = false) //not null
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
