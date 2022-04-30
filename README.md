# kotlin-multiplatform
Just wanted to demo some kotlin multiplatform things

## KmmApp
following [the tutorial](https://play.kotlinlang.org/hands-on/Networking%20and%20Data%20Storage%20with%20Kotlin%20Multiplatfrom%20Mobile/01_Introduction) on a KMM app. I wrote this on windows so I never tested the iOS side.

### Things to note
- My version is more up to date than the tutorial. I got a lof of errors with the gradle sync. I think when working with shared libs in important to use the latest library releases.
- I changed the folder paths to make more sense to me (and hopefully you)
- The SpaceX api has been updated to v4 but I didn't use those endpoints
- Since I'm using ktor 2.0.1 the client code is different
- SQLDelight was a bit confusing for me so I'll do a writeup on it (TBD)
- The code is written without view extensions. No promise to update