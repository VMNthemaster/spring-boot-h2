package dev.vmn.h2_demo.model;

import org.springframework.data.annotation.Id;

public record Teacher(@Id Integer T_id, String name, String dept) {
}
