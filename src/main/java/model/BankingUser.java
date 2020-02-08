package model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Component
@Data
@Table(name = "BankingUser")
public class BankingUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
}
