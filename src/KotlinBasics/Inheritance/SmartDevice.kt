package KotlinBasics.Inheritance

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "offline"
        protected set

    open val deviceType = "unknown"

    open fun turnOn() {
        if (deviceStatus != "on") {
            deviceStatus = "on"
            println("$name is now ON")
        }
    }

    open fun turnOff() {
        if (deviceStatus != "off") {
            deviceStatus = "off"
            println("$name is now OFF")
        }
    }

    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 1, maxValue = 200)

    fun increaseVolume() {
        if (deviceStatus == "on") {
            speakerVolume++
            println("Speaker volume increased to $speakerVolume.")
        }
    }

    fun decreaseVolume() {
        if (deviceStatus == "on") {
            speakerVolume--
            println("Speaker volume decreased to $speakerVolume.")
        }
    }

    fun nextChannel() {
        if (deviceStatus == "on") {
            channelNumber++
            println("Channel changed to $channelNumber.")
        }
    }

    fun previousChannel() {
        if (deviceStatus == "on" && channelNumber > 1) {
            channelNumber--
            println("Channel changed to $channelNumber.")
        }
    }

    override fun turnOn() {
        super.turnOn()
        println("$name is turned on. Volume: $speakerVolume, Channel: $channelNumber.")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name is turned off.")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        if (deviceStatus == "on") {
            brightnessLevel++
            println("Brightness increased to $brightnessLevel.")
        }
    }

    fun decreaseBrightness() {
        if (deviceStatus == "on") {
            brightnessLevel--
            println("Brightness decreased to $brightnessLevel.")
        }
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 10
        println("$name is turned on. Brightness level: $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("$name is turned off.")
    }
}

class SmartHome(
    private val smartTvDevice: SmartTvDevice,
    private val smartLightDevice: SmartLightDevice
) {
    private var deviceTurnOnCount = 0

    fun turnOnTv() {
        if (smartTvDevice.deviceStatus != "on") {
            smartTvDevice.turnOn()
            deviceTurnOnCount++
        }
    }

    private fun turnOffTv() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.turnOff()
            deviceTurnOnCount--
        }
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseVolume()
    }

    fun decreaseTvVolume() {
        smartTvDevice.decreaseVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun changeTvChannelToPrevious() {
        smartTvDevice.previousChannel()
    }

    fun turnOnLight() {
        if (smartLightDevice.deviceStatus != "on") {
            smartLightDevice.turnOn()
            deviceTurnOnCount++
        }
    }

    private fun turnOffLight() {
        if (smartLightDevice.deviceStatus == "on") {
            smartLightDevice.turnOff()
            deviceTurnOnCount--
        }
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun decreaseLightBrightness() {
        smartLightDevice.decreaseBrightness()
    }

    fun turnOffAllDevices() {
        if (deviceTurnOnCount > 0) {
            turnOffTv()
            turnOffLight()
        }
    }
}

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    private var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}

fun main() {
    val tv = SmartTvDevice("Android TV", "Entertainment")
    val light = SmartLightDevice("Google Light", "Utility")
    val smartHome = SmartHome(tv, light)

    println("---- Smart Home System ----")
    tv.printDeviceInfo()
    light.printDeviceInfo()

    println("\nTurning on TV and Light...")
    smartHome.turnOnTv()
    smartHome.turnOnLight()

    println("\nAdjusting TV settings...")
    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.changeTvChannelToPrevious()
    smartHome.decreaseTvVolume()

    println("\nAdjusting Light settings...")
    smartHome.increaseLightBrightness()
    smartHome.decreaseLightBrightness()

    println("\nTurning off all devices...")
    smartHome.turnOffAllDevices()
}
