package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Input
import shadcn.ui.components.Label
import web.cssom.ClassName
import web.html.InputType

val InputWithLabel = FC<Props> {
    div {
        className = ClassName("grid w-full max-w-sm items-center gap-1.5")
        Label {
            htmlFor="email"
            + "Email"
        }
        Input {
            type = InputType.email
            id = "email"
            placeholder = "Email"
        }
    }
}