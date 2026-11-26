Sodium - Minecraft Java 1.21.11 / Fabric

GitHub Actions builds the mod JAR. The resulting mod changes the LivingEntity.isBlocking
threshold from 5 ticks to 0 ticks.

IMPORTANT: This is a server-authoritative gameplay change. It works in singleplayer
(integrated server) and on multiplayer servers only when the server also has Sodium
installed. Installing it only on your client cannot change shield damage blocking on
an unmodified public server.

The project display name is Sodium. Its technical mod ID is sodium_shield to avoid
colliding with the separate Sodium performance mod's ID.
