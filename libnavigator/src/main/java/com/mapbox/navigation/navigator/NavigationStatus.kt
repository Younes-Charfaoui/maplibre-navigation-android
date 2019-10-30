package com.mapbox.navigation.navigator

data class NavigationStatus(val routeState: RouteState, val location: FixLocation, val routeIndex: Int, val legIndex: Int, val remainingLegDistance: Float, val remainingLegDuration: Long, val stepIndex: Int, val remainingStepDistance: Float, val remainingStepDuration: Long, val voiceInstruction: VoiceInstruction?, val bannerInstruction: BannerInstruction?, val stateMessage: String, val inTunnel: Boolean, val predicted: Long, val shapeIndex: Int, val intersectionIndex: Int)