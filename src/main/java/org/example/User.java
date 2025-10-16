package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Bach912
 * @Description: TODO
 * @DateTime: 2025/10/8 13:18
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Integer id;


    private String name;
    private Integer age;
    private Integer a;

    public void f(){
        System.out.println();
    }
}
