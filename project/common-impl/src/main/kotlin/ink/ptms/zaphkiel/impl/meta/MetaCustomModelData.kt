package ink.ptms.zaphkiel.impl.meta

import ink.ptms.zaphkiel.item.meta.Meta
import org.bukkit.inventory.meta.ItemMeta
import taboolib.library.configuration.ConfigurationSection

@MetaKey("custom-model-data")
class MetaCustomModelData(root: ConfigurationSection) : Meta(root) {

    val data = root.getInt("meta.custom-model-data")

    override val id: String
        get() = "custom-model-data"

    override fun build(itemMeta: ItemMeta) {
        itemMeta.setCustomModelData(data)
    }

    override fun drop(itemMeta: ItemMeta) {
        itemMeta.setCustomModelData(null)
    }

    override fun toString(): String {
        return "MetaCustomModel(data=$data)"
    }
}