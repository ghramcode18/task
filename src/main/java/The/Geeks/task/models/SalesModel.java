package The.Geeks.task.models;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class SalesModel {

    private Long id;
    private LocalDate creationDate;
    private double total;
    private String client;
    private String saller;

}
