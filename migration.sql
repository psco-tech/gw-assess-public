CREATE TABLE non_emergency_call (
  id BIGINT NOT NULL AUTO_INCREMENT,
  call_id VARCHAR(255) NOT NULL,
  tenant_id BIGINT NOT NULL,
  ...
  UNIQUE KEY uk_non_emergency_call_call_id (call_id),
  INDEX idx_non_emergency_call_tenant_date (tenant_id, call_at)
);
