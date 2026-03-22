package com.agencia.project01.domain;

/**
 * Roles de usuario
 * 
 * @author David Vivanco
 * @version 1.0
 * @since 2026-03-22
 * 
 *        Roles:
 *        VISITANTE: Solo ve vuelos y hoteles
 *        CLIENTE: Puede reservar y pagar
 *        EMPLEADO: Gestiona reservas y stock
 *        GERENTE: Ve reportes masivos y estadisticas
 */

public enum UserRole {
    VISITANTE,
    CLIENTE,
    EMPLEADO,
    GERENTE
}