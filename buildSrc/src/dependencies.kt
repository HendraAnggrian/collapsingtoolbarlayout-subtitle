import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.plugin.use.PluginDependenciesSpec

fun DependencyHandler.android() = "com.android.tools.build:gradle:$VERSION_ANDROID_PLUGIN"
fun PluginDependenciesSpec.android(submodule: String) = id("com.android.$submodule")

fun DependencyHandler.support(
    repository: String,
    module: String = repository,
    version: String = VERSION_SUPPORT
) = "android.support.$repository:$module:$version"

fun DependencyHandler.hendraanggrian(
    repository: String,
    module: String = repository,
    version: String
) = "com.hendraanggrian.$repository:$module:$version"

fun DependencyHandler.jakeWharton(
    module: String,
    version: String
) = "com.jakewharton:$module:$version"

fun DependencyHandler.truth() = "com.google.truth:truth:$VERSION_TRUTH"

fun DependencyHandler.bintray() = "com.jfrog.bintray.gradle:gradle-bintray-plugin:$VERSION_BINTRAY"
inline val PluginDependenciesSpec.bintray get() = id("com.jfrog.bintray")

fun DependencyHandler.bintrayRelease() = "com.novoda:bintray-release:$VERSION_BINTRAY_RELEASE"
inline val PluginDependenciesSpec.`bintray-release` get() = id("com.novoda.bintray-release")
