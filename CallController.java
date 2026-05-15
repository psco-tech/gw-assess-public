// CallController.java — downloadCallAudio

var call = callService.loadCallById(id);
if (call == null || !call.tenantId().equals(authentication.getUser().tenantId())) {
    throw new HandledException("Could not find call");
}
if ("NON_EMERGENCY_AGENT".equals(call.callProducer())) {
    var nonEmergencyCall = nonEmergencyCallDao.findByCallIdAndTenantId(id, call.tenantId());
    if (nonEmergencyCall.isPresent() && nonEmergencyCall.get().getRecordingS3Key() != null) {
        callS3Key = nonEmergencyCall.get().getRecordingS3Key();
    }
}
