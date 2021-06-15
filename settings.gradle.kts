rootProject.name = "Demo Module"
include(
    ":app",
    ":buildScr",
    ":common",
    ":common:network",
    ":features:estimate",
    ":features:client",
    ":features:scheduling",
    ":features:services",
    ":features:vehicle",
    ":features:photo",
    ":features:compricing",
    ":features:service_hail",
    ":features:service_part",
    ":features:service_pdr"
)
include(":features:services_all")
