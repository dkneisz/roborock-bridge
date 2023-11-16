package de.konqi.roborockbridge.roborockbridge.protocol.mqtt

import com.fasterxml.jackson.annotation.JsonProperty


data class Result(
    @get:JsonProperty("msg_ver") val msg_ver: Int,
    @get:JsonProperty("msg_seq") val msg_seq: Int,
    val state: Int,
    val battery: Int,
    @get:JsonProperty("clean_time") val clean_time: Int,
    @get:JsonProperty("clean_area") val clean_area: Int,
    @get:JsonProperty("error_code") val error_code: Int,
    @get:JsonProperty("map_present") val map_present: Int,
    @get:JsonProperty("in_cleaning") val in_cleaning: Int,
    @get:JsonProperty("in_returning") val in_returning: Int,
    @get:JsonProperty("in_fresh_state") val in_fresh_state: Int,
    @get:JsonProperty("lab_status") val lab_status: Int,
    @get:JsonProperty("water_box_status") val water_box_status: Int,
    @get:JsonProperty("fan_power") val fan_power: Int,
    @get:JsonProperty("dnd_enabled") val dnd_enabled: Int,
    @get:JsonProperty("map_status") val map_status: Int,
    @get:JsonProperty("is_locating") val is_locating: Int,
    @get:JsonProperty("lock_status") val lock_status: Int,
    @get:JsonProperty("water_box_mode") val water_box_mode: Int,
    @get:JsonProperty("water_box_carriage_status") val water_box_carriage_status: Int,
    @get:JsonProperty("mop_forbidden_enable") val mop_forbidden_enable: Int,
    @get:JsonProperty("camera_status") val camera_status: Int,
    @get:JsonProperty("is_exploring") val is_exploring: Int,
    @get:JsonProperty("adbumper_status") val adbumper_status: Array<Int>,
    @get:JsonProperty("water_shortage_status") val water_shortage_status: Int,
    @get:JsonProperty("dock_type") val dock_type: Int,
    @get:JsonProperty("dust_collection_status") val dust_collection_status: Int,
    @get:JsonProperty("auto_dust_collection") val auto_dust_collection: Int,
    @get:JsonProperty("avoid_count") val avoid_count: Int,
    @get:JsonProperty("mop_mode") val mop_mode: Int,
    @get:JsonProperty("back_type") val back_type: Int,
    @get:JsonProperty("wash_phase") val wash_phase: Int,
    @get:JsonProperty("wash_ready") val wash_ready: Int,
    @get:JsonProperty("wash_status") val wash_status: Int,
    @get:JsonProperty("debug_mode") val debug_mode: Int,
    @get:JsonProperty("collision_avoid_status") val collision_avoid_status: Int,
    @get:JsonProperty("switch_map_mode") val switch_map_mode: Int,
    @get:JsonProperty("dock_error_status") val dock_error_status: Int,
    @get:JsonProperty("charge_status") val charge_status: Int,
    @get:JsonProperty("unsave_map_reason") val unsave_map_reason: Int,
    @get:JsonProperty("unsave_map_flag") val unsave_map_flag: Int,
    @get:JsonProperty("dry_status") val dry_status: Int,
    @get:JsonProperty("rdt") val rdt: Int,
    @get:JsonProperty("clean_percent") val clean_percent: Int,
    @get:JsonProperty("rss") val rss: Int,
    @get:JsonProperty("dss") val dss: Int,
    @get:JsonProperty("common_status") val common_status: Int,
    val events: Array<Int>,
    @get:JsonProperty("switch_status") val switch_status: Int,
    @get:JsonProperty("last_clean_t") val last_clean_t: Int
)

data class Response102(
    val id: String,
    val result: Array<Result> = emptyArray()
)