package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
}
