package de.konqi.roborockbridge.bridge

import de.konqi.roborockbridge.persistence.entity.DeviceState

data class DeviceStateForPublish(
    val schema: Int,
    val code: String,
    val value: String,
    val rawValue: Int,
    val possibleValues: Map<Int, String>
) {
    companion object {
        fun fromDeviceStateEntity(
            deviceState: DeviceState,
            interpreter: SchemaValueInterpreter
        ): DeviceStateForPublish = DeviceStateForPublish(
            schema = deviceState.schemaId,
            code = deviceState.code,
            value = interpreter.interpret(schemaId = deviceState.schemaId, value = deviceState.value),
            possibleValues = interpreter.getOptions(schemaId = deviceState.schemaId),
            rawValue = deviceState.value,
        )
    }
}