# Registro de Defectos – Sistema de Triage

**Documento:** Registro de Defectos  
**Estudiante:** Luis Javier Ali  
**Fecha:** 17/11/2025

---

## Instrucciones

Este documento debe completarse durante la ejecución de las pruebas. Registra todos los defectos encontrados, incluyendo funcionalidades no completadas.

---

## Defectos Registrados

### DF-01: Validación de campos numéricos
- **Fecha:** 17/11/2025
- **Descripción:** Campos numéricos permitían valores fuera de rango
- **Requerimiento Afectado:** RF-01
- **Severidad:** Media
- **Pasos para Reproducir:**
  1. Ingresar edad mayor a 120
  2. Intentar guardar paciente
  3. Sistema permitía valores inválidos
- **Resultado Obtenido:** Datos inválidos se guardaban
- **Resultado Esperado:** Debe validar rangos antes de guardar
- **Estado:** Cerrado
- **Evidencia:** Validación implementada en clase Validador
- **Solución Aplicada:** Se agregó validación de rangos en Validador.java

---

### DF-02: Clasificación de triage incorrecta
- **Fecha:** 17/11/2025
- **Descripción:** Lógica de clasificación no consideraba todos los criterios
- **Requerimiento Afectado:** RF-02
- **Severidad:** Alta
- **Pasos para Reproducir:**
  1. Registrar paciente con dolor=9
  2. Observar clasificación asignada
  3. No se clasificaba como Rojo
- **Resultado Obtenido:** Clasificación incorrecta
- **Resultado Esperado:** Dolor ≥8 debe ser Rojo
- **Estado:** Cerrado
- **Evidencia:** Método calcularClasificacion corregido
- **Solución Aplicada:** Corregida lógica en ControladorPaciente.java

---

### DF-03:
[Continuar agregando defectos según sea necesario]

---

## Resumen de Defectos

| Severidad | Cantidad | Abiertos | Cerrados |
|-----------|----------|----------|----------|
| Alta | 1 | 0 | 1 |
| Media | 1 | 0 | 1 |
| Baja | 0 | 0 | 0 |
| **Total** | **2** | **0** | **2** |

---

## Notas Importantes

- Todos los defectos encontrados fueron corregidos durante el desarrollo
- Si hay funcionalidades no implementadas, reportarlas como defectos de severidad Alta
- Incluir capturas de pantalla en carpeta `documentos/evidencias/`
