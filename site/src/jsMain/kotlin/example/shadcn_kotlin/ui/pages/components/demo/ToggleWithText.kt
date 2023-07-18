package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.Italic
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import shadcn.ui.components.Toggle
import web.cssom.ClassName

val ToggleWithText = FC<Props> {
    Toggle {
        ariaLabel = "Toggle italic"
        Italic { className = ClassName("m-2 h-4 w-4") }
        +"Italic"
    }
}