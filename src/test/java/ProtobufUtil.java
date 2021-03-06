public class ProtobufUtil {
    /*public static void setLocationMsg(String terminalPhone, TerminalLocationMsg msg) {
        ServerData.TerminalLocationMsg terminalLocationMsgComplete = ServerData.TerminalLocationMsg.newBuilder()
                .setWarningFlag(ServerData.TerminalLocationMsg.WarningFlag.newBuilder()
                        .setWarningFlag(msg.getWarningFlag().isWarningfFlag())
                        .setOverSpeeding(msg.getWarningFlag().isOverSpeeding())
                        .setOverTired(msg.getWarningFlag().isOverTired())
                        .setDangerous(msg.getWarningFlag().isDangerous())
                        .setGNSSFault(msg.getWarningFlag().isGNSSFault())
                        .setGNSSAntennaFault(msg.getWarningFlag().isGNSSAntennaFault())
                        .setGNSSAntennaShortCircuit(msg.getWarningFlag().isGNSSAntennaShortCircuit())
                        .setTerminalMainPowerUnderVoltage(msg.getWarningFlag().isTerminalMainPowerUnderVoltage())
                        .setTerminalMainPowerFailure(msg.getWarningFlag().isTerminalMainPowerFailure())
                        .setTerminalLCDFault(msg.getWarningFlag().isTerminalLCDFault())
                        .setTTSFault(msg.getWarningFlag().isTTSFault())
                        .setCameraFault(msg.getWarningFlag().isCameraFault())
                        .setICCardFault(msg.getWarningFlag().isICCardFault())
                        .setSpeeding(msg.getWarningFlag().isSpeeding())
                        .setTired(msg.getWarningFlag().isTired())
                        .setDriveTimeout(msg.getWarningFlag().isDriveTimeout())
                        .setParkingOvertime(msg.getWarningFlag().isParkingOvertime())
                        .setThroughArea(msg.getWarningFlag().isThroughArea())
                        .setThroughRoad(msg.getWarningFlag().isThroughRoad())
                        .setRoadTimeout(msg.getWarningFlag().isRoadTimeout())
                        .setRoadFault(msg.getWarningFlag().isRoadFault())
                        .setVSSFault(msg.getWarningFlag().isVSSFault())
                        .setVehicleOilException(msg.getWarningFlag().isVehicleOilException())
                        .setVehicleTheft(msg.getWarningFlag().isVehicleTheft())
                        .setVehicleIllegalIgnition(msg.getWarningFlag().isVehicleIllegalIgnition())
                        .setVehicleIllegalShift(msg.getWarningFlag().isVehicleIllegalShift())
                        .setCollisionWarning(msg.getWarningFlag().isCollisionWarning())
                        .setRolloverWarning(msg.getWarningFlag().isRolloverWarning())
                        .setIllegalOpenDoor(msg.getWarningFlag().isIllegalOpenDoor())
                        .build()
                )
                .setStatus(ServerData.TerminalLocationMsg.Status.newBuilder()
                        .setACC(msg.getStatus().isACC())
                        .setIsLocation(msg.getStatus().isLocation())
                        .setLatitude(msg.getStatus().isLatitude())
                        .setLongitude(msg.getStatus().isLongitude())
                        .setIsRunning(msg.getStatus().isRunning())
                        .setEncrypt(msg.getStatus().isEncrypt())
                        .setGoodsStatus(msg.getStatus().getGoodsStatus())
                        .setVehicleOil(msg.getStatus().isVehicleOil())
                        .setVehicleCircut(msg.getStatus().isVehicleCircut())
                        .setDoorLock(msg.getStatus().isDoorLock())
                        .setFrontDoorOpen(msg.getStatus().isFrontDoorOpen())
                        .setMiddleDoorOpen(msg.getStatus().isMiddleDoorOpen())
                        .setEndDoorOpen(msg.getStatus().isEndDoorOpen())
                        .setDriverDoorOpen(msg.getStatus().isDriverDoorOpen())
                        .setOtherDoorOpen(msg.getStatus().isOtherDoorOpen())
                        .setGPS(msg.getStatus().isGPS())
                        .setBeidou(msg.getStatus().isBeidou())
                        .setGLONASS(msg.getStatus().isGLONASS())
                        .setGalileo(msg.getStatus().isGalileo())
                )
                .setLatitude(msg.getLatitude())
                .setLongitude(msg.getLongitude())
                .setElevation(msg.getElevation())
                .setSpeed(msg.getSpeed())
                .setDirection(msg.getDirection())
                .setTime(msg.getTime())
                *//*.setTerminalExtraLocationMsg(ServerData.TerminalLocationMsg.TerminalExtraLocationMsg.newBuilder()
                        .setMileage(msg.getTerminalExtraLocationMsg().getMileage())
                        .setOilQuantity(msg.getTerminalExtraLocationMsg().getOilQuantity())
                        .setCarSpeed(msg.getTerminalExtraLocationMsg().getCarSpeed())
                        .setWarningId(msg.getTerminalExtraLocationMsg().getWarningId())
                        .setSpeedingExtraData(ServerData.TerminalLocationMsg.TerminalExtraLocationMsg.SpeedingExtraData.newBuilder()
                                .setLocationType(msg.getTerminalExtraLocationMsg().getSpeedingExtraData().getLocationType())
                                .setLocationId(msg.getTerminalExtraLocationMsg().getSpeedingExtraData().getLocationId()).build()
                        )
                        .setLocationExtraData(ServerData.TerminalLocationMsg.TerminalExtraLocationMsg.LocationExtraData.newBuilder()
                                .setLocationType(msg.getTerminalExtraLocationMsg().getLocationExtraData().getLocationType())
                                .setLocationId(msg.getTerminalExtraLocationMsg().getLocationExtraData().getLocationId())
                                .setDirection(msg.getTerminalExtraLocationMsg().getLocationExtraData().getDirection()).build()
                        )
                        .setLocationInfoExtraData(ServerData.TerminalLocationMsg.TerminalExtraLocationMsg.LocationInfoExtraData.newBuilder()
                                .setRoadId(msg.getTerminalExtraLocationMsg().getLocationInfoExtraData().getRoadId())
                                .setRunTime(msg.getTerminalExtraLocationMsg().getLocationInfoExtraData().getRunTime())
                                .setResult(msg.getTerminalExtraLocationMsg().getLocationInfoExtraData().getResult()).build()
                        )
                        .setExtraCarState(ServerData.TerminalLocationMsg.TerminalExtraLocationMsg.ExtraCarState.newBuilder()
                                .setLowLightSignal(msg.getTerminalExtraLocationMsg().getExtraCarState().isLowLightSignal())
                                .setFarLightSignal(msg.getTerminalExtraLocationMsg().getExtraCarState().isFarLightSignal())
                                .setRightLightSignal(msg.getTerminalExtraLocationMsg().getExtraCarState().isRightLightSignal())
                                .setLeftLightSignal(msg.getTerminalExtraLocationMsg().getExtraCarState().isLeftLightSignal())
                                .setBrakingSignal(msg.getTerminalExtraLocationMsg().getExtraCarState().isBrakingSignal())
                                .setReverseSignal(msg.getTerminalExtraLocationMsg().getExtraCarState().isReverseSignal())
                                .setFogLampSignal(msg.getTerminalExtraLocationMsg().getExtraCarState().isFogLampSignal())
                                .setOutlineLamp(msg.getTerminalExtraLocationMsg().getExtraCarState().isOutlineLamp())
                                .setHornSignal(msg.getTerminalExtraLocationMsg().getExtraCarState().isHornSignal())
                                .setAirCondition(msg.getTerminalExtraLocationMsg().getExtraCarState().isAirCondition())
                                .setNeutralSignal(msg.getTerminalExtraLocationMsg().getExtraCarState().isNeutralSignal())
                                .setRetarderOperation(msg.getTerminalExtraLocationMsg().getExtraCarState().isRetarderOperation())
                                .setABSOperation(msg.getTerminalExtraLocationMsg().getExtraCarState().isABSOperation())
                                .setHeaterOperation(msg.getTerminalExtraLocationMsg().getExtraCarState().isHeaterOperation())
                                .setClutchState(msg.getTerminalExtraLocationMsg().getExtraCarState().isClutchState()).build()
                        )
                        .setIoState(ServerData.TerminalLocationMsg.TerminalExtraLocationMsg.IOState.newBuilder()
                                .setDeepDormancy(msg.getTerminalExtraLocationMsg().getIoState().isDeepDormancy())
                                .setDormancy(msg.getTerminalExtraLocationMsg().getIoState().isDormancy()).build()
                        )
                        .setSimulation(msg.getTerminalExtraLocationMsg().getSimulation())
                        .setWirelessIntensity(msg.getTerminalExtraLocationMsg().getWirelessIntensity())
                        .setSatellitesNum(msg.getTerminalExtraLocationMsg().getSatellitesNum()).build()
                )*//*
                .build();
        try (Jedis jedis = new Jedis(RedisUtil.REDIS_HOST)) {
            jedis.set(terminalPhone.getBytes(), terminalLocationMsgComplete.toByteArray());
        }
    }*/


    /*ServerData.TerminalAttributeQueryResponseMsg terminalAttributeQueryResponseMsg = ServerData.TerminalAttributeQueryResponseMsg.newBuilder()
                .setTerminalType(ServerData.TerminalAttributeQueryResponseMsg.TerminalType.newBuilder()
                        .setPassengerVehicles(msg.getTerminalType().isPassengerVehicles())
                        .setDangerousGoodsVehicles(msg.getTerminalType().isDangerousGoodsVehicles())
                        .setCommonFreightVehicle(msg.getTerminalType().isCommonFreightVehicle())
                        .setTaxi(msg.getTerminalType().isTaxi())
                        .setSupportingHardDiskVideo(msg.getTerminalType().isSupportingHardDiskVideo())
                        .setIntegratedMachine(msg.getTerminalType().isIntegratedMachine()).build())
                .setManufacturerId(msg.getManufacturerId())
                .setTerminalModel(msg.getTerminalModel())
                .setTerminalId(msg.getTerminalId())
                .setICCID(msg.getICCID())
                .setTerminalHardwareVersion(msg.getTerminalHardwareVersion())
                .setTerminalFirmwareVersion(msg.getTerminalFirmwareVersion())
                .setGnssAttribute(ServerData.TerminalAttributeQueryResponseMsg.GNSSAttribute.newBuilder()
                        .setGPS(msg.getGnssAttribute().isGPS())
                        .setBeidou(msg.getGnssAttribute().isBeidou())
                        .setGLONASS(msg.getGnssAttribute().isGLONASS())
                        .setGalileo(msg.getGnssAttribute().isGalileo()).build())
                .setCommunicationModuleAttribute(ServerData.TerminalAttributeQueryResponseMsg.CommunicationModuleAttribute.newBuilder()
                        .setGPSCommunication(msg.getCommunicationModuleAttribute().isGPSCommunication())
                        .setCDMA(msg.getCommunicationModuleAttribute().isCDMA())
                        .setTDSCMA(msg.getCommunicationModuleAttribute().isTDSCMA())
                        .setWCDMA(msg.getCommunicationModuleAttribute().isWCDMA())
                        .setCDMA2000(msg.getCommunicationModuleAttribute().isCDMA2000())
                        .setTDLTE(msg.getCommunicationModuleAttribute().isTDLTE())
                        .setOtherCommunication(msg.getCommunicationModuleAttribute().isOtherCommunication()).build()).build();*/
}
