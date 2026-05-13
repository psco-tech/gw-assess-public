@Query("SELECT n FROM NonEmergencyCall n WHERE n.callId = :callId AND n.tenantId = :tenantId AND n.deleted = false")
Optional<NonEmergencyCall> findByCallIdAndTenantId(@Param("callId") String callId, @Param("tenantId") Long tenantId);
