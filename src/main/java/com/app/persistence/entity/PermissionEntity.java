package com.app.persistence.entity;

import com.app.persistence.enumeration.PermissionEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "permissions")
public class PermissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permission_id;
    @Column(name = "permission" , nullable = false, unique = true, updatable = false)
    @Enumerated(EnumType.STRING)
    private PermissionEnum permission;
}
