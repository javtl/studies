<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="text" encoding="UTF-8"/>
  
  <xsl:template match="/">
    {
      "library": [
        <xsl:for-each select="library/book">
          {
            "title": "<xsl:value-of select="title"/>",
            "author": "<xsl:value-of select="author"/>",
            "year": "<xsl:value-of select="year"/>"
          }
          <xsl:if test="position() &lt; last()">,</xsl:if>
        </xsl:for-each>
      ]
    }
  </xsl:template>
</xsl:stylesheet>
