/*
 * Bao Lab 2017
 */

package wormguides.models.subscenegeometry;

import static java.util.Objects.requireNonNull;

/**
 * Node in the structure tree (with headings)
 */
public class StructureTreeNode {

    /** True if the leaf node is a category heading, false otherwise */
    private final boolean isHeading;

    /**
     * Name shown on the tree node, whether it is a structure name on a leaf node or a category name on a parent node
     */
    private final String nodeText;

    /**
     * Constructure
     *
     * @param isCategory
     *         true if the tree node is a category heading, false otherwise
     * @param nodeText
     *         the value shown on the structure tree node, whether it is the category name or structure name
     */
    public StructureTreeNode(final boolean isCategory, final String nodeText) {
        this.isHeading = isCategory;
        this.nodeText = requireNonNull(nodeText);
    }

    /**
     * @return the text in the structure tree node
     */
    public String getText() {
        return nodeText;
    }

    /**
     * @return true if the node is a heading node (not a leaf node), false otherwise
     */
    public boolean isHeading() {
        return isHeading;
    }

    /**
     * @return true if the node is a leaf node (not a heading node), false otherwise
     */
    public boolean isLeafNode() {
        return !isHeading;
    }
}