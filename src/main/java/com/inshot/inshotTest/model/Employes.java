package com.inshot.inshotTest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employes {
    // nama, nomor telepon, posisi, dan alamat email
    private Integer Id;
    private String name;
    private String phone;
    private String position;
    private String email;
}
