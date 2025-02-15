package exercise.model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

// BEGIN
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Setter
@Table(name = "task")
@EntityListeners(AuditingEntityListener.class)
public class Task {

    @LastModifiedDate
    private LocalDate updatedAt;

    @CreatedDate
    private LocalDate createdAt;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    private String title;
    private String description;
}
// END
