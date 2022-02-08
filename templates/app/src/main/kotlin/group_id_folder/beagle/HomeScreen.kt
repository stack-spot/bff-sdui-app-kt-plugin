package {{project_group_id}}.beagle

import br.com.zup.beagle.ext.setStyle
import br.com.zup.beagle.widget.core.AlignItems
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.JustifyContent
import br.com.zup.beagle.widget.core.Size
import br.com.zup.beagle.widget.core.TextAlignment
import br.com.zup.beagle.widget.core.UnitValue
import br.com.zup.beagle.widget.layout.Column
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text

object HomeScreen : ScreenBuilder {

    override fun build() = Screen(
        child = Column(
            children = listOf(
                createImage(),
                createText()
            )
        ).setStyle {
            flex = Flex(
                alignItems = AlignItems.CENTER,
                justifyContent = JustifyContent.CENTER
            )
        }
    )

    private fun createText() = Text(
        text = "Hello World!",
        alignment = TextAlignment.CENTER,
        textColor = "#505050"
    ).setStyle {
        margin = EdgeValue(
            top = UnitValue.real(16)
        )
    }

    private fun createImage() = Image(
        path = ImagePath.Remote(
            remoteUrl = "https://i.ibb.co/rvRN9kv/logo.png"
        )
    ).setStyle {
        size = Size(
            width = UnitValue.real(244),
            height = UnitValue.real(225)
        )
    }
}
