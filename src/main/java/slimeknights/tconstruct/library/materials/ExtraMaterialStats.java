package slimeknights.tconstruct.library.materials;

import com.google.common.collect.ImmutableList;

import java.util.List;

import slimeknights.tconstruct.library.Util;

public class ExtraMaterialStats extends AbstractMaterialStats {

  public final static String TYPE = "extra";

  public final static String LOC_Durability = "stat.extra_durability.name";

  public final static String LOC_DurabilityDesc = "stat.extra_durability.desc";

  public final int extraDurability; // usually between 0 and 500

  public ExtraMaterialStats(int extraDurability) {
    super(TYPE);
    this.extraDurability = extraDurability;
  }

  @Override
  public List<String> getLocalizedInfo() {
    return ImmutableList.of(HeadMaterialStats.formatDurability(extraDurability));
  }

  @Override
  public List<String> getLocalizedDesc() {
    return ImmutableList.of(Util.translate(LOC_DurabilityDesc));
  }

}