package rs.ac.singidunum.projekat.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class RequestSetZakljucenDTO {
    @NotNull
    @Size(min = 1)
    List<Integer> ispIds;
}
