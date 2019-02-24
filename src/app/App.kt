package app

import react.*
import react.dom.*
import logo.*
import ticker.*

@JsModule("src/rzut_opt_4.svg")
external val rzut: dynamic

@JsModule("jquery")
external val jq: dynamic

@JsModule("noh.js")
external val noh: dynamic

class App : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                +"Welcome to Reacccct with Kotlin"
            }
        }
        p("App-intro") {
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload."
        }
        p("App-ticker") {
            ticker()
        }

        p(classes = "experiment") {}

        div(classes = "office") {
//            img(src = rzut) {}
//            +"some office text"
            div(classes = "green room") {}
            div(classes = "yellow room") {}
            div(classes = "devs room") {}
            div(classes = "uis room") {}
            div(classes = "sales room") {}
            div(classes = "peoples room") {}
        }
    }

    override fun componentDidMount() {
//        console.log(noh)
//        console.log(jq)
        val ex = jq(".experiment")[0]
        console.log(ex)
        noh.h2("ExPeRiMeNT").attachToDOM(ex)
    }
}

fun RBuilder.app() = child(App::class) {}
