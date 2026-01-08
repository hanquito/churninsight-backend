ALTER TABLE clientes
    MODIFY cambio_plan BOOLEAN NOT NULL,
    MODIFY pago_automatico BOOLEAN NOT NULL,
    ADD churn BOOLEAN NOT NULL;

