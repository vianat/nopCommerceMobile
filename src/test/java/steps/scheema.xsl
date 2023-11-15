<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text"/>
    <xsl:strip-space elements="*"/>

    <xsl:template match="/root">
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="header">
        <xsl:value-of select="text()"/>
        <xsl:text>&#xa;</xsl:text>
        <xsl:text>&#xa;</xsl:text>
    </xsl:template>

    <xsl:template match="//*[@type='section']">
        <xsl:value-of select="name()"/>
        <xsl:text>(</xsl:text>
    <xsl:apply-templates/>
    <xsl:text>)</xsl:text>
    <xsl:text>&#xa;</xsl:text>
    </xsl:template>

    <xsl:template match="word">
        <xsl:value-of select="text()"/>
        <xsl:text> </xsl:text>
    </xsl:template>

    <xsl:template match="number">
        <xsl:value-of select="text()"/>
        <xsl:text> </xsl:text>
    </xsl:template>

    <xsl:template match="string">
        "<xsl:value-of select="text()"/>"
        <xsl:text> </xsl:text>
    </xsl:template>

    <xsl:template match="text()"/>
</xsl:stylesheet>