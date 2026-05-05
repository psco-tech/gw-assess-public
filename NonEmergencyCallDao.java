@Query("SELECT ac FROM NonEmergencyCall ac WHERE ac.callId = :callId AND ac.deleted = false")
Optional<NonEmergencyCall> findByCallId(@Param("callId") String callId);
