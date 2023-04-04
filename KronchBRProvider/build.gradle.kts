// use an integer for version numbers
version = 18


cloudstream {
    language = "pt"
    // All of these properties are optional, you can safely remove them

    description = "Com esta extensão poderá ver anime legendado/dublado disponível no catálogo."
    authors = listOf("Stormunblessed")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "Anime",
        "OVA",
    )

    iconUrl = "https://raw.githubusercontent.com/Stormunblessed/IPTV-CR-NIC/main/logos/kronch.png"
}
